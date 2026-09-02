import java.util.*;
public class SLL {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insert (int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" ");
            if(current.next != null){
                System.out.print("->");
            }
            current = current.next;
        }

    }
    public static void main(String[] args){
        SLL lst = new SLL();
        lst.insert(10);
        lst.insert(20);
        lst.insert(30);
        lst.insert(40);
        System.out.println("singly linked list:");
        lst.display();
    }
}