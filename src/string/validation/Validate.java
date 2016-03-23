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
        return name.matches("^[\\\\p{L} .'-]+$");
    }
    
    public static boolean email(String email){
        return email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
    }
}
