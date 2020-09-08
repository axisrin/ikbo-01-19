/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circletest;

/**
 *
 * @author student
 */
public class Circle {
    private double radius;
    private String color;
    private String line;
    private String halfs;
    private double diametr;
    
    public Circle()
    {
        radius = 10;
        diametr = radius*2;
        color = "Red";
        line = "Clear";
        halfs = "Fullbody";
    }
    
     public Circle(double rC,String cC, String lC, String hC)
    {
        radius = rC;
        diametr = radius*2;
        color = cC;
        line = lC;
        halfs = hC;
    }
     
     public double getRadius()
     {
         return radius;
     }
     
     public double getDiametr()
     {
         return diametr;
     }
     
     public String getColor()
     {
         return color;
     }
     
      public String getLine()
     {
         return line;
     }
      
      public String getHalf()
     {
         return halfs;
     }
      
     public void setRadius(double rC)
     {
         radius = rC;
         diametr = 2*radius;
     }
     
      public void setDiametr(double dC)
     {
         diametr = dC;
         radius = diametr/2;
     }
     
     
}
