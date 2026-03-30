/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;
       ListNode first = head;
       ListNode sec = head;
       ListNode current = head;
       for(int i = 1; i< k; i++){
        current = current.next;
       }
       first = current;
       while(current.next != null){
        current = current.next;
        sec = sec.next;
       }

       int temp = first.val;
       first.val = sec.val;
       sec.val = temp;

       return head;
    }
}