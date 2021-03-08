import java.util.ArrayList;
import java.util.Scanner;


public class Adressbuch
{

    public static void main(String[] args)
    {
        Adresse peterAdresse = new Adresse("Peter", "Fritzstra�e 3", "Berlin");
        Adresse canAdresse = new Adresse("Can", "Ortlerstra�e 4", "Augsburg");
        Adresse canNeuAdresse = new Adresse("Messi", "Fruelingstra�e 24", "Friedberg");

        ArrayList<Adresse> adressenListe = new ArrayList<Adresse>(); //dynamisch -> es kann immer wieder ein neues Element eingef�gt werden, Gr��e variiert
        Adresse[] adressenArray = {peterAdresse, canAdresse, canNeuAdresse}; //statisch -> ein Array hat immer eine bestimmte gr��e


        adressenListe.add(peterAdresse);
        adressenListe.add(canAdresse);
        adressenListe.add(canNeuAdresse);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String straße= scanner.nextLine();
        String stadt = scanner.nextLine();

        Adresse adresse1 = new Adresse(name, straße, stadt);
        adressenListe.add(adresse1); //das hier funktioniert, da ich in eine ArrayListe beliebig viele Elemente einf�gen kann.
        //adressenArray[3] = adresse1; //das hier funktioniert nicht, da ein normales Array eine, von mir, vordefinierte Gr��e hat. 

        System.out.println("ArrayList");
        for (Adresse adresse : adressenListe)
        {
            System.out.println("Der Name lautet: " + adresse.getName() + " und wohnt in der Stra�e "
                + adresse.getStraße() + " (Stadt " + adresse.getStadt() + ")");

        }

        System.out.println("");
        System.out.println("Array:");

        for (Adresse adresse : adressenArray)
        {
            System.out.println("Der Name lautet: " + adresse.getName() + " und wohnt in der Stra�e "
                + adresse.getStraße() + " (Stadt " + adresse.getStadt() + ")");
        }


    }

}
