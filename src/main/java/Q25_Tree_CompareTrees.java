//https://www.youtube.com/watch?v=vRbbcKXCxOw
//https://leetcode.com/problems/same-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //BASE
        if(p == null && q == null){
            return true;
        }
        //CONSTRAINT
        else if( p== null || q == null){
            return false;
        } else if( p.val != q.val){
            return false;
        }
        //RECURSSION
        else {
            //validate right subtrees and validate right subtrees
            
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        
        
    }
}
