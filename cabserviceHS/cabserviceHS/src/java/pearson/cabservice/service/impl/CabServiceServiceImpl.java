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
import pearson.cabservice.dao.EmployeeDAO;
import pearson.cabservice.dao.ProjectDAO;
import pearson.cabservice.model.Employee;
import pearson.cabservice.model.Project;
import pearson.cabservice.service.CabServiceService;
import pearson.cabservice.service.EmployeeService;
import pearson.cabservice.service.ProjectService;

/**
 *
 * @author heshanjayasinghe
 */

@Service
public class CabServiceServiceImpl implements CabServiceService{
    
    @Autowired
    private EmployeeDAO employeeDAO;



    
    
}
