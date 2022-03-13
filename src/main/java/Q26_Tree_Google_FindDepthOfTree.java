//https://www.youtube.com/watch?v=D2cFSDfg0So
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
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
    public int maxDepth(TreeNode root) {
        //BASE
        if(root == null){
            return 0;
        }
        
        //RECURSSION
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        //IMP to add +1 - as we are at root
        return Math.max(left, right) +1;
    }
}
