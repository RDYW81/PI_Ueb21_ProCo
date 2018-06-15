import java.util.*;
/**
 * Beschreiben Sie hier die Klasse TestRunner.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.1
 */
public class TestRunner
{
    // Instanzvariablen
    private static final int MAX = 10000;
    private static int zufallsnummer;
    Random ran;

    // Collection zum Speichern eines Integers
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();

    /**
     * Konstruktor für Objekte der Klasse Consumer
     */
    public TestRunner()
    {
        // Instanzvariable initialisieren
        ran = new Random();
    }

    public void produceAndDoMore() {
        for (int i = 0; i < MAX; i++) {
            if (ran.nextInt(2) > 0) {
                zufallsnummer = Producer.produce(); //ran.nextInt();
                myArrayList.add(zufallsnummer);
            } else {

            }
        }
    }

    
    
    
    
    

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
