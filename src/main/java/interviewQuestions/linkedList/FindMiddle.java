package interviewQuestions.linkedList;

/**
 * Find Middle of Linked List
 * Explanation
 *
 * Use slow & fast pointers.
 *
 * When fast reaches end
 *
 * Slow will be at middle
 */
class FindMiddle {

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

    int findMiddle() {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        FindMiddle list = new FindMiddle();

        for (int i = 1; i <= 7; i++) {
            list.insert(i);
        }

        System.out.println(list.findMiddle()); // 4
    }
}
