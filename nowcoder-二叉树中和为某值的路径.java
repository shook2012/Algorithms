/*
输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
*/



import java.util.ArrayList;
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
    ArrayList<Integer> list = new ArrayList<Integer>();    //要把这两个放在函数外面，要不然始终输出Null
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        
        if(target == 0 || root == null)
            return ans;
        list.add(root.val);
        target = target - root.val;
        if(target  == 0 && root.right == null && root.left == null){  //迭代结束条件
            ans.add(new ArrayList<>(list));  //【不是很理解】：因为add添加的是引用，如果不new一个的话，后面的操作会更改这个list
        }

        FindPath(root.left, target);
        FindPath(root.right, target);
		list.remove(list.size()-1);      //【不是很理解】：移除最后一个元素，深度遍历完一条路径后要回退
        return ans;
    }
}
