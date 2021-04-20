
package guianamancio.javafunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise2 {
 public static void main(String args[]){
     shuffleNames();
}
    public static void shuffleNames(){
      List<String> ourTeacher = new ArrayList<String>();
       ourTeacher.add("Ean Gwapo");
       ourTeacher.add("Christian Gwapo");
       ourTeacher.add("Patrick");
       ourTeacher.add("Junrey");
       ourTeacher.add("Tresha");
       System.out.println("\nBefore shuffle: \n"+ourTeacher);
       Collections.shuffle(ourTeacher);
       System.out.println("\nAfter sorting: \n "+ourTeacher);
       System.out.println("\nOriginal List : \n" + ourTeacher);  
       Collections.shuffle(ourTeacher);
       System.out.println("\nShuffled List : \n" + ourTeacher);
    }
   
}
