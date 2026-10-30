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
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> row = new ArrayList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current == null){
                result.add(new ArrayList<>(row));
                row.clear();

                if(q.isEmpty()){
                    break;
                }

                q.add(null);
            } else {
                row.add(current.val);
                if(current.left != null){
                    q.add(current.left);
                }

                if(current.right != null){
                    q.add(current.right);
                }
            }
        }

        return result;
    }
}
