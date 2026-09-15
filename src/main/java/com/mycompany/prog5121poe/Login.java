/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

/**
 *
 * @author Student
 */
public class Login {

    public Login(String kyle, String smith, String kyl_1, String chsecke99, String string) {
    }

    boolean registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    



public class LoginTest {

    
    public void testUsernameCorrectlyFormatted() {

        Login user = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );


    }


    public void testUsernameIncorrectlyFormatted() {

        Login user = new Login(
                "Kyle",
                "Smith",
                "kyle!!!!!!",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        
    }





    
    public void testLoginSuccessful() {

        Login user = new Login(
                "Kyle",
                "Smith",
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

    
           
    }
}
    
}
