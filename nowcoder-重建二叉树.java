/*
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
*/



/*
思路：
前序的第一个值就是二叉树的根节点，所以得到了要返回的node
在中序遍历中，根节点在中间，将左右子树分开，而对于每一个子树，又可以调用reConstructBinaryTree()函数
函数中用到Arrays.copyOfRange()，用法举例如下：
    dest=Arrays.copyOfRange(src, 2, 4);
    从src中的第2个位置到第4个位置;总数为2个 2=obj<4
    注意函数区间是前开后闭的[A,B)
*/



/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
         if(pre.length == 0||in.length == 0){   //没有这个检测无法通过测试
            return null;
        }
        TreeNode node =new TreeNode(pre[0]);  //根据前序找到根节点
        for(int i=0;i<in.length;i++){
            if(in[i] == pre[0]){  //找到根节点在中序中的位置
                node.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
                node.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(in, i+1, in.length));
            }  //分别找到左右子树各自的前序和中序
        }
        return node; //返回二叉树的根节点
    }
}

