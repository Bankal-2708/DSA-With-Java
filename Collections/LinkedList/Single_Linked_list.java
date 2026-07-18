package Collections.LinkedList;
// import java.util.*;

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
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  public void length(){
    Node currNode = head;
    int count = 0;

    while (currNode != null) {
      count++;
      currNode = currNode.next;
    }
    System.out.println("Length of LL is "+ count);
  }

  public void search(){
    Node currNode = head;
    String target = "b";
    int count = 0;
    while (currNode != null) {
      count++;
      if (currNode.data == target) {
        System.out.println("Target : "+ target +" found at position : " + count);
      }
      currNode = currNode.next;
    }
  }

  public void deletFirst(){
    Node currNode = head;

    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    head = currNode.next;
  }

  public static void main(String[] args) {
    Single_Linked_list list = new Single_Linked_list();
    list.addFirst("c");
    list.addFirst("b");
    list.addFirst("a");
    list.printList();
    list.length();
    list.search();
    // list.deletFirst();
    // list.printList();

  }
}
