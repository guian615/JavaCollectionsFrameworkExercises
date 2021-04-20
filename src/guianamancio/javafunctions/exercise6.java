package guianamancio.javafunctions;

import java.util.HashSet;

public class exercise6 {
   public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
          set1.add("Apple");
          set1.add("Orange");
          set1.add("Pineapple");
          set1.add("Manggo");
          set1.add("Melon");
          System.out.println("Frist Set: "+set1);
          HashSet<String>set2 = new HashSet<String>();
          set2.add("Buko");
          set2.add("Pomelo");
          set2.add("Manngo");
          set2.add("Apple");
          set2.add("Pineapple");

          System.out.println("Second Set: "+set2);
          set1.retainAll(set2);
          System.out.println("Common Values:");
          System.out.println(set1);
     }
} 

