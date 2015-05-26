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
import org.springframework.transaction.annotation.Transactional;
import pearson.cabservice.dao.ProjectDAO;
import pearson.cabservice.model.Project;
import pearson.cabservice.service.ProjectService;

/**
 *
 * @author heshanjayasinghe
 */
@Service
public class ProjectServiceImpl implements ProjectService{
    
    @Autowired
    private ProjectDAO projectDAO;
    
    @Override
    @Transactional
    public void addProject(Project project) throws ClassNotFoundException, SQLException {
       projectDAO.addProject(project);
    }

    @Override
    @Transactional
    public Project searchProject(Integer projectId) throws ClassNotFoundException, SQLException {
       return projectDAO.searchProject(projectId);
    }

    @Override
    @Transactional
    public int updateProject(Project project) throws ClassNotFoundException, SQLException {
        return projectDAO.updateProject(project);
    }

    @Override
    @Transactional
    public void deleteProject(Integer projectId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    @Transactional
//    public List<Project> searchProjectList() throws ClassNotFoundException, SQLException {
//         return projectDAO.searchProjectList();
//    }

    @Override
    public List<Project> searchProjectList() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
