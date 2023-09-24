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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list= new ArrayList<>();
        if(root==null)
        return list;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> al=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                al.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                }
                list.add(0,al);
            }
            return list;
        }



    }
