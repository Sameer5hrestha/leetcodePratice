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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>  map = new HashMap();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return rec(map,preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    TreeNode rec(HashMap<Integer,Integer> map, int[] preorder,int preStart, int preEnd, int[] inorder , int inStart, int inEnd)
    {
        if(preStart>preEnd || inStart >inEnd) return null;
        int index = map.get(preorder[preStart]);
        int numsLeft = index-inStart;
        TreeNode root= new TreeNode(preorder[preStart]);

        root.left = rec(map,preorder, preStart+1, preStart+numsLeft, inorder, inStart, index-1);

        root.right =  rec(map ,preorder, preStart+numsLeft+1,preEnd,inorder,index+1,inEnd);
        return root;

    }
}