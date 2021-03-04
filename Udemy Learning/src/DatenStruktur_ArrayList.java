import java.util.ArrayList;

public class DatenStruktur_ArrayList
{

    public static void main(String[] args)
    {
        // eine ArrayList erstellen

        ArrayList einkaufsListe = new ArrayList(); //können beliebige Werte eingespeichert werden
        ArrayList<String> namensListe = new ArrayList<String>(); //nur fuer Strings.. -> Generics

        
        // Dateneingabe mit der Methode add

        einkaufsListe.add("Wasser");
        einkaufsListe.add("BroT");
        einkaufsListe.add(Integer.valueOf(4));

        namensListe.add("Can");
        namensListe.add("Aylin");
        
        // Datenausgabe 
        
        for (int i = 0; i < namensListe.size(); i++) {
            System.out.println(namensListe.get(i));
            }
        
        // Datenausgabe mit der for each Schleife -> ist kompakter
        
        for (String string : namensListe)
        {   
            System.out.println("die Länge des Namens ist " + string.length());
        }
    }
}

