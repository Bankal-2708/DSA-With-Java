package Collections.LinkedList;

import java.util.*;

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

    for (int i = 0; i < size; i++) {
      int x = list.removeFirst();
      int y = list.removeLast();

      list.addFirst(y);
      list.addLast(x);
    }
    System.out.println(list);
  }
}
