package Collections.LinkedList;
import java.util.*;

public class Single_Linked_list {
  Node head;
  class Node {
    String data;
    Node next;

    Node(String data){
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(String data){
    Node newNode = new Node(data);
    if (head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void printList(){
   Node currNode = head;
    while (currNode != null) {
      System.out.println(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    Single_Linked_list list = new Single_Linked_list();
    list.addFirst("a");
    list.printList();
  }
}
