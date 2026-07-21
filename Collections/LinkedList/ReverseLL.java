package Collections.LinkedList;

public class ReverseLL {

  Node head;

  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void reverse() {
    
    if (head == null || head.next == null) {
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

  public void printList() {
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    ReverseLL list = new ReverseLL();
    list.addFirst(2);
    list.addFirst(1);
    list.addFirst(0);
    list.printList();

    list.reverse();
    list.printList();
  }

}
