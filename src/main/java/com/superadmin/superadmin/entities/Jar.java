package com.superadmin.superadmin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Jar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String services_List;
    private String company_Name;
    private  String company_Description;
    private long pincode;
    private  String email_Id;

    public Jar() {
    }

    public Jar(Long id, String services_List, String company_Name, String company_Description, long pincode, String email_Id) {
        this.id = id;
        this.services_List = services_List;
        this.company_Name = company_Name;
        this.company_Description = company_Description;
        this.pincode = pincode;
        this.email_Id = email_Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServices_List() {
        return services_List;
    }

    public void setServices_List(String services_List) {
        this.services_List = services_List;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getCompany_Description() {
        return company_Description;
    }

    public void setCompany_Description(String company_Description) {
        this.company_Description = company_Description;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    @Override
    public String toString() {
        return "Jar{" +
                "id=" + id +
                ", services_List='" + services_List + '\'' +
                ", company_Name='" + company_Name + '\'' +
                ", company_Description='" + company_Description + '\'' +
                ", pincode=" + pincode +
                ", email_Id='" + email_Id + '\'' +
                '}';
    }
}
