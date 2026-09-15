/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog5121poe;

/**
 *
 * @author Student
 */
public class PhoneValidator {
   

    public boolean checkCellPhoneNumber(String cellPhoneNumber) {

        if (cellPhoneNumber != null
                && cellPhoneNumber.matches("^\\+27\\d{9}$")) {

            return true;

        } else {
            return false;
        }
    }
}
    

