package chain_of_responsibility;

import java.io.IOException;

public class PasswordValidator extends AccountValidator{
    public PasswordValidator(AccountValidator next) {
        super(next);
    }  
   
    @Override
    public void login(String email, String password) {
        while (password.length() < 8) {
            System.out.println("Password non valida: deve essere lunga almeno 8 caratteri");
            System.out.print("Scrivi nuovamente l'email: ");
            
            try {
                password = br.readLine();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
        
        System.out.println("Password correttamente scritta");

        if (next != null)
            next.login(email, password);
    }
}
