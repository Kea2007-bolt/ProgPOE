/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog5121poe;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class PROG5121POE {
 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("              PROG5121POE CHAT APP");
        System.out.println("================================================");
        System.out.println();

        // ==============================
        // REGISTRATION
        // ==============================

        System.out.println("              CREATE ACCOUNT");
        System.out.println();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter South African cell phone number: ");
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
                    "Username is not correctly formatted."
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
                    "Password is not correctly formatted."
            );
        }

        // Check cellphone number
        boolean phoneCorrect =
                user.checkCellPhoneNumber();

        if (phoneCorrect) {

            System.out.println(
                    "Cell phone number successfully added."
            );

        } else {

            System.out.println(
                    "Cell phone number is incorrectly formatted."
            );
        }

        System.out.println();

        // Check if all details are correct
        if (usernameCorrect
                && passwordCorrect
                && phoneCorrect) {

            System.out.println(
                    user.registerUser()
            );

            System.out.println();
            System.out.println("================================================");
            System.out.println("                     LOGIN");
            System.out.println("================================================");
            System.out.println();

            // ==============================
            // LOGIN
            // ==============================

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

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
                        user.returnLoginStatus(
                                loginUsername,
                                loginPassword
                        )
                );

                System.out.println();
                System.out.println("================================================");
                System.out.println("                LOGIN FAILED");
                System.out.println("================================================");
            }

        } else {

            System.out.println(
                    "Registration failed."
            );

            System.out.println(
                    "Please correct your details and try again."
            );
        }

        input.close();
    }
}

    

