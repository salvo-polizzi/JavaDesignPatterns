package chain_of_responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class AccountValidator {
    protected AccountValidator next;
    protected BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AccountValidator(AccountValidator next) {
        this.next = next;
    }

    public abstract void login(String email, String password);
}
