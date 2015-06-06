/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao;

import java.sql.SQLException;
import java.util.List;
import pearson.cabservice.model.Employee;

/**
 *
 * @author heshanjayasinghe
 */
public interface EmployeeDAO {

    public void AddEmployee(Employee employee) throws ClassNotFoundException, SQLException;
    
    public Employee SearchEmployee(String username, String password) throws ClassNotFoundException, SQLException;

 //   public Employee SearchEmployee(Integer employeeId) throws ClassNotFoundException, SQLException;

//    public int UpdateEmployee(Employee employee) throws ClassNotFoundException, SQLException;
//
//    public void DeleteEmployee(Integer employeeId) throws ClassNotFoundException, SQLException;
//
//    public List<Employee> SearchEmployeeList() throws ClassNotFoundException, SQLException;

    
}
