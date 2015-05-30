/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author heshanjayasinghe
 */
public class CabRequest {
    int cabreqstid;
    Date time;
    Date requesttime;
    int pid;//show only loged persons projects
    Set<Employee> employee = new HashSet<Employee>(0);
    String From;
    String to;
    double Distance;
    
            
    
    
    
    
}
