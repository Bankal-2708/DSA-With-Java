package Collections.HashSet;

// does not maintain order 
// store data in key value pairs
// keys must be unique value can be dublicate

import java.util.*;

public class Basic {
  public static void main(String[] args) {
    HashMap<String, Integer> ages = new HashMap<>();
    ages.put("Bankal", 21);
    ages.put("Kittu", 20);
    ages.put("Aman", 19);
    ages.put("Kittu",19); // it will override the upper one

    List<String> keys = new ArrayList<>(ages.keySet()); // copy all the keys to a new list
    List<Integer> values = new ArrayList<>(ages.values()); // copy all the values to the new list

    System.out.println(keys);
    System.out.println(values);
    System.out.println(ages);
    System.out.println(ages.get("Kittu")); // gives value by key
    // System.out.println(ages.getValue(21));

    for (Map.Entry<String, Integer> entry : ages.entrySet()) { // give key from value
      // System.out.println(entry.getKey() + " -> " + entry.getValue());
      if (entry.getValue().equals(19)) {
        System.out.println(entry.getKey());
      }
    }

    System.out.println(ages);
  }
}
