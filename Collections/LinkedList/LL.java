package Collections.LinkedList;
import java.util.*;

public class LL {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();

    list.add("b");
    list.add("c");
    list.addFirst("a");
    list.addLast("e");

    // list.removeFirst();

    System.out.println(list.size());

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+ " -> ");
    }
    System.out.println("Null");

  }
}
