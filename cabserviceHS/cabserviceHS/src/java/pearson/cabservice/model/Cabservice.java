/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pearson.cabservice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author heshanjayasinghe
 */
@Entity
@Table(name = "CabService", catalog = "cabservices", uniqueConstraints = {
    @UniqueConstraint(columnNames = "cab_name"),
    @UniqueConstraint(columnNames = "cab_email"),
    @UniqueConstraint(columnNames = "rate_perkm"),
    @UniqueConstraint(columnNames = "initial_amount"),
    @UniqueConstraint(columnNames = "cab_phone")})
public class Cabservice implements java.io.Serializable {
    
    @Id
    @Column(name="idCabService")
    @GeneratedValue
    private Integer id;
    @Column(name="cab_name")
    private String name;
    @Column(name="cab_email")
    private String email;
    @Column(name="rate_perkm")
    private Double rate;
    @Column(name="initial_amount")
    private Double initical_amount;
    @Column(name="cab_phone")
    private String mobile;
   
    
    public Cabservice() {
    }

    public Cabservice(Integer id, String name, String email, Double rate, Double initical_amount, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.rate = rate;
        this.initical_amount = initical_amount;
        this.mobile = mobile;
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
     * @return the rate
     */
    public Double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(Double rate) {
        this.rate = rate;
    }

    /**
     * @return the initical_amount
     */
    public Double getInitical_amount() {
        return initical_amount;
    }

    /**
     * @param initical_amount the initical_amount to set
     */
    public void setInitical_amount(Double initical_amount) {
        this.initical_amount = initical_amount;
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

    
    

}
