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
public class Book {
    private String author;
    private double year;
    
    public Book()
    {
        author = "Puskin";
        year = 1817;
    }
    
    public Book(String authorB,double yearB)
    {
        author = authorB;
        year = yearB;
    }
    
    public void toStringB()
    {
        System.out.println("Author is " + author);
        System.out.println("Year is = " + year);
    }
}
