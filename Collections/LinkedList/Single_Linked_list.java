package Collections.LinkedList;
// import java.util.*;

public class Single_Linked_list {
  Node head;
  int size = 0;

  Single_Linked_list(int size){
    this.size = 0;
  }

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
    size++;
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
    size--;
    head = currNode.next;
  }


  public void deletLast(){
    Node currNode = head;
 
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    size--;

    if (head.next == null) { // if LL is only 1 elements
      head = null;
      return;
    }

   while (currNode.next.next  != null) {
    currNode = currNode.next;
   }
   
   currNode.next = null;
  }

  public void getSize(){
    System.out.println(size);
  }

  public static void main(String[] args) {
    Single_Linked_list list = new Single_Linked_list(0);
    list.addFirst("c");
    list.addFirst("b");
    list.addFirst("a");
    list.printList();
    list.length();
    list.search();
    // list.deletFirst();
    list.deletLast();
    list.printList();
    list.getSize();


  }
}
