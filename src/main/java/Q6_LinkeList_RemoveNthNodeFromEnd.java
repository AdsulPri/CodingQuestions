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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //Create dummy head
        ListNode dummy_head = new ListNode(0);
        dummy_head.next=head;
        
        //slow and fast pointers
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        
        //Find out n th position
        for(int i =1; i <= n+1 ; i++){
            fast=fast.next;
        }
        
        //Bring slow pointer to the fast pointer
        while(fast!=null){
            slow= slow.next;
            fast = fast.next;
        }
        
        //once we are here slowis pointing to exact node which needs deletion
        slow.next = slow.next.next;
        
        return dummy_head.next; //head of node where you did the delete 
        
    }
}
