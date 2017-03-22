/*
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
*/

/*
Queue使用时要尽量避免Collection的add()和remove()方法，而是要使用offer()来加入元素，
使用poll()来获取并移出元素。它们的优点是通过返回值可以判断成功与否，add()和remove()方法在失败的时候会抛出异常。
 如果要使用前端而不移出该元素，使用element()或者peek()方法。
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> ans =new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root == null)
            return ans;
        else{
            que.offer(root);   //每打印一个节点，就把节点的左右节点放到队列最后面
            while(!que.isEmpty()){
                TreeNode node = que.poll();
                if(node.left!=null)
                    que.offer(node.left);
                if(node.right!=null)
                    que.offer(node.right);
                ans.add(node.val);
            }
        }
        return ans;
    }
}

