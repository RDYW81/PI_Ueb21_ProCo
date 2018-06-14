import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Producer.
 * 
 * @author Roland Daidone, Michael Linn 
 * @version 0.9
 */
public class Consumer
{

    //HashMap-Register
    TreeMap<Integer, ArrayList<Long>> protokoll = new TreeMap<Integer, ArrayList<Long>>();

    /**
     * Berechnet Quersumme...
     */
    public void consume(int zahl) {
        int quersumme = 0;
        while (0 != zahl) {
            // addiere die letzte ziffer der uebergebenen zahl zur summe
            quersumme = quersumme + (zahl % 10);
            // entferne die letzte ziffer der uebergebenen zahl
            zahl = zahl / 10;
        }       

        if (!protokoll.containsKey(quersumme)) {
            protokoll.put(quersumme, new ArrayList<Long>());
        }    
        ArrayList<Long> occurrences = protokoll.get(quersumme);
        occurrences.add(System.currentTimeMillis());
        // protokoll.get(quersumme).add(System.currentTimeMillis());
    }

    //numberOfDifferentResults
    public int numberOfDifferentResults() {
        return protokoll.size();
    }

    //numberOfOccurrences gibt Einträge zurück
    public int numberOfOccurrences(int quersumme) {
        ArrayList<Long> occurrences = protokoll.get(quersumme);
        if (occurrences == null)
            return 0;
            
        return occurrences.size();
    }
    
    public Set<Integer> getCrossTotalsAscending() {
        return protokoll.keySet();
    }
    
    public Set<Integer> getCrossTotalsDescending() {
        return protokoll.descendingKeySet();
    }
    
    public ArrayList<Long> getTimestampsForResult(int quersumme) {
        return protokoll.get(quersumme);
    }
}
