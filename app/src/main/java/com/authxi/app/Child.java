package com.authxi.app;

//import java.util.GregorianCalendar;

public class Child {

    private String FirstName;
    private String Surname;
    private int parentID;
    private String ParentName;
   /* private int[] dobData;
    private GregorianCalendar DateOfBirth;*/
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
    
    public void setParentID(int id) {
        this.parentID = id;
    }
   
    public String getParentName() {
        return this.ParentName;
    }

    public void setFirstName(String name) {
        this.FirstName = name;
    }
 
    public void setSurname(String surname) {
        this.Surname = surname;
    }
   
    public void setParentName(String parentName) {
        this.ParentName = parentName;
    }

    public String getPlaceOfBirth() {
        return this.PlaceOfBirth;
    }
    
   /* public GregorianCalendar getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(int[] dobData) {
        // Create Gregorian Date Object
        this.DateOfBirth = new GregorianCalendar(dobData[0], dobData[1], dobData[2]);   
    }*/

    public void setPlaceOfBirth(String placeOfBirth) {
        this.PlaceOfBirth = placeOfBirth;
    }

    public Child(){   
    }

    public Child( String name, String surname, int id, String parentName, String pob){
        this.FirstName = name;
        this.Surname = surname;
        this.parentID = id;
        this.ParentName = parentName;
       // this.dobData = dobData;
        this.PlaceOfBirth = pob;
    }

}