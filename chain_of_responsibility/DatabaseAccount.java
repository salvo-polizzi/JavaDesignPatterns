package chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DatabaseAccount {
    private List<Account> accountRegistered = new ArrayList<>();
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private AccountValidator accValid = new EmailValidator(new PasswordValidator(null)); 
    
    public String getInput() {
        try {
            String s = br.readLine();
            return s;
        } catch (IOException ioe) {
            System.err.println(ioe);
            return null;
        }
    }

    public void registerAccount(String email, String password) {
        accountRegistered.add(new Account(email, password));
    }

    public void login() {
        String email, password;
        
        System.out.print("Scrivi l'email: ");
        email = getInput();

        System.out.print("Scrivi la password: ");
        password = getInput();

        accValid.login(email, password);
        registerAccount(email, password);

        System.out.println("Account correttamente registrato");
    }
}
