import java.util.ArrayList;
import java.util.List;
 
public class TestArrayList {
  private static final int MAX = 10000;
 
  public static void main(String[] args) {
    List<Integer> cities = new ArrayList<Integer>();
    for (int i = 0; i < MAX; i++) {
      cities.add(i);
    }
     
    for (int i = 0; i < cities.size(); i++) {
      int myInt = cities.get(i);
      System.out.println(myInt);
    }
     
  }
}