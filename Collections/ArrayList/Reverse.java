package Collections.ArrayList;

import java.util.*;

public class Reverse {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
    int i = 0;
    int j = list.size() - 1;

    while (i < j) {
      int temp = list.get(i);
      list.set(i, list.get(j));
      list.set(j,temp);

      i++;
      j--;
    }

    // Collections.reverse(list);

    System.out.println(list);
    System.out.println(list.get(0));
  }
}
