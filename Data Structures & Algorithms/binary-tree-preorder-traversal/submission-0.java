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
    List<Integer> nodeList = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {
       // List<Integer> nodeList = new ArrayList();
        if(root != null){
            this.nodeList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            
        }
        return nodeList;
    }
}