import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Consumer.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.1
 */
public class Consumer
{
    // Instanzvariablen
    Random ran = new Random();
    
    // Zu speichernde Collection
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();

    /**
     * Konstruktor für Objekte der Klasse Consumer
     */
    public Consumer()
    {
        // Instanzvariable initialisieren
    }

    /**
     * Der Producer erzeugt einen zufälligen Integer-Wert und speichert diesen in einer Collection ab. 
     * Der Consumer entnimmt die Integer aus der Collection und berechnet die Quersumme.               
     * 
     * @param n zu übergebender Interger-Wert
     * @return blubb
     */
    public int nextInt(int n) {
        for(int i = 0; i < 10000; i++)
            if(ran.nextInt(2) > 0 ) {
                int ran = ran.nextInt(randomized.size());//produces a number within the range.
                myArrayList.add(randomized.get(ran));

                // // Erzeugen eines neuen Integers durch den Producer und speichern
                // // in einer Collection
                // else
                // // Entnehmen eines Integeres aus der Collection und Berechnung der
                // // Quersumme durch den Consumer
            }
        return 0;
    }

    //Nur zum Testzweck
    public static void main( String args[] ) {

        // random object
        Random ran = new Random();

        // check next int wert  
        System.out.println("Next int wert: " + ran.nextInt(10000));
    }    
}

