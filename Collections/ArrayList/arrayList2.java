package Collections.ArrayList;

import java.util.*;

public class arrayList2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

    // list.add(1);
    // list.add(2);
    // list.add(3);
    // System.out.println(list);

    // list.set(0, 10);
    // list.set(1,20);
    // list.set(2,30);
    // System.out.println(list);

    // list.remove(1);
    // System.out.println(list);

    // for (Integer n : list) {
    // if (n % 2 == 0) {
    // list.remove(n); // not working ConcurrentModificationException occur
    // }
    // }

    list.removeIf(n -> n % 2 == 0);
    System.out.println(list);
  }
}
