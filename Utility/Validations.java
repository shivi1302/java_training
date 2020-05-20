/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author DELL
 */
public class Validations {
    public static boolean isEmpty(String value){
        if(value!=null){
           return value.trim().isEmpty();
        }else
            return false;
    }
    public static boolean isInteger(String value){
        try{
        if(value!=null){
         Integer.parseInt(value.trim());
        }
        }catch(NumberFormatException ex){}
            return false;
    }
    public static boolean isFloat(String value){
        try{
        if(value!=null){
         Float.parseFloat(value.trim());
        }
        }catch(NumberFormatException ex){}
            return false;
    }
    public static boolean onlyLetterAndSpace(String value){
        if(value!=null){
            value=value.trim();
            for(int i=0;i<value.length();i++){
                char ch=value.charAt(i);
                if(Character.isLetter(ch)||Character.isWhitespace(ch)){
                    
                }else
                    return false;
            }
            return true;
        }
        return false;
    }
}
