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
import pearson.cabservice.dao.ProjectDAO;
import pearson.cabservice.model.Project;

/**
 *
 * @author heshanjayasinghe
 */
@Repository
public class ProjectDaoImpl implements ProjectDAO{
     
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addProject(Project project) throws ClassNotFoundException, SQLException {
       this.sessionFactory.getCurrentSession().save(project); 
    }

    @Override
    public Project searchProject(Integer projectId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateProject(Project project) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteProject(Integer projectId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Project> searchProjectList() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
