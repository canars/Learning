import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class Main
{

    public static void main(String[] args)
    {
        //in einem Set kann kein Element doppelt vorkommen, da jedes Element als einzigartig gilt

        //Datenstruktur

        List<String> liste1 = new ArrayList<String>();

        Set<String> set1 = new TreeSet<String>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new LinkedHashSet<String>();

        //Dateneingabe

        //ArrayList
        liste1.add("Peter");
        liste1.add("Michael");
        liste1.add("Peter");
        liste1.add("Bernd");
        liste1.add("Gustaf");
        

        //TreeSet -> Sets sortieren nach der Natürlich Ordnung -> A-Z 1-9 etc... 
        set1.add("Can");
        set1.add("Peter");
        set1.add("Can");
        set1.add("Bernd");
        set1.add("Gustaf");

        //HashSet -> Sortiert "unordentlich" -> Reihenfolge bei jeder Ausgabe anders
        set2.add("Can");
        set2.add("Peter");
        set2.add("Can");
        set2.add("Bernd");
        set2.add("Gustaf");
        
        //LinkedHashSet -> jedes Objekt mit dem anderen verbunden. Ausgabe immer in derselben Reihenfolge. Sie kommen raus wie sie in eingefügt wurden.
        set3.add("Can");
        set3.add("Peter");
        set3.add("Can");
        set3.add("Bernd");
        set3.add("Gustaf");

        //Datenausgabe
        System.out.println("Ausgabe ArrayList");
        Main.getElement(liste1);
        System.out.println("\nAusgabe TreeSet");
        Main.getElement(set1);
        System.out.println("\nAusgabe HashSet");
        Main.getElement(set2);
        System.out.println("\nAusgabe LinkedHashSet");
        Main.getElement(set3);
    }

    public static void getElement(Collection<String> collection)
    {
        for (String string : collection)
        {
              System.out.println(string);
        }
    }
}
