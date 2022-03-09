//https://www.youtube.com/watch?v=OaPaTaj0xYo - WITHOUT HEAP less space

/**

WITH HEAP - https://www.youtube.com/watch?v=zLcNwcR6yO4


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
    public ListNode mergeKLists(ListNode[] lists) {
        
        //define min heap
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        
        //add elements from all lists to the minheap
        for (ListNode head: lists){
            while (head != null){ //while it is not null keep on adding values from each list
                minHeap.add(head.val);
                head = head.next;                
            }
        }
        
        // create new list
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        //read fromheap and write to new list
        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove()); // removing element from heap
            head = head.next;
        }
        
        return dummy.next;
        
    }
}
