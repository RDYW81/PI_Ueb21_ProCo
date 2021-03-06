import java.util.*;
/**
 * Beschreiben Sie hier die Klasse TestRunner.
 * 
 * @author Roland Daidone, Michael Linn
 * @version 1.1
 */
public class TestRunner
{
    // Instanzvariablen
    private static final int MAD_MAX = 10000;  
    private static int zufallsnummer;
    Producer p = new Producer();
    Consumer c = new Consumer(); 
    int quersumme = 0;
    Random ran;

    // Collection zum Speichern eines Integers
    Queue<Integer> myQ = new LinkedList<Integer>();

    /**
     * Konstruktor für Objekte der Klasse Consumer; initialisiert Random
     */
    public TestRunner()
    {
        ran = new Random();
    }

    /**
     * Die Methode feedMe ist das Kernstück dieses Programms. feedMe erhält von der Klasse Producer
     * zufällig erzeugte Integer, welche in einer FIFO-Collection gespeichert werden. Die Klasse Consumer
     * entnimmt die Integer aus der Collection und berechnet die Quersumme. In einer Schleife werden
     * Producer und Consumer in einer zufälligen Reihenfolge aufgerufen. Im Anschluss gibt feedMe die im
     * Consumer hinterlegten Methodenaufrufe gem. Aufgabe 1c wider.
     */
    public void feedMe() {
        for (int i = 0; i < MAD_MAX; i++) {
            if (ran.nextInt(2) > 0) {
                zufallsnummer =  p.produce(); // Erzeugen eines neuen Integers durch den Producer 
                myQ.add(zufallsnummer);       // und speichern in einer FIFO-Collection
            } else {
                Integer poll = myQ.poll();
                if (poll != null )
                    c.consume(poll);   // Entnehmen eines Integeres aus der Collection und Berechnung
                                       // der Quersumme durch den Consumer               
            }            
        }
        System.out.println("Verschiedene Quersummen: " + c.numberOfDifferentResults());
        zeitStempelProAusgabe();
        System.out.println("Quersummen aufsteigend sortiert: " + c.getCrossTotalsAscending());
        System.out.println("Quersummen absteigend sortiert:  " + c.getCrossTotalsDescending());
        System.out.println("Zeitstempel: " + c.getTimestampsForResult(quersumme));
    }

    /**
     * Hilfsmethode, welche alle Zeitstempel pro hinterlegter Quersumme aus der Klasse Consumer abgreift und
     * der Methode feedMe als Ausgabe zur Verfügung stellt.
     */
    public void zeitStempelProAusgabe(){
        System.out.println("Zeitstempel pro Quersumme: ");
        for (int i = 0 ; i <= 28; i++){
            System.out.println(i +":" +"  "+  c.numberOfOccurrences(i));
        }
    }

    /**
     *  Hilfsmethode, welche alle am Beispiel der Quersumme 0 hinterlegten Zeitstempel aus der Klasse Consumer 
     *  abgreift und der Methode feedMe als Ausgabe zur Verfügung stellt.
     */
    public void zeitStempelVolleAusgabe(){
        System.out.println("Alle Zeitstempel pro Quersumme: ");
        for (int i = 0 ; i <= 28; i++){
            System.out.println(i +":" +"  "+  c.getTimestampsForResult(i));
        }
    }   

    public static void main(String[] args) {
        Queue<Integer> myQ=new LinkedList<Integer>();
        myQ.add(1);
        myQ.add(6);
        myQ.add(3);
        System.out.println(myQ); //1 6 3
        int first=myQ.poll();// retrieve and remove the first element
        System.out.println(first);//1
        System.out.println(myQ);//6 3

        Queue<String> queue = new LinkedList<String>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        queue.offer("Fourth");

        System.out.println("Size: " + queue.size());

        System.out.println("Queue head using peek   : " + queue.peek());
        System.out.println("Queue head using element: " + queue.element());

        Object data;
        while ((data = queue.poll()) != null) {
            System.out.println(data);
        }
    }
}