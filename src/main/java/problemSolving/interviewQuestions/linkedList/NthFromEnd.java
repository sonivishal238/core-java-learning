package problemSolving.interviewQuestions.linkedList;

/*
Maintain a gap of n nodes between two pointers.
fast pointer moves n steps ahead first
slow pointer stays at head
Then move both one step at a time
When fast reaches null, slow is at Nth node from end
 */
class NthFromEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
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

    int findNthFromEnd(int n) {
        Node slow = head, fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        NthFromEnd list = new NthFromEnd();

        for (int i = 1; i <= 7; i++) {
            list.insert(i);
        }

        System.out.println(list.findNthFromEnd(5)); // 5
    }
}
