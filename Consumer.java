import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Producer.
 * 
 * @author Roland Daidone, Michael Linn 
 * @version 0.9
 */
public class Consumer 
{
    private static int zahl;
    
    //TreeMap-Register
    TreeMap<Integer, ArrayList<Long>> protokoll = new TreeMap<Integer, ArrayList<Long>>();

    /**
     * Diese Methode nimmt einen Integer entgegen und berechnet die Quersumme.
     * Für jede Quersumme wird ein Zeitstempel der Berechnung erstellt. Jeder
     * Zeitstempel (= Protokoll) wird in einer ArrayList (= occurrences) gespeichert. 
     * Die occurrences werden wiederrum in einer TreeMap (= Register) hinterlegt,
     * um effizient darauf zugreifen zu können.
     * 
     * Wenn noch kein Protokoll mit einer errechneten Quersumme angelegt wurde,
     * dann wird in der ArrayList ein neues Protokoll mit Zeitstempel angelegt.
     * 
     * @param zahl  zu uebergebende Zahl
     * 
     */
    public void consume() {   // int zahl     
        zahl = TestRunner.getFirstThenNext(ersteStelle);
        int quersumme = 0;
        while (0 != zahl) {
            // Addiert die letzte Ziffer der uebergebenen Zahl zur Quersumme
            quersumme = quersumme + (zahl % 10);
            // Entfernt die letzte Ziffer der uebergebenen Zahl
            zahl = zahl / 10;
        }       

        if (!protokoll.containsKey(quersumme)) {
            protokoll.put(quersumme, new ArrayList<Long>());
        }    
        ArrayList<Long> occurrences = protokoll.get(quersumme);
        occurrences.add(System.currentTimeMillis());
        // protokoll.get(quersumme).add(System.currentTimeMillis());
    }

    /** 
     * Diese Methode gibt an, wie viele unterschiedliche Quersummen berechnet wurden.
     * 
     * @return Anzahl unterschiedlicher Quersummen
     */
    public int numberOfDifferentResults() {
        return protokoll.size();
    }

    /** 
     * Diese Methode gibt an, wie viele Eintraege zu einer entsprechenden Quersummen existieren.
     * 
     * @param quersumme  zu übergebende Quersumme
     * @return Anzahl der Eintraege zu einer bestimmten Quersumme
     */
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
