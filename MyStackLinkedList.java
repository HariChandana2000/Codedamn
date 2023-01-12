package MyStack;

import java.util.EmptyStackException;

class Node {
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}
public class MyStackLinkedList {
    private Node head;
    private int size;

    public MyStackLinkedList() {
        Node head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void push(int value){
        Node node = new Node(value);

        if (head == null) {
            head = node;
        }
        else {
            node.next = head;
            head = node;
        }

        size++;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();

        else {
            Node curr = head;
            int ele = curr.data;
            head = curr.next;
            curr.next = null;

            size--;
            return ele;
        }
    }

    public int peek() {
        return head.data;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        StringBuilder stb = new StringBuilder("");

        Node curr = head;
        while (curr != null){
            stb.append(curr.data).append("\n");
            curr = curr.next;
        }

        return stb.toString();
    }
}















