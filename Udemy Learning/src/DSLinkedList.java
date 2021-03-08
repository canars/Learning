import java.util.ArrayList;
import java.util.LinkedList;

public class DSLinkedList {
	public static void main(String[] args) {
		// Datenstruktur erstellen

		LinkedList<Integer> liste = new LinkedList<Integer>();

		// Dateneingabe über for schleife

		for (int i = 0; i < 10000000; i++) {
			liste.add(i);
		}
		
		ArrayList<Integer> liste2 = new ArrayList<Integer>();
		for (int i = 0; i<10000000; i++) {
			liste2.add(i);
		}
		
		//Zeiten messen zwischen ArrayList und LinkedLsit
		
		//als erstes LinkedList... 
		
		final long timeStart = System.currentTimeMillis();
		DSLinkedList.getZahl(liste, 1999999);
		final long timeEnde = System.currentTimeMillis();
	
		System.out.println("Die Suche hat: " + (timeEnde-timeStart) + " Millisekunden -> fuer LinkedList");
		
		
		//nun ArrayList 
		final long timeStart2 = System.currentTimeMillis();
		DSLinkedList.getZahlArrayList(liste2, 1999999);
		final long timeEnde2 = System.currentTimeMillis();
		
		System.out.println("Die Suche hat: " + (timeEnde2-timeStart2) + " Millisekunden -> ArrayList");
		

	}
	
	//normale Methoden erstellen
	
	public static void getZahl(LinkedList<Integer> liste,  int index) {
		System.out.println(liste.get(index));
	}
	
	public static void getZahlArrayList(ArrayList<Integer> liste2, int index) {
		System.out.println(liste2.get(index));
	}

}
