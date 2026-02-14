package problemSolving.linearDSAs;

class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node front, rear;

    // ENQUEUE
    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // DEQUEUE
    int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = front.data;
        front = front.next;

        if (front == null) rear = null;
        return removed;
    }

    // PEEK
    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // isEmpty
    boolean isEmpty() {
        return front == null;
    }

    // DISPLAY
    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println(q.dequeue()); // 10
        q.display();

        System.out.println(q.peek());    // 20
        System.out.println(q.isEmpty()); // false
    }
}
