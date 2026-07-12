package Collections.ArrayList;

import java.util.*;

// it allow dublicate values and maintain insertion order
// it is not synchronized
// store data in index based

public class arrayList {
  public static void main(String[] args) {

    String[] st = { "Bankal", "Kittu", "Vansh" };

    // ArrayList<String> list = new ArrayList<>();
    // list.add("Bankal");
    // list.add("Kittu");

    // System.out.println(list.get(0));
    // System.out.println(list);
    // System.out.println(list.contains("Kittu"));
    // System.out.println(list.size());
    // System.out.println(list.isEmpty());
    // System.out.println(list.indexOf("Bankal"));
    // System.out.println(list.set(0, "Kunnu"));
    // System.out.println(list);

    ArrayList<String> list = new ArrayList<>(List.of(st));

    if (list.contains("Kittu")) {
      System.out.println("Find ");
    } else {
      System.out.println("Did not found");
    }
  }
}
