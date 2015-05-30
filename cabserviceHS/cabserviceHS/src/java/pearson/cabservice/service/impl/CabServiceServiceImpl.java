/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.service.impl;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pearson.cabservice.dao.CabServiceDAO;
import pearson.cabservice.model.CabService;
import pearson.cabservice.service.CabServiceService;
/**
 *
 * @author heshanjayasinghe
 */

@Service
public class CabServiceServiceImpl implements CabServiceService{
    
    @Autowired
    private CabServiceDAO cabserviceDAO;

    @Override
    public void AddCabService(CabService cabservice) throws ClassNotFoundException, SQLException {
        System.out.println("service ok");
        cabserviceDAO.AddCabService(cabservice);
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
