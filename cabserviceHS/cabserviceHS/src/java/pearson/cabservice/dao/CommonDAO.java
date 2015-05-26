/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pearson.cabservice.util.HibernateUtil;

/**
 *
 * @author Kaushalya
 */
public class CommonDAO {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
//add object to DB
 public static void insertObject(Object object){
    
          SessionFactory factory=HibernateUtil.getSessionFactory();
          Session session=factory.openSession();
          Transaction transaction=null;
          
     try {      
      transaction=session.beginTransaction();
      session.save(object);   
      transaction.commit();
        } 
     catch (HibernateException e) {
            transaction.rollback();
        }
     finally{
     session.close();
     }    
 }
//add object to DB     
 
 
 
 //select all according to query
  public static List<Object> getAllOrderItems(String query){
 
      List<Object> objectList = null;
     
     List<Object> objectitems=null;
     SessionFactory factory=HibernateUtil.getSessionFactory();
     Session session=factory.openSession();
     Transaction transaction=null;
     try {      
      transaction=session.beginTransaction();
      String hql=query;
      
      objectitems= session.createQuery(hql).list();  
      transaction.commit();
        } 
     catch (HibernateException e) {
            transaction.rollback();
        }
     finally{
     session.close();
     }  
  //objectList = FXCollections.observableList(objectitems); 
  //System.out.println(objectList);
  return objectList;   
  } 
 //select all according to query  
    
  
  
//update any object
 public static void updateObject(Object object){
  SessionFactory factory=HibernateUtil.getSessionFactory();
          Session session=factory.openSession();
          Transaction transaction=null;
     try {      
      transaction=session.beginTransaction();
      session.update(object);   
      transaction.commit();
        } 
     
     catch (HibernateException e) {
            transaction.rollback();
        }
     finally{
     session.close();
     
     }
 
 }  
 
 
 //delete any object
 public static void deleteObject(Object object){
  SessionFactory factory=HibernateUtil.getSessionFactory();
          Session session=factory.openSession();
          Transaction transaction=null;
     try {      
      transaction=session.beginTransaction();
      session.delete(object);   
      transaction.commit();
        } 
     
     catch (HibernateException e) {
            transaction.rollback();
        }
     finally{
     session.close();
     
     }
 
 }  
  
 
 //delete all object
 public static void deleteAllObject(String date){
  SessionFactory factory=HibernateUtil.getSessionFactory();
          Session session=factory.openSession();
          Transaction transaction=null;
     try {      
      transaction=session.beginTransaction();
      Query q = session.createQuery("delete Dailycollection where date = '"+date+"'");
      q.executeUpdate();   
      transaction.commit();
        } 
     
     catch (HibernateException e) {
            transaction.rollback();
        }
     finally{
     session.close();
     
     }
 
 } 
 
 
}

    

