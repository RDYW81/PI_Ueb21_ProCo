import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Consumer.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 0.1
 */
public class Producer
{
    // Instanzvariablen
    Random ran;

    /**
     * Konstruktor für Objekte der Klasse Consumer
     */
    public Producer()
    {
        // Instanzvariable initialisieren
        ran = new Random();
    }
    
    /**
     * Erzeugt einen zufälligen Integer im geschlossenen Intervall [0 - 1000] und gibt diesen zurück.               
     * 
     * @return randomNummer gibt Integer zurück
     */
    public int produce() {
        int randomNummer = ran.nextInt(1001);
        return randomNummer;
    }
}