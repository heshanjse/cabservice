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
import pearson.cabservice.service.EmployeeService;
import pearson.cabservice.service.ProjectService;

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
       employeeDAO.addEmployee(employee);
    }

    @Override
    @Transactional
    public Employee searchEmployee(Integer employeeId) throws ClassNotFoundException, SQLException {
    return employeeDAO.searchEmployee(employeeId);
    }

    @Override
    @Transactional
    public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Integer employeeId) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public List<Employee> searchEmployeeList() throws ClassNotFoundException, SQLException {
        return employeeDAO.searchEmployeeList();
    }
    
    
}
