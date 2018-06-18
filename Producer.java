import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Consumer.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 1.0
 */
public class Producer
{
    /**
     * Erzeugt einen zufälligen Integer im geschlossenen Intervall [0 - 1000] und gibt diesen zurück.
     * 
     * @return ran.nextInt gibt Integer zurück
     */
    public int produce() {
        Random ran = new Random();
        return ran.nextInt(1001); 
    }
}