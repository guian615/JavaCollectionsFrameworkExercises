package guianamancio.javafunctions;

import java.util.HashSet;
import java.util.Set;

public class exercise7 {
   public static void main(String[] args) {
     // Create a empty hash set
        HashSet<String> firstSet = new HashSet<String>();
     // use add() method to add values in the hash set
          firstSet.add("Red");
          firstSet.add("Green");
          firstSet.add("Black");
          firstSet.add("White");
          System.out.println("Frist Set: "+firstSet);
          HashSet<String>secondSet = new HashSet<String>();
          secondSet.add("Red");
          secondSet.add("Pink");
          secondSet.add("Black");
          secondSet.add("Orange");

          System.out.println("Second Set: "+secondSet);
          secondSet.removeAll(firstSet);
          System.out.println("Unique Values:");
          System.out.println(secondSet);
     }
} 



