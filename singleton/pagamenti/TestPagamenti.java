package singleton.pagamenti;

// test per la classe Pagamenti
import java.io.IOException;

public class TestPagamenti {
    private Pagamenti pgm = new Pagamenti();
	
	private void initLista() {
		pgm.svuota();
		pgm.inserisci(321.01f);
		pgm.inserisci(531.7f);
		pgm.inserisci(1234.5f);
	}
	
	public void testSommaValori() {
		initLista();
		if (pgm.calcolaSomma() == 2087.21f) // test che si autovaluta
			System.out.println("OK test somma val");
		else System.out.println("FAILED test somma val");
	}
	
	public void testLeggiFile() {
		pgm.svuota();
		try {
			pgm.leggiFile("csvfiles", "Importi.csv"); 
			System.out.println("OK test leggi file");
		} catch (IOException e) {
			System.out.println("FAILED test leggi file");
		}
	}
	
	public void testMaxValore() {
		initLista();
		pgm.calcolaMassimo();
		if (pgm.calcolaMassimo() == 1234.5f)
			System.out.println("OK test massimo val");
		else System.out.println("FAILED test massimo val");
	}
	
	public static void main(String[] args) {
		TestPagamenti tl = new TestPagamenti();
		tl.testLeggiFile();
		tl.testSommaValori();
		tl.testMaxValore();
	}
}
