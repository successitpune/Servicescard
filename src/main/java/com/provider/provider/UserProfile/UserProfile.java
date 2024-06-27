package com.provider.provider.UserProfile;

import jakarta.persistence.*;

import java.util.Arrays;

@Entity
public class UserProfile {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

    private String gender;
    private String firstname;
    private String middlename;
    private String lastname;
    private String address;
    private long phonenumber;
    private long aadharnumber;
    private String serviceslist;
    private String companyname;

    private String emailid;

    private String servicename;
    private String companydescription;
    private long pincode;
    private long experience;

    @Lob
    private byte[] profilephoto;

    @Lob
    private byte[] adharphoto;
    @Lob
    private byte[] panphoto;

    // Getters and Setters


    public UserProfile() {
    }

    public UserProfile(long id, String gender, String firstname, String middlename, String lastname, String address, long phonenumber, long aadharnumber, String serviceslist, String companyname, String emailid, String servicename, String companydescription, long pincode, long experience, byte[] profilephoto, byte[] adharphoto, byte[] panphoto) {
        this.id = id;
        this.gender = gender;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.phonenumber = phonenumber;
        this.aadharnumber = aadharnumber;
        this.serviceslist = serviceslist;
        this.companyname = companyname;
        this.emailid = emailid;
        this.servicename = servicename;
        this.companydescription = companydescription;
        this.pincode = pincode;
        this.experience = experience;
        this.profilephoto = profilephoto;
        this.adharphoto = adharphoto;
        this.panphoto = panphoto;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(long aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public String getServiceslist() {
        return serviceslist;
    }

    public void setServiceslist(String serviceslist) {
        this.serviceslist = serviceslist;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getCompanydescription() {
        return companydescription;
    }

    public void setCompanydescription(String companydescription) {
        this.companydescription = companydescription;
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

    public byte[] getProfilephoto() {
        return profilephoto;
    }

    public void setProfilephoto(byte[] profilephoto) {
        this.profilephoto = profilephoto;
    }

    public byte[] getAdharphoto() {
        return adharphoto;
    }

    public void setAdharphoto(byte[] adharphoto) {
        this.adharphoto = adharphoto;
    }

    public byte[] getPanphoto() {
        return panphoto;
    }

    public void setPanphoto(byte[] panphoto) {
        this.panphoto = panphoto;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber=" + phonenumber +
                ", aadharnumber=" + aadharnumber +
                ", serviceslist='" + serviceslist + '\'' +
                ", companyname='" + companyname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", servicename='" + servicename + '\'' +
                ", companydescription='" + companydescription + '\'' +
                ", pincode=" + pincode +
                ", experience=" + experience +
                ", profilephoto=" + Arrays.toString(profilephoto) +
                ", adharphoto=" + Arrays.toString(adharphoto) +
                ", panphoto=" + Arrays.toString(panphoto) +
                '}';
    }
}


