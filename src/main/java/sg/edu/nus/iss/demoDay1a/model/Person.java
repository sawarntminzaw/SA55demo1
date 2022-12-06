package sg.edu.nus.iss.demoDay1a.model;

import java.util.*;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Person {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private String lastName;
    
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person (String firstName, String lastName){
        this.id=UUID.randomUUID().toString().substring(0,5);
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public Person (String id, String firstName, String lastName){

        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
