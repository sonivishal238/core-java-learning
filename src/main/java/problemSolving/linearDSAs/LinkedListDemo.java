package problemSolving.linearDSAs;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtTail(1000);
        list.insertAtPosition(2, 15);
        list.display();

        list.updateAtPosition(1, 7);
        list.display();

        list.deleteHead();
        list.display();

        list.deleteAtPosition(1);
        list.display();

        System.out.println(list.search(7));
        System.out.println(list.search(100));
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // CREATE / INSERT OPERATIONS

    // Insert at beginning
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtTail(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Insert at position (0-based)
    void insertAtPosition(int index, int data) {
        if(index == 0) {
            insertAtHead(data);
            return;
        }

        Node temp = head;

        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // READ / TRAVERSE
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // UPDATE
    void updateAtPosition(int index, int newData) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data = newData;
    }

    // DELETE OPERATIONS

    // Delete head
    void deleteHead() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete at position
    void deleteAtPosition(int index) {
        if (index == 0) {
            deleteHead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    // SEARCH
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }
}
