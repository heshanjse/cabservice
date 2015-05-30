/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pearson.cabservice.dao.CabServiceDAO;
import pearson.cabservice.model.CabService;


/**
 *
 * @author heshanjayasinghe
 */
@Repository
public class CabServiceDaoImpl implements CabServiceDAO{
     
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void AddCabService(CabService cabservice) throws ClassNotFoundException, SQLException {
        System.out.println("dao ok");
    this.sessionFactory.getCurrentSession().save(cabservice);      
        System.out.println("hibernate ok");
    }

    @Override
    public CabService SearchCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int UpdateCabService(CabService cabservice) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void DeleteCabService(Integer cabserviceId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CabService> SearchCabServiceList() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
