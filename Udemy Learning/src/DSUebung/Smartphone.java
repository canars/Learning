package DSUebung;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Smartphone {
	private ArrayList<Kontakt> meinekontakte;

	public Smartphone() {
		meinekontakte = new ArrayList<Kontakt>(); // Jedes mal wenn ein Smartphone erstellt wird, bekommt es diese Liste
													// dazu.
	}

	public boolean addKontakte(Kontakt neuerKontakt) {
		for (Kontakt kontakt : meinekontakte) {
			if (neuerKontakt.getName().equals(kontakt.getName())) {
				System.out.println("Kontakt vorhanden");
				return false;
			}
		}
		meinekontakte.add(neuerKontakt);
		System.out.println("Kontakt hinzugefügt");
		return true;
	}

	public boolean findKontakt(String name) {
		for (Kontakt kontakt : meinekontakte) {
			if (name.equals(kontakt.getName())) {
				System.out.println("Kontakt gefunden" + kontakt.getName() + " " + kontakt.getTelefonummer());
				return true;
			}
		}
		System.out.println("Kontakt nicht gefunden");
		return false;
	}

	public void ausgabe() {
		for (Kontakt kontakt : meinekontakte) {
			System.out.println("Der Kontakt heißt" + kontakt.getName() + " und seine Telefonummer lautet: "
					+ kontakt.getTelefonummer());
		}
	}

}