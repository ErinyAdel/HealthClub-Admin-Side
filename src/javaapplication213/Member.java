package javaapplication213;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Member extends Admin implements Serializable
{
    private double Height , Weight;
    private int CoachID = 0;
    
    public Member() {
    }
    
    public Member(String Email ,int ID,String Password, String firstName, String lastName, 
                  String Gender, int Age , double Height, double Weight , int CoachID) 
    {
        super(Age,Email,firstName,Gender,ID,lastName,Password);
        this.Height = Height;
        this.Weight = Weight;
        this.CoachID = CoachID;
    }
    
    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public int getCoachID() {
        return CoachID;
    }

    public void setCoachID(int CoachID) {
        this.CoachID = CoachID;
    }
    
    public double BMI()
    {
        double BMI;
        BMI = (float) (this.Weight / (this.Height/100 * this.Height/100));
        System.out.printf("BMI = %.1f\t ====\t",BMI);
        
        if(BMI < 18.5)
            System.out.print("Underweight\n");
        else if(BMI>=18.5 && BMI<=24.9)
            System.out.print("Normal Weight\n");
        else if(BMI>=25 && BMI<29.9)
            System.out.print("Overweigh\n");
        else if(BMI>=30)
            System.out.print("Obesity\n");
        
        return BMI;
    }
             
    @Override
    public boolean Login(String Username, String Password) 
    {
        return getEmail().equals(Username) && getPassword().equals(Password);
    }
        
}
