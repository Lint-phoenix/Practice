public class RemoveDuplicates {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;

            // Traverse the list
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    // Skip duplicate node
                    current.next = current.next.next;
                } else {
                    // Move to next distinct node
                    current = current.next;
                }
            }

            return head;
        }
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example input: sorted list with duplicates
        ListNode head = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3)))));

        System.out.println("Original list:");
        printList(head);

        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(result);
    }
}