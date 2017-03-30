/*
输入一棵二叉树，求该树的深度。
从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
*/


/*
思路1：
什么都没看我自己一遍写出来了！一遍AC！所以就不注释了！    
*/

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null || root.right != null)
            return Math.max(TreeDepth(root.left) + 1, TreeDepth(root.right) + 1);
        else
            return 0;

    }
}