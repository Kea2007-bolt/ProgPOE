/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

/**
 *
 * @author Student
 */
public class UsernameValidator {
    public boolean checkUserName(String username){
        if (username != null
                && username.contains("_")
                && username.length() <= 5){
            
            return true;
        }else{
            return false;
        }
    }
    
}
