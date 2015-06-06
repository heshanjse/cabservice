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
import pearson.cabservice.model.Employee;
import pearson.cabservice.service.EmployeeService;

/**
 *
 * @author heshanjayasinghe
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException {
       employeeDAO.AddEmployee(employee);
    }

    @Override
    public Employee LoginEmployee(String username, String password) throws ClassNotFoundException, SQLException {
       return employeeDAO.SearchEmployee(username, password);
    }
    
    
}
