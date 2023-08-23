package singleton.pagamenti;

// classe che chiama metodi di Pagamenti
// compilare con javac MainPagamenti.java
// eseguire con java MainPagamenti
import java.io.IOException;

public class MainPagamenti {
    public static void main(String[] args) {
		System.out.println("inizio esecuzione");
		Pagamenti p = Pagamenti.getInstance();

		try {
			p.leggiFile("csvfiles", "Importi.csv");
		} catch (IOException e) {
				// nel caso in cui il file non venisse trovato
                System.out.println("File does not exists");
                return;
		}
		
		System.out.println("massimo "+p.calcolaMassimo());
		System.out.println("somma "+p.calcolaSomma());

        //nuova istanza
        Pagamenti p1 = Pagamenti.getInstance();

        System.out.println("massimo "+p1.calcolaMassimo());
		System.out.println("somma "+p1.calcolaSomma());
	}
}
