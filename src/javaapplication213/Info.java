package javaapplication213;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Info implements Serializable
{
    private String Email , Password , firstName ,lastName ,  Gender;
    private int Age , ID;   
    protected final String CoachFileName = "Coach.bin" , MemberFileName = "Member.bin";
    
    
    public Info() {
    }

    public Info(int Age,String Email ,String firstName,String Gender, int ID,String lastName,String Password) 
    {
        this.Age = Age;
        this.Email = Email;
        this.firstName = firstName;
        this.Gender = Gender;
        this.ID = ID;
        this.lastName = lastName;
        this.Password = Password;    
    }
    
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) 
    {
        this.Password = Password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public abstract boolean Login(String Username , String Password);
}
