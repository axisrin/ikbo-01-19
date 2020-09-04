/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_lab_proshin;

/**
 *
 * @author Asus
 */
public class Dog {
    private double height;
    private double age;
    private String name;
    
    public Dog()
    {
        height = 15;
        age = 1;
        name = "Chi-Cho";
    }
    
    public Dog(double heD,double ageD,String nameD)
    {
        height = heD;
        age = ageD;
        name = nameD;
    }
    
    public void toStringD()
    {
     System.out.println("Height is = " + height);
     System.out.println("Age is = " + age);
     System.out.println("Name is " + name);
    }
    
}
