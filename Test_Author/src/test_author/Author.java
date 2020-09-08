/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_author;

/**
 *
 * @author student
 */
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String nameA, String emailA, char genderA)
    {
        name = nameA;
        email = emailA;
        gender = genderA;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail ()
    {
        return email;
    }
    
    public void setEmail(String emailA)
    {
        email = emailA;
    }
    
    public char getGender()
    {
        return gender;
    }
    
    public String toString()
    {
        return "copyright by Author";
    }
    
    
}
