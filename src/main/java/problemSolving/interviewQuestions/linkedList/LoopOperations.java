package problemSolving.interviewQuestions.linkedList;

class LoopOperations {

    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    Node head;

    // insert using loop
    void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = new Node(data);
    }

    // detect loop
    Node detectLoop() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return slow;
        }
        return null;
    }

    // find start of loop
    Node findLoopStart() {
        Node meetingPoint = detectLoop();
        if (meetingPoint == null) return null;

        Node start = head;
        while (start != meetingPoint) {
            start = start.next;
            meetingPoint = meetingPoint.next;
        }
        return start;
    }

    // remove loop
    void removeLoop() {
        Node loopStart = findLoopStart();
        if (loopStart == null) return;

        Node temp = loopStart;
        while (temp.next != loopStart) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // print list (after loop removal)
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LoopOperations list = new LoopOperations();

        // insert 7 elements
        for (int i = 1; i <= 7; i++) {
            list.insert(i);
        }

        // create loop at 3rd position
        Node third = list.head.next.next;
        Node temp = list.head;
        while (temp.next != null) temp = temp.next;
        temp.next = third;

        System.out.println(list.detectLoop() != null); // true

        Node loopStart = list.findLoopStart();
        System.out.println(loopStart.data); // 3

        list.removeLoop();
        list.display(); // normal list
    }
}
