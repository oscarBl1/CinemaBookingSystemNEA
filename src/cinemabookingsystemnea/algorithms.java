package cinemabookingsystemnea;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class algorithms {

    public static boolean emailCheck(String emailAddress) {
        boolean emailValid;
        String regex = "^[a-zA-Z0-9+_.]+@(.+)+.(.+)$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(emailAddress);
        emailValid = matcher.matches();

        return emailValid;
    }
    
    public static boolean commonPass(String password){
        boolean strongPassword = true;
        String[] commonPassword = {"password", "123", "321", "pass", "abc", "xyz"};
        for(int i = 0; i < commonPassword.length; i++){
            if(password.contains(commonPassword[i]) || password.length() <=8){
                strongPassword = false;
                break;
            }
        }
        return strongPassword;
    }
    
    public static boolean notNull(String wordToCheck){
        boolean notNull = false;
        if(wordToCheck.length()==0){
           notNull = false; 
        }else{
           notNull = true;
        }
        
        return notNull;
    }
    
}
