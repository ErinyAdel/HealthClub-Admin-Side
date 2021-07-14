package javaapplication213;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Coach extends Admin implements Serializable
{
    private double Salary;
    private int numOfMembers = 0;
       
    public Coach() {
    }
    
    public Coach(String Email, String Password, String firstName, String lastName , 
                                                String Gender , int Age , int ID , double Salary , int numOfMembers)
    {
        super(Age,Email,firstName,Gender,ID,lastName,Password);
        this.Salary = Salary;
        this.numOfMembers = numOfMembers;
    }
    
    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }    

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }
    
    @Override
    public boolean Login(String Username, String Password) 
    {
        return getEmail().equals(Username) && getPassword().equals(Password);
    }
    
}
