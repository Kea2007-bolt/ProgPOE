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


    // Variables
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String cellPhoneNumber;

    // Constructor
    public Login(String firstName, String lastName,
                 String username, String password,
                 String cellPhoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    // Check username
    public boolean checkUserName() {

        if (username != null
                && username.contains("_")
                && username.length() <= 5) {

            return true;

        } else {

            return false;
        }
    }

    // Check password complexity
    public boolean checkPasswordComplexity() {

        if (password == null) {
            return false;
        }

        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        // Check every character in the password
        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasCapitalLetter = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialCharacter = true;
            }
        }

        // Check all password requirements
        if (password.length() >= 8
                && hasCapitalLetter
                && hasNumber
                && hasSpecialCharacter) {

            return true;

        } else {

            return false;
        }
    }

    // Check South African cell phone number
    public boolean checkCellPhoneNumber() {

        if (cellPhoneNumber != null
                && cellPhoneNumber.matches("^\\+27\\d{9}$")) {

            return true;

        } else {

            return false;
        }
    }

    // Register user
    public String registerUser() {

        if (!checkUserName()) {

            return "Username is not correctly formatted; "
                    + "please ensure that your username contains "
                    + "an underscore and is no more than five "
                    + "characters in length.";

        } else if (!checkPasswordComplexity()) {

            return "Password is not correctly formatted; "
                    + "please ensure that the password contains "
                    + "at least eight characters, a capital letter, "
                    + "a number, and a special character.";

        } else if (!checkCellPhoneNumber()) {

            return "Cell phone number is incorrectly formatted "
                    + "or does not contain international code.";

        } else {

            return "User registered successfully.";
        }
    }

    // Check login details
    public boolean loginUser(String enteredUsername,
                             String enteredPassword) {

        if (enteredUsername != null
                && enteredPassword != null
                && enteredUsername.equals(username)
                && enteredPassword.equals(password)) {

            return true;

        } else {

            return false;
        }
    }

    // Return login status
    public String returnLoginStatus(String enteredUsername,
                                    String enteredPassword) {

        if (loginUser(enteredUsername, enteredPassword)) {

            return "Welcome " + firstName + ", "
                    + lastName
                    + " it is great to see you again.";

        } else {

            return "Username or password incorrect, "
                    + "please try again.";
        }
    }
}


    
