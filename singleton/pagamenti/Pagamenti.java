package singleton.pagamenti;

//Modifica della classe Pagamenti in singleton

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.List;
import java.util.ArrayList;

class Pagamenti {
    private List< Float > importi = new ArrayList< >(); // attributo per lista di valori
    private static Pagamenti p;

    private void Pagamenti() {
        svuota();
    }

    public static Pagamenti getInstance() {
        if (p == null) p = new Pagamenti();
        return p;
    }

	public void leggiFile(String c, String n) throws IOException {
		final LineNumberReader f = new LineNumberReader(new FileReader(new File(c, n)));
		String riga;
		while (true) {
			riga = f.readLine();          // legge una linea dal file
			if (null == riga) break;      // controlla se il file e' finito
			inserisci(Float.parseFloat(riga));
		}
		f.close();
	}
	
	public void inserisci(float x) {
		if (!importi.contains(x))         // inserisce solo valori distinti
			importi.add(x);               // aggiunge in lista
	}
	
	public float calcolaSomma() {
		float risultato = 0;
		for (float v : importi)
			risultato += v;               // somma l'elemento della lista
		return risultato;
	}
	
	public float calcolaMassimo() {
		float risultato = 0;
		for (float v : importi)
			if (risultato < v) 
				risultato = v;
		return risultato;
	}
	
	public void svuota() {
		importi = new ArrayList < >();
	}
}