/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author heshanjayasinghe
 */
@Entity
@Table(name="Project")
public class Project {
    
    @Id
    @Column(name="p_id")
    @GeneratedValue
    private Integer Id;
    
    
    @Column(name="P_manager")
    private Integer manager;
    
    @Column(name="P_name")
    private String ProjectName;
   // @ManyToMany(fetch = FetchType.LAZY, mappedBy = "projects")
  //  private Set<Employee> employee = new HashSet<Employee>(0);

    public Project() {
    }

    public Project(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public Project(Integer manager, String ProjectName) {
        this.manager = manager;
        this.ProjectName = ProjectName;
    }

    public Project(Integer Id, Integer manager, String ProjectName) {
        this.Id = Id;
        
        this.manager = manager;
        this.ProjectName = ProjectName;
    }
//    public Project(Integer Id, Integer state, Integer manager, String ProjectName,Set<Employee> employee) {
//        this.Id = Id;
//        this.state = state;
//        this.manager = manager;
//        this.ProjectName = ProjectName;
//        this.employee=employee;
//    }
    
    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }


    /**
     * @return the manager
     */
    public Integer getManager() {
        return manager;
    }

    /**
     * @param manager the manager to set
     */
    public void setManager(Integer manager) {
        this.manager = manager;
    }

    /**
     * @return the ProjectName
     */
    public String getProjectName() {
        return ProjectName;
    }

    /**
     * @param ProjectName the ProjectName to set
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

//    /**
//     * @return the employee
//     */
//    public Set<Employee> getEmployee() {
//        return employee;
//    }
//
//    /**
//     * @param employee the employee to set
//     */
//    public void setEmployee(Set<Employee> employee) {
//        this.employee = employee;
//    }


   
    
}
