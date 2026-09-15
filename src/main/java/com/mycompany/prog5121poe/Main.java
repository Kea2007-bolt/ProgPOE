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
    


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Heading
        System.out.println("================================================");
        System.out.println("                  CHAT APP");
        System.out.println("================================================");
        System.out.println();

        // Registration
        System.out.println("              CREATE ACCOUNT");
        System.out.println();

        System.out.print("First Name       : ");
        String firstName = input.nextLine();

        System.out.print("Last Name        : ");
        String lastName = input.nextLine();

        System.out.print("Username         : ");
        String username = input.nextLine();

        System.out.print("Password         : ");
        String password = input.nextLine();

        System.out.print("Cell Phone       : ");
        String cellPhoneNumber = input.nextLine();

        // Create Login object
        Login user = new Login(
                firstName,
                lastName,
                username,
                password,
                cellPhoneNumber
        );

        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("             REGISTRATION RESULTS");
        System.out.println("------------------------------------------------");
        System.out.println();

        // Check username
        boolean usernameCorrect = user.checkUserName();

        if (usernameCorrect) {

            System.out.println(
                    "Username successfully captured."
            );

        } else {

            System.out.println(
                    "Username is not correctly formatted; "
                    + "please ensure that your username contains "
                    + "an underscore and is no more than five "
                    + "characters in length."
            );
        }

        // Check password
        boolean passwordCorrect =
                user.checkPasswordComplexity();

        if (passwordCorrect) {

            System.out.println(
                    "Password successfully captured."
            );

        } else {

            System.out.println(
                    "Password is not correctly formatted; "
                    + "please ensure that the password contains "
                    + "at least eight characters, a capital letter, "
                    + "a number, and a special character."
            );
        }

        // Check cell phone
        boolean phoneCorrect =
                user.checkCellPhoneNumber();

        if (phoneCorrect) {

            System.out.println(
                    "Cell phone number successfully added."
            );

        } else {

            System.out.println(
                    "Cell phone number incorrectly formatted "
                    + "or does not contain international code."
            );
        }

        System.out.println();

        // Check if all registration details are correct
        if (usernameCorrect
                && passwordCorrect
                && phoneCorrect) {

            System.out.println(
                    "User registered successfully."
            );

            System.out.println();
            System.out.println("================================================");
            System.out.println("                    LOGIN");
            System.out.println("================================================");
            System.out.println();

            // Login
            System.out.print("Username         : ");
            String loginUsername = input.nextLine();

            System.out.print("Password         : ");
            String loginPassword = input.nextLine();

            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();

            boolean loginSuccessful =
                    user.loginUser(
                            loginUsername,
                            loginPassword
                    );

            if (loginSuccessful) {

                System.out.println(
                        user.returnLoginStatus(
                                loginUsername,
                                loginPassword
                        )
                );

                System.out.println();
                System.out.println("================================================");
                System.out.println("              LOGIN SUCCESSFUL");
                System.out.println("================================================");

            } else {

                System.out.println(
                        "Username or password incorrect, "
                        + "please try again."
                );

                System.out.println();
                System.out.println("================================================");
                System.out.println("                LOGIN FAILED");
                System.out.println("================================================");
            }

        } else {

            System.out.println(
                    "Registration failed. "
                    + "Please correct your details."
            );
        }

        input.close();
    }
}