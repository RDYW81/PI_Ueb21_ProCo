import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Consumer.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 1.0
 */
public class Producer
{
    // Instanzvariablen
    // Random ran;

    // /**
    // * Konstruktor für Objekte der Klasse Consumer
    // */
    // public Producer()
    // {
    // // Instanzvariable initialisieren
    // ran = new Random();
    // }

    /**
     * Erzeugt einen zufälligen Integer im geschlossenen Intervall [0 - 1000] und gibt diesen zurück.
     * 
     * @return randomNummer gibt Integer zurück
     */
    public int produce() {
        Random ran = new Random();
        // int randomNummer = 1000; //ran.nextInt(1001);
        return ran.nextInt(1001); // randomNummer;
    }
}