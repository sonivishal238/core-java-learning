package linearDSAs;

class StackUsingLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node top;

    // PUSH
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // POP
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    // PEEK
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty
    boolean isEmpty() {
        return top == null;
    }

    // DISPLAY
    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println(stack.pop()); // 30
        stack.display();

        System.out.println(stack.peek()); // 20
        System.out.println(stack.isEmpty()); // false
    }
}
