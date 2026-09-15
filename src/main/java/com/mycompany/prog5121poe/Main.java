/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Main {
    
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);   
       System.out.println("whatsapp regristration");
       
       System.out.print("please enter your firstname");
       String firstName = input.nextLine();
       
       System.out.print("please enter your lastname");
       String lastName = input.nextLine();
       
       System.out.print("please enter your username");
       String username = input.nextLine();
       
         System.out.print("please enter your password");
       String password = input.nextLine();
       
        System.out.print("please enter your SA cellphone number");
       String cellPhoneNumber = input.nextLine();
       
       Login user = new Login(
               firstName,
               lastName,
               username,
               password,
               cellPhoneNumber,
       
               
       
       System.out.println("Regristration is ongoing");
       
       System.out.println(user.registerUser());
       
       if (user.checkUserName(
           
           
               }
       
       
       
}

}
