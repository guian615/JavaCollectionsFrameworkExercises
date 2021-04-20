package guianamancio.javafunctions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class exercise8 {

    public static void main(String args[]) {
        Map<String, String> keysInMap = new HashMap<>();
        keysInMap.put("concordia", "Sweet");
        keysInMap.put("concordia1", "Test");
        keysInMap.put("acconcordia", "Test”");
        keysInMap.put("condensada", "Sweet");

        int numCount = 0;
        Iterator iter = keysInMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> pairs = (Map.Entry) iter.next();
            if (pairs.getKey().substring(0, 9).contains("concordia")) {
                System.out.println(pairs.getKey());
                numCount++;
            }
        }
        System.out.println("");
        System.out.println("There are : " + numCount + " number of keys with the value of concordia");

    }
}
