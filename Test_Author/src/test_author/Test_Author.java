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
public class Test_Author {

    
    public static void main(String[] args) {
        Author at = new Author("Evgeniy","auth@eclipse.su",'M');
        System.out.println(at.getEmail());
        System.out.println(at.getGender());
        System.out.println(at.getName());
        at.setEmail("din-kodoro@gmail.com");
        System.out.println(at.getEmail());
        System.out.println(at.toString());
    }
    
}
