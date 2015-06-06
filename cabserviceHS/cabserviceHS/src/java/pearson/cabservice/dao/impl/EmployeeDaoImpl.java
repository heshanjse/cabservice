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
import pearson.cabservice.dao.EmployeeDAO;
import pearson.cabservice.dao.ProjectDAO;
import pearson.cabservice.model.Employee;
import pearson.cabservice.model.Project;

/**
 *
 * @author heshanjayasinghe
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDAO{
     
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void AddEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        this.sessionFactory.getCurrentSession().save(employee);  
    }
    
    @Override
    public Employee SearchEmployee(String username, String password) throws ClassNotFoundException, SQLException {
      List list=  this.sessionFactory.getCurrentSession().find("from employee where e_email="+username+" AND e_password="+password);
		return (Employee)list.get(0);
    }

//    @Override
//    public Employee SearchEmployee(Integer employeeId) throws ClassNotFoundException, SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
//    @Override
//    public int UpdateEmployee(Employee employee) throws ClassNotFoundException, SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void DeleteEmployee(Integer employeeId) throws ClassNotFoundException, SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Employee> SearchEmployeeList() throws ClassNotFoundException, SQLException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 
}
