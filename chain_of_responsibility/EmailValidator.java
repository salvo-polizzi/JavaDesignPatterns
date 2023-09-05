package chain_of_responsibility;

import java.io.IOException;

public class EmailValidator extends AccountValidator{
    public EmailValidator(AccountValidator next) {
        super(next);
    }  
   
    @Override
    public void login(String email, String password) {
        while (!email.contains("@")) {
            System.out.println("Email non valida: devi specificare la @");
            System.out.print("Scrivi nuovamente l'email: ");
            
            try {
                email = br.readLine();
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
        }
        
        System.out.println("Email correttamente scritta");
        
        if(next != null)
            next.login(email, password);        
    }
}
