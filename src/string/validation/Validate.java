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
    
    public static boolean name(String name){
        return name.matches("^[\\p{L} .'-]+$");
    }
    
    public static boolean email(String email){
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
    
    public static boolean phoneNumber(String phoneNo){
        return phoneNo.matches("^[+][0-9]{3}[0-9]{9}|\\d{10}|\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}|\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}|\\(\\d{3}\\)-\\d{3}-\\d{4}$");
    }
}
