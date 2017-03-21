/*
输入两棵二叉树A，B，判断B是不是A的子结构。
（ps：我们约定空树不是任意一个树的子结构）
*/


/*
思路1：
借鉴了左程云大大的思路
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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2 == null || root1 == null)       //题目规定
            return false;
        else{
            return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2) || CheckNode(root1,root2);
            //对左右子树迭代，判断根节点是否满足提议
        }
    }
    public static boolean CheckNode(TreeNode root1,TreeNode root2){
        if(root2==null)
            return true;//说明root2全部判断完了 满足
        if(root1==null ||root1.val != root2.val)    //此时root2还有，但是root1消耗完了
            return false;
        return CheckNode(root1.left,root2.left) && CheckNode(root1.right,root2.right); //迭代，让下面的也满足
    
    }
}