package problemSolving.interviewQuestions.linkedList;

/*
Use slow and fast pointers.
Slow moves 1 step
Fast moves 2 steps
If there is a loop, they will meet.
 */
class DetectLoop {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(data);
    }

    boolean hasLoop() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoop list = new DetectLoop();

        for (int i = 1; i <= 7; i++) {
            list.insert(i);
        }

        // creating loop manually
        list.head.next.next.next.next.next.next = list.head.next;

        System.out.println(list.hasLoop()); // true
    }
}
