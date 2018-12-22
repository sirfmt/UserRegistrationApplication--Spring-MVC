package com.authxi.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private List<User> userData = new ArrayList<>(Arrays.asList(
        new User("Fortune","Farmer", 32, "password"),
        new User("George","Teacher", 28, "password1"),
        new User("Tendai","Lawyer", 24, "password2"),
        new User("Rakesh","Surgeon", 42, "password"),
        new User("Susan","Hairdresser", 28, "password1"),
        new User("Moman","Physician", 57, "password2")
    ));

    public List<User> getallUsers(){
        return userData;
    }

    //Return SingleUser by FirstName 
    public User getSingleUser(String name){
        return userData.stream().filter(t->t.getName().equals(name)).findFirst().get();
    }
    // Add User to the Database
    public void addUser(User user){
        userData.add(user);
    }
    // Delete a Users details through FirstName
    public void deleteUser(String name){

        try {
            for (int i = 0; i < userData.size() ; i++) {
                User t = userData.get(i);
                if(t.getName().equals(name)){
                    userData.remove(t);
                }
                else{
                    System.out.println("Sorry, not in Array");
                }
            }
        }
         catch (Exception e) {
            System.err.println(e);
        }
        
    }
    //Work in Progress ... 
	public String editUser(String name, User newUser) {
             return ( userData.stream().filter(t->t.getName().equals(name)).toString());
            
            	}
}
