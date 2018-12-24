package com.authxi.app;

import java.util.Date;

public class Child {

    private String FirstName;
    private String Surname;
    private int parentID;
    private String ParentName;
    private Date DateOfBirth;
    private String PlaceOfBirth;

    
    public String getFirstName() {
        return this.FirstName;
    }

    public String getSurname() {
        return this.Surname;
    }

    public int getParentID() {
        return this.parentID;
    }

    public String getParentName() {
        return this.ParentName;
    }

    public void setFirstName(String name) {
        this.FirstName = name;
    }
 
    public void setAge(int id) {
        this.parentID = id;
    }
   
    public void setSurname(String surname) {
        this.Surname = surname;
    }
   
    public void setParentName(String parentName) {
        this.ParentName = parentName;
    }

    public Date getDateOfBirth() {
        return this.DateOfBirth;
    }

    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.PlaceOfBirth = placeOfBirth;
    }

    public Child(){
        
    }
    public Child( String name, String surname, int id, String parentName){
        this.FirstName = name;
        this.Surname = surname;
        this.parentID = id;
        this.ParentName = parentName;
    }

}