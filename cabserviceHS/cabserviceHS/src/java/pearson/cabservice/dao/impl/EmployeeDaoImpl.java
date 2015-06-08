/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao.impl;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import static org.jboss.weld.Container.currentId;
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
public class EmployeeDaoImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void AddEmployee(Employee employee) throws ClassNotFoundException, SQLException {
        this.sessionFactory.getCurrentSession().save(employee);

//        List list=  this.sessionFactory.getCurrentSession().find("from employee where e_email=hhkk AND e_password=hkh");
//		Employee employeee=  (Employee)list.get(0);
//                System.out.println(employeee.getName());
    }

    @Override
    public Employee SearchEmployee(String username, String password) throws ClassNotFoundException, SQLException {
        
       Criteria criteria=sessionFactory.openSession().createCriteria(Employee.class);
       criteria.add(Restrictions.eq("email", username));
        criteria.add(Restrictions.eq("password", password));
        return (Employee) criteria.uniqueResult();

        /* Criteria criteria = sessionFactory.openSession().createCriteria(Employee.class);

         criteria.add(Restrictions.eq("e_email", "hhkk"));

         Employee employee = (Employee)criteria.uniqueResult();
         System.out.println(""+employee.getName());
         return currentLandEntity;*/
//        Session session = sessionFactory.openSession();
//        Transaction tx = null;
//        try {
//            tx = session.beginTransaction();
//            Criteria cr = session.createCriteria(Employee.class);
//            System.out.println("ok1");
//            // Add restriction.
//           // cr.add(Restrictions.eq("e_email", "hhkk"));
//           // cr.add(Restrictions.eq("e_password", "hkh"));
//            List employees = cr.list();
//            System.out.println("ok2");
//            for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
//                Employee employeeee = (Employee) iterator.next();
//                System.out.print("First Name: " + employeeee.getName());
//                System.out.println("ok3");
//            }
//            tx.commit();
//        } catch (HibernateException e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        List list = this.sessionFactory.getCurrentSession().find("from employee where e_email=hhkk AND e_password=hkh");
//        return (Employee) list.get(0);
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
    @Override
    public List<Employee> SearchEmployeeList() throws ClassNotFoundException, SQLException {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Employee.class);
        criteria.setMaxResults(10);//optionally set max return rows.       
        return criteria.list();//To change body of generated methods, choose Tools | Templates.
    }

    public String testEmployee() throws ClassNotFoundException, SQLException {
   //  sessionFactory.getCurrentSession().get(Employee.class, id);
        //criteria.setMaxResults(10);//optionally set max return rows.       
        Employee employee = (Employee) sessionFactory.getCurrentSession().get(Employee.class, 1);
        System.out.println(employee.getEmail() + "");
        return "elz";
    }
}
