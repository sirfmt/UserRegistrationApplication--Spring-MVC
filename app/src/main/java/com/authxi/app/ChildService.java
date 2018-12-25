package com.authxi.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ChildService{

    private List<Child> childData = new ArrayList<>(Arrays.asList(
        new Child("Fortune","Munoda", 112432, "Joyful","Harare" ),
        new Child("George","Chisvo", 556428, "Farai", "Gweru")
    ));

    public List<Child> getRecords(){
        return childData;
    }

    //Return SingleChild by FirstName 
    public Child getSingleChild(String name){
        return childData.stream().filter(t->t.getFirstName().equals(name)).findFirst().get();
    }

    // Add Child to the Database
    public void addChild(Child child){
        childData.add(child);
    }

    // Delete a Users details through FirstName
    public void deleteChild(String name){
        try {
            for (int i = 0; i < childData.size() ; i++) {
                Child t = childData.get(i);
                if(t.getFirstName().equals(name)){
                    childData.remove(t);
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

	public void editChild(String name, Child newChild) {
           
                   for (int i =0; i < childData.size(); i++ ) {
                        Child t = childData.get(i);
                         if(t.getFirstName().equals(name)){
                             System.out.println(t.getFirstName());
                            childData.set(i, newChild);
                         }
                   } 
            	}
}
