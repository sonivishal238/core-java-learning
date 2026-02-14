package problemSolving.interviewQuestions.linkedList;

class PalindromeLinkedList {

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

    boolean isPalindrome() {
        if (head == null || head.next == null) return true;

        // find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half
        Node secondHalf = reverse(slow.next);
        Node firstHalf = head;

        // compare
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {

        // ✅ Positive Case
        PalindromeLinkedList list1 = new PalindromeLinkedList();
        int[] arr1 = {1, 2, 3, 2, 1};
        for (int x : arr1) list1.insert(x);

        System.out.println(list1.isPalindrome()); // true

        // ❌ Negative Case
        PalindromeLinkedList list2 = new PalindromeLinkedList();
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int x : arr2) list2.insert(x);

        System.out.println(list2.isPalindrome()); // false
    }
}
