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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> arr  = new ArrayList();
        if(root == null ){
            return l ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode front = q.remove();
            if(front != null){
                arr.add(front.val);
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);

            }
            else{
                l.add(arr);
                arr = new ArrayList<>();
                if(!q.isEmpty()) q.add(null);
            }
        }
        return l ;
        


    }
}