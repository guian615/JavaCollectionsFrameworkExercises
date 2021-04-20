package guianamancio.javafunctions;

import java.util.ArrayList;
import java.util.List;

public class exercise3 {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<>();
      numbers.add(12);
      numbers.add(23);
      numbers.add(19);
      numbers.add(1);
      numbers.add(4);
      numbers.add(3);
      minToFront(numbers);
  }
  public static void minToFront(ArrayList<Integer> numbers) {
  int minIndex = 0;
 
  for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(minIndex) > numbers.get(i)) {
          minIndex = i;
      }
  }
 
  int minValue = numbers.remove(minIndex);
  numbers.add(0, minValue);
  System.out.println("Moved minValue to front:" + numbers);
}
}
