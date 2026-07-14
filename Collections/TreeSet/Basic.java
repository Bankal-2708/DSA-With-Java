package Collections.TreeSet;
// does not allow duplicate and it also store data in natural sorted form
// it is less slow than  hashSet in searching 
// rest opr are same as set

import java.util.*;

public class Basic {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 3, 2, 2, 4, 5 };
    TreeSet<Integer> tree = new TreeSet<>();
    for (int n : arr) {
      if (tree.contains(n)) {
        System.out.println("Duplicate occur " + n);
      }
      tree.add(n);
    }
    tree.add(6);
    tree.add(7);
    System.out.println(tree.higher(4));
    System.out.println(tree);
  }
}
