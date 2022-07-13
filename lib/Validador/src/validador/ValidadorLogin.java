package validador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sun.applet.Main;


public class ValidadorLogin {

    public boolean isValidLogin(String email, String senha, String senhaConfirm, String nome) {
        
        boolean isEmailIdValid = false;
        boolean isPasswordValid = false;
        
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        
        if(senha.equals(senhaConfirm)) isPasswordValid = true;
        
        
        
        return (isEmailIdValid && isPasswordValid && nome.length() > 4);
    }
	
}
