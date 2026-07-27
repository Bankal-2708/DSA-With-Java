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

      if (head == null) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

     public void addAfter(String data){
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        return;
      }
      String target = "c";
      Node currNode = head;
      while (currNode.data != target){
        currNode = currNode.next;
      }
      currNode.next = newNode;
    }

    public void addLast(String data){
      Node newNode = new  Node(data);
      if (head == null) {
        head = newNode;
        return;
      }
      Node currNode = head;
      while (currNode.next != null){
        currNode = currNode.next;
      }
      currNode.next = newNode;
    }

    public void deletfirst(){
      if (head == null ) {
        System.out.println(head);
        return;
      }
      
      head = head.next;

      // Node currNode = head;
      // head = currNode.next;
       

    }

    public void deletLast(){
     
      if (head == null){
        System.out.print("List is already empty");
        return;
      }
      if (head.next == null){
        head = null;
        System.out.print("List is empty, now");
        return;
      }
      Node prev = head;
      Node currNode = head.next;

      while (currNode.next != null) {
        prev = currNode;
        currNode = currNode.next;
      }
      prev.next = null;
    }

    public void reverse() {

      if (head == null && head.next == null) {
        System.out.println(head);
        return;
      }
      
      Node prevNode = head;
      Node currNode = head.next;

      while (currNode != null) {
        Node nextNode = currNode.next;

        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
      }
      head.next = null;
      head = prevNode;
    }

    public void printList(){
        Node currNode = head;
        while (currNode != null) {
          System.out.print(currNode.data + " -> ");
          currNode = currNode.next;
        }
        System.out.println("Null");
      }

  public static void main(String[] args) {
    Single_Linked_list list = new Single_Linked_list(0);
    list.addFirst("c");
    list.addFirst("b");
    list.addFirst("a");
    list.printList();
    // list.length();
    // list.search();
    // list.deletFirst();
    list.deletLast();
    list.printList();
    // list.getSize();


  }
}
