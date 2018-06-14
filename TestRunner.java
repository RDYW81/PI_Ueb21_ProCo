import java.util.*;
/**
 * Beschreiben Sie hier die Klasse TestRunner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestRunner
{

    private static final int MAX = 10000;

    // Zu speichernde Collection
    // ArrayList<Integer> myArrayList = new ArrayList<Integer>();

            //Nur zum Testzweck
    public static void main( String args[] ) {
        // random object
        Random ran = new Random();
        
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        for(int i = 0; i < MAX; i++)
            if(ran.nextInt(2) > 0 ) {
                int zahl = ran.nextInt(myArrayList.size()); // Erzeugen eines neuen Integers durch den Producer 
                myArrayList.add(myArrayList.get(zahl));     // und speichern in einer Collection
            } else {
                Integer result = (Integer) myArrayList.get(i); // Entnehmen eines Integeres aus der Collection und Berechnung der
                //result Quersummen-Berechnung // Quersumme durch den Consumer
            }
    }    
}
