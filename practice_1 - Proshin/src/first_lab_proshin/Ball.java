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
public class Ball {
private String color;
private double radius;

public Ball(String colorB,double radiusB)
{
    color = colorB;
    radius = radiusB;
}

public Ball()
{
    color = "White";
    radius = 8.5;
}

public void toStringB()
{
    System.out.println("Ball color is " + color);
    System.out.println("Radius is = " + radius);
}
}
