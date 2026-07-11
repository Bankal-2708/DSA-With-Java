package Arrays.ArrayList;

import java.util.*;

public class arrayList3 {
  public static void main(String[] args) {

    Integer arr[] = { 1, 2, 2, 3, 4, 5, 3, 4, 5, 6, 7, 8, 9 };

    ArrayList<Integer> list = new ArrayList<>();
    // System.out.println(list);
    // System.out.println(Arrays.toString(arr));

    // for (Integer n : arr) {
    //   if (list.contains(n)) {
    //     continue;
    //   } else{
    //     list.add(n);
    //   }
    // }

    for (int n : arr) {
      if (!list.contains(n)) {
        list.add(n);
      }
    }

    System.out.println(list);
  }
}
