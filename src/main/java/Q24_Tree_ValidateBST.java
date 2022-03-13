//https://leetcode.com/problems/validate-binary-search-tree/
//https://www.youtube.com/watch?v=Z_-h_mpDmeg
//O(N) O(N)

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
    public boolean isValidBST(TreeNode root) {
        
        return validate(root, null, null);
        
    }
    
    public boolean validate(TreeNode root, Integer max, Integer min){
        //BASE CONDITION
        if(root == null){
            return true;
        } 
        // CONSTRAINT
        //if root.val > max or root.val < min - then it is invalid
        else if(max != null && root.val >= max || min != null && root.val <= min){
            return false;
        }
        //RECURSSION
        else{
            //validate left sub tree and roght subtree IMP root.left and root.right
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
            
        }
    }
}
