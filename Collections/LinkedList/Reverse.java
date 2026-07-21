package Collections.LinkedList;

// import java.util.*;

import java.util.LinkedList;

public class Reverse {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    int size = list.size();
    int left = 0;
    int right = size - 1;

    while (left < right){
      int temp = list.get(left);
      list.set(left, list.get(right));
      list.set(right, temp);

      left++;
      right--;
    }

    System.out.println(list);
  }
}
