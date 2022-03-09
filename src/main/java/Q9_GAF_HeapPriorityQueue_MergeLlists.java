
//https://www.youtube.com/watch?v=BBt9FB5Yt0M - WITHOUT HEAP less space

/**

WITH HEAP - https://www.youtube.com/watch?v=zLcNwcR6yO4

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
    public ListNode mergeKLists(ListNode[] lists) {
  
        /* Not optimistic
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
        
        */
        
        //optimised with divide and conquer
        if(lists == null || lists.length == 0 ) return null;
        
        //recursive function for merging lists on the basis of mid value - divide and conquer
        return mergeMyLists(lists, 0, lists.length - 1);
        
        
    }
    
    
    private ListNode mergeMyLists (ListNode[] lists, int start, int end){
        
        if (start == end) return lists[start];
        
        int mid = start + (end - start)/2; //start+end/2
        ListNode left = mergeMyLists (lists, start, mid); //till mid
        ListNode right = mergeMyLists(lists, mid+1, end); //after mid
        return merge(right, left);      //merge to get results 
    }
    
    private ListNode merge(ListNode l, ListNode r){
        
        ListNode result = new ListNode(0);
        ListNode current = result;
        while(l!=null || r!=null){//dont forget while condition
                if(l==null){
                    current.next = r;
                    r=r.next;
                }else if (r==null){
                    current.next = l;
                    l=l.next;
                } else if(l.val < r.val ){
                    current.next = l;
                    l=l.next;
                }else{
                    current.next = r;
                    r=r.next;
                }
                current = current.next; //important
        }
        return result.next;      
        
    }
}
