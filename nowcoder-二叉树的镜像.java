/*
操作给定的二叉树，将其变换为源二叉树的镜像。

二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
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
    public void Mirror(TreeNode root) {
        if(root==null)
            return ;

        if(root.left != null)//确定迭代的边界
       	Mirror(root.left);
        if(root.right != null)
        Mirror(root.right); 
        


        TreeNode root0=null;  // Swap(root.left,root.right); Java不能直接调用这个函数
        root0=root.left;
        root.left=root.right;
        root.right=root0;
    }
    
}
    