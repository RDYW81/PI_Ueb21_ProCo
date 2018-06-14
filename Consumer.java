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
    Random ran;

    private static final int ZEHNTAUSEND = 10;

    private int size = ZEHNTAUSEND;
    
    // Zu speichernde Collection
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();

    /**
     * Konstruktor für Objekte der Klasse Consumer
     */
    public Consumer()
    {
        // Instanzvariable initialisieren
        ran = new Random();
    }

    /**
     * Der Producer erzeugt einen zufälligen Integer-Wert und speichert diesen in einer Collection ab. 
     * Der Consumer entnimmt die Integer aus der Collection und berechnet die Quersumme.               
     * 
     * @param n zu übergebender Interger-Wert
     * @return blubb
     */
    public int nextInt(int n) {
        for(int i = 0; i < ZEHNTAUSEND; i++)
            if(ran.nextInt(2) > 0 ) {
                int rand = ran.nextInt(myArrayList.size());//produces a number within the range.
                myArrayList.add(myArrayList.get(rand));

                // // Erzeugen eines neuen Integers durch den Producer und speichern
                // // in einer Collection
                // else
                // // Entnehmen eines Integeres aus der Collection und Berechnung der
                // // Quersumme durch den Consumer
            }
        return n;
    }

    //Nur zum Testzweck
    public static void main( String args[] ) {

        // random object
        Random ran = new Random();

        // check next int wert  
        System.out.println("Next int wert: " + ran.nextInt(10000));
    }    
}