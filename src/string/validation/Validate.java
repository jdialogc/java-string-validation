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
         //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) return true;
        //validating phone number with -, . or spaces
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
        //validating phone number with extension length from 3 to 5
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
        //validating phone number where area code is in braces ()
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
        //validating phone number with country code
        else return phoneNo.matches("^[+][0-9]{3}[0-9]{9}$");
        //return phoneNo.matches("^[+][0-9]{3}[0-9]{9}$") || phoneNo.matches("^[0-9]{10}$") || phoneNo.;
    }
}
