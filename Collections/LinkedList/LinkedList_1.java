package Collections.LinkedList;

import java.util.*;

// maintain insertion order
// allow duplicate values
// index based access is allowed
// no thread safe
// use high memory than arraylist
// it is good for insertion and deletion very fast at the end and start
// take o(n) for searching and o(1) for insertion and deletion
// variable size
// non-contugous memory allocation

public class LinkedList_1 {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    ArrayList<Integer> al = new ArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.addFirst(0);

    al.add(1);
    al.add(2);
    al.add(3);
    al.add(0, 0);

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      int val = it.next();
      if (val == 3) {
        it.remove();
      }
    }

    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(al);
    System.out.println(al.get(0));
  }
}
