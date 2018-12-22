package com.authxi.app;

public class User{

    private String Name;
    private String Profession;
    private int Age;
    private String password;
    
    public String getName() {
        return this.Name;
    }

    public String getProfession() {
        return this.Profession;
    }

    public int getAge() {
        return this.Age;
    }

    public String getPasswd() {
        return this.password;
    }

    public void setName(String name) {
        this.Name = name;
    }
 
    public void setAge(int age) {
        this.Age = age;
    }
   
    public void setProf(String prof) {
        this.Profession = prof;
    }
   
    public void setPassword(String password) {
        this.password = password;
    }
    public User(){

    }
    public User( String name, String prof, int age, String passwd){
        this.Name = name;
        this.Profession =prof;
        this.Age = age;
        this.password = passwd;
    }

}