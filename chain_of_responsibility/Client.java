package chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        DatabaseAccount dbAcc = new DatabaseAccount();

        dbAcc.login();
    }
}
