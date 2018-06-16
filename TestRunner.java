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
    private static final int MADMAX = 10000;  //MADMAX klingt cooler als MAX
    private static int zufallsnummer;
    public static int ersteStelle;
    Random ran;

    // Collection zum Speichern eines Integers
    Queue<Integer> myQ = new LinkedList<Integer>();

    /**
     * Konstruktor für Objekte der Klasse Consumer
     */
    public TestRunner()
    {
        // Instanzvariable initialisieren
        ran = new Random();
    }

    public int getFirstThenNext() {
        int ersteStelle = (Integer) myQ.poll();
        // while ((ersteStelle = myQ.poll()) != 0) {
        // System.out.println("Entfernt: " + ersteStelle);
        // }   
        return ersteStelle;
    }

    public static int getStelle(int ersteStelle) {
        return TestRunner.ersteStelle;
    }


    public void feedMe() {
        for (int i = 0; i < MADMAX; i++) {
            if (ran.nextInt(2) > 0) {
                zufallsnummer =  Producer.produce(); // Erzeugen eines neuen Integers durch den Producer 
                myQ.add(zufallsnummer);              // und speichern in einer FIFO-Collection
            }
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

