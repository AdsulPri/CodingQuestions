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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        //create new node
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node; // assign temp to current and iterate current
        
        //add smaller node as next node
        while(l1 != null && l2 != null){
            
            if (l1.val < l2.val){
                current_node.next=l1;
                l1=l1.next; // increment l1
            }else{
                current_node.next=l2;
                l2=l2.next; //increment l2
            }
            
            current_node = current_node.next; //iterate current
        }
        
        //if l1 is longer than l2
        if(l1!=null){
            current_node.next = l1;
            l1= l1.next;
        }
        //if l2 is longer than l1
        if(l2!=null){
            current_node.next = l2;
            l2= l2.next;
        }
        
        return temp_node.next;       //return head i.e. temp_node.next and NOT temp_node - first element is zero
        
    }
}
