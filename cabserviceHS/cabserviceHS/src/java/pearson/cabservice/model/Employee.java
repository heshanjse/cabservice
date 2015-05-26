/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.model;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author heshanjayasinghe
 */
@Entity
@Table(name = "employee", catalog = "cabservices", uniqueConstraints = {
    @UniqueConstraint(columnNames = "e_name"),
    @UniqueConstraint(columnNames = "e_email"),
    @UniqueConstraint(columnNames = "e_password"),
    @UniqueConstraint(columnNames = "e_type"),
    @UniqueConstraint(columnNames = "e_mobile"),
    @UniqueConstraint(columnNames = "e_location")})
public class Employee implements java.io.Serializable {
    
    @Id
    @Column(name="idemployee")
    @GeneratedValue
    private Integer id;
    @Column(name="e_name")
    private String name;
    @Column(name="e_email")
    private String email;
    @Column(name="e_password")
    private String password;
    @Column(name="e_type")
    private String usertype;
    @Column(name="e_mobile")
    private String mobile;
    @Column(name="e_location")
    private String location;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "project_has_employee", catalog = "cabservices", joinColumns = { 
			@JoinColumn(name = "idemployee", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "idproject", 
					nullable = false, updatable = false) })
    private Set<Project> projects = new HashSet<Project>(0);

    public Employee() {
    }

    public Employee(Integer id, String name, String email, String password, String usertype, String mobile, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
        this.mobile = mobile;
        this.location = location;
    }

    public Employee(Integer id, String name, String email, String password, String usertype, String mobile, String location, Set<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.usertype = usertype;
        this.mobile = mobile;
        this.location = location;
        this.projects = projects;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the usertype
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype the usertype to set
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the projects
     */
    public Set<Project> getProjects() {
        return projects;
    }

    /**
     * @param projects the projects to set
     */
    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

}
