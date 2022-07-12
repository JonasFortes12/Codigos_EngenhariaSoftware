package cinema;

import validador.ValidadorLogin;

/**
 *
 * @author jonas
 */
public class AdaptadorValidador {
    
    public boolean validadorAdaptado(String email, String senha, String senhaConfirm){
    
        ValidadorLogin validador = new ValidadorLogin();
        
        
        return validador.isValidLogin(email, senha, senhaConfirm, "NomeCompleto");
        
    }
 
    
}
