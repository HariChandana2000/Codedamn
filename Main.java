package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStackLinkedList stack = new MyStackLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Popped: " + stack.pop());
    }
}
