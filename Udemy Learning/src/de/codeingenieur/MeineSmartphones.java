package de.codeingenieur;

import DSUebung.*;

public class MeineSmartphones {

	public static void main(String[] args) {
		Smartphone iPhone6 = new Smartphone();

		iPhone6.addKontakte(Kontakt.erstelleKontakt("Can", 01231414123)); // Udemy Kapitel
																			// 139!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		iPhone6.addKontakte(Kontakt.erstelleKontakt("Peter B", 234324240));
		iPhone6.addKontakte(Kontakt.erstelleKontakt("Michael", 232340));

		Kontakt can = new Kontakt(01231414123, "Can");
		iPhone6.addKontakte(can);
		
		iPhone6.ausgabe();
		
		System.out.println("Suchen: ...");
		iPhone6.findKontakt("Can");

	}
}
