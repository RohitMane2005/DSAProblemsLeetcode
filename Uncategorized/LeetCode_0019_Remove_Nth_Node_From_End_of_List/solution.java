class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n+1 steps
        for (int i = 0; i <= n; i++) {
            fast = fast.next;