/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.service;

import java.sql.SQLException;
import java.util.List;
import pearson.cabservice.model.Employee;


/**
 *
 * @author heshanjayasinghe
 */
public interface EmployeeService {
    public void addEmployee(Employee employee) throws ClassNotFoundException, SQLException;

    public Employee searchEmployee(Integer employeeId) throws ClassNotFoundException, SQLException;

    public int updateEmployee(Employee employee) throws ClassNotFoundException, SQLException;

    public void deleteEmployee(Integer employeeId) throws ClassNotFoundException, SQLException;

    public List<Employee> searchEmployeeList() throws ClassNotFoundException, SQLException;
}
