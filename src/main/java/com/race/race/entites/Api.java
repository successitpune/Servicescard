package com.race.race.entites;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Entity
@Table(name="api")
public class Api {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    private String gender;
    private String first_Name;
    private String middle_Name;
    private String last_Name;
    private String address;
    private long phone_Number;
    private long aadhar_Number;
    private String services_List;
    private String company_Name;
    private String email_Id;
    private String service_Name;
    private String company_Description;
    private long pincode;
    private long experience;

    public Api(long id, String gender, String first_Name, String middle_Name, String last_Name, String address, long phone_Number, long aadhar_Number, String services_List, String company_Name, String email_Id, String service_Name, String company_Description, long pincode, long experience) {
        this.id = id;
        this.gender = gender;
        this.first_Name = first_Name;
        this.middle_Name = middle_Name;
        this.last_Name = last_Name;
        this.address = address;
        this.phone_Number = phone_Number;
        this.aadhar_Number = aadhar_Number;
       this.services_List = services_List;
     this.company_Name = company_Name;
     this.email_Id = email_Id;
       this.service_Name = service_Name;
      this.pincode = pincode;
        this.experience = experience;
    }

    public Api() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getMiddle_Name() {
        return middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.middle_Name = middle_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(long phone_Number) {
        this.phone_Number = phone_Number;
    }

    public long getAadhar_Number() {
        return aadhar_Number;
    }

    public void setAadhar_Number(long aadhar_Number) {
        this.aadhar_Number = aadhar_Number;
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

    public String getEmail_Id() {
        return email_Id;
    }

    public void setEmail_Id(String email_Id) {
        this.email_Id = email_Id;
    }

    public String getService_Name() {
        return service_Name;
    }

    public void setService_Name(String service_Name) {
        this.service_Name = service_Name;
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

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Api{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", first_Name='" + first_Name + '\'' +
                ", middle_Name='" + middle_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", address='" + address + '\'' +
                ", phone_Number=" + phone_Number +
                ", aadhar_Number=" + aadhar_Number +
               ", services_List='" + services_List + '\'' +
               ", company_Name='" + company_Name + '\'' +
               ", email_Id='" + email_Id + '\'' +
                ", service_Name='" + service_Name + '\'' +
                ", company_Description='" + company_Description + '\'' +
                ", pincode=" + pincode +
                ", experience=" + experience +
                '}';
    }
}


