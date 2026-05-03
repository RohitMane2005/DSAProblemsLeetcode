public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null; 
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                hasCycle = true;
                break;
            }
        }

        if (!hasCycle) return null;

        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        
        return temp;
    }
}