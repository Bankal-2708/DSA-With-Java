package Collections.HashSet;

import java.util.*;

public class Basic_2 {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 4 };
    HashSet<Integer> set = new HashSet<>();

    for (int n : arr) {
     if (!set.add(n)) {
        System.out.println("Duplicate occur " + n);
        break;  
      }
    }
     
  }
}
