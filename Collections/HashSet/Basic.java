package Collections.HashSet;

import java.util.HashSet;

// does not allow duplicate
// does not maintain order
// only one null value allowed

public class Basic {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,3,6,5,3,8,6,9,7};

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }
   
    // System.out.println(set);
    for (int n : set) {
      System.out.println(n);
    }
  }
}
