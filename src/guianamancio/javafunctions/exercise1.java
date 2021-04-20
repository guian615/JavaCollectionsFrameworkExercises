package guianamancio.javafunctions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise1 {
    public static void main(String args[]) {
      ArrayList<String> listOfNames = new ArrayList<String>();
	   listOfNames.add("Guian");
	   listOfNames.add("Justine");
	   listOfNames.add("Patrick");
	   listOfNames.add("Dave");

       System.out.println("Before sorting:"+listOfNames);
       Collections.sort(listOfNames);
       System.out.println("After sorting:"+listOfNames);
   } 
}
