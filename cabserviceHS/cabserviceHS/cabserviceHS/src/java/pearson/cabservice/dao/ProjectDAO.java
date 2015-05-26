/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao;

import java.sql.SQLException;
import java.util.List;
import pearson.cabservice.model.Project;

/**
 *
 * @author heshanjayasinghe
 */
public interface ProjectDAO {
     public void addProject(Project project) throws ClassNotFoundException, SQLException;

    public Project searchProject(Integer projectId) throws ClassNotFoundException, SQLException;

    public int updateProject(Project project) throws ClassNotFoundException, SQLException;

    public void deleteProject(Integer projectId) throws ClassNotFoundException, SQLException;

    public List<Project> searchProjectList() throws ClassNotFoundException, SQLException;
}
