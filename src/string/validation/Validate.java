/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.validation;

/**
 *
 * @author jdialog
 */
public final class Validate{
    /**
    * used to validate Names
    * @param name Name to be validated
    * @return returns true if it is a valid Name or false otherwise
    */
    public static boolean name(String name){
        return name.matches("^[\\p{L} .'-]+$");
    }
    /**
    *Returns true if the supplied parameter is a valid email address
    * @param email address to be validated
    * @return returns true if it is a valid email address or false otherwise
    */
    public static boolean email(String email){
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
    /**
    * used to validate phone numbers i.e. 0712345678, +254712345678, 071-234-5678, 071.234.5678
    * @param phoneNo phone number to be validated
    * @return returns true if it is a valid phone number or false otherwise
    */
    public static boolean phoneNumber(String phoneNo){
        return phoneNo.matches("^[+][0-9]{3}[0-9]{9}|\\d{10}|\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}|\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}|\\(\\d{3}\\)-\\d{3}-\\d{4}$");
    }
    /**
    * used to validate passport numbers
    * @param passNo passport number to be validated
    * @return returns true if it is a valid passport number or false otherwise
    */
    public static boolean passportNumber(String passNo){
        return passNo.matches("^\\d{7}|\\d{8}|\\d{9}$");
    }
}
