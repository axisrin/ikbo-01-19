/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circletest;

import java.util.Scanner;
/**
 *
 * @author student
 */
public class CircleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Circle circle = new Circle(sc.nextDouble(),sc.next(),sc.next(),sc.next());
    System.out.println(circle.getColor());
    System.out.println(circle.getDiametr());
    System.out.println(circle.getHalf());
    System.out.println(circle.getLine());
    System.out.println(circle.getRadius());
    circle.setRadius(sc.nextDouble());
    System.out.println(circle.getRadius());
    circle.setDiametr(sc.nextDouble());
    System.out.println(circle.getDiametr());
    }
    
}
