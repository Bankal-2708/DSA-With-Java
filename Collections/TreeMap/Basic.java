package Collections.TreeMap;

import java.util.TreeMap;

// natural sorting by key

public class Basic {
  public static void main(String[] args) {
    TreeMap<String, Integer> ts = new TreeMap<>();
    ts.put("Bankal", 21);
    ts.put("Kittu", 20);
    ts.put("Aman", 19);

    System.out.println(ts);

    System.out.println(ts.firstKey()); // Aman — smallest key
    System.out.println(ts.lastKey()); // Kittu — largest key
    System.out.println(ts.higherKey("Aman")); // Aman — next key after apple
    System.out.println(ts.lowerKey("Kittu")); // mangBankalo — key just before zebra
    System.out.println(ts.ceilingKey("Kittu")); // Kittu — smallest key >= banana
    System.out.println(ts.floorKey("Aman")); // Aman — largest key <= ts
  }
}
