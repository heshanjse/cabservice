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
    
    @Column(name="P_name")
    private String ProjectName;
    
    @Column(name="P_description")
    private String ProjectDescription;

    @Column(name="P_manager")
    private Integer manager;
    
    
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "projects")
    private Set<Employee> employee = new HashSet<Employee>(0);

    public Project() {
    }

    public Project(Integer Id, String ProjectName, String ProjectDescription, Integer manager) {
        this.Id = Id;
        this.ProjectName = ProjectName;
        this.ProjectDescription = ProjectDescription;
        this.manager = manager;
    }

    
    
    
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

    /**
     * @return the employee
     */
    public Set<Employee> getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    /**
     * @return the ProjectDescription
     */
    public String getProjectDescription() {
        return ProjectDescription;
    }

    /**
     * @param ProjectDescription the ProjectDescription to set
     */
    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    
   
    
}
