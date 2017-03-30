/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
*/



/*
思路1：
根据平衡二叉树的定义：最大深度和最小深度之差不超过1
最大深度和最小深度采用上一道题的递归代码

思路2：
根据另一个定义：它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
也能做吧（未尝试）
*/
import java.util.*;
public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null)
            return true;
        if((TreeDepthmax(root)-TreeDepthmin(root))>1)
            return false;
        else
            return true;

    }


    public int TreeDepthmax(TreeNode root) { //求出最大深度
        if (root == null)
            return 0;
        if (root.left != null || root.right != null)
            return Math.max(TreeDepthmax(root.left) + 1, TreeDepthmax(root.right) + 1);
        else
            return 0;
    }
        public int TreeDepthmin(TreeNode root) { //求出最小深度
        if (root == null)
            return 0;
        if (root.left != null || root.right != null)
            return Math.min(TreeDepthmin(root.left) + 1, TreeDepthmin(root.right) + 1);
        else
            return 0;
    }
}