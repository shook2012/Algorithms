/*
输入一个链表，从尾到头打印链表每个节点的值。
*/


/*
思路1：
先正常存入list中，然后翻转输出
Collections则是集合类的一个工具类/帮助类，其中提供了一系列静态方法，用于对集合中元素进行排序、搜索以及线程安全等各种操作。
使用Reverse方法可以根据元素的自然顺序 对指定列表按降序进行排序。
思路2：利用递归（下一次用）
*/



/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*	
*/
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();

        while(listNode!=null){
            list.add(listNode.val);
            listNode=listNode.next;      //正常存入List
        }

        Collections.reverse(list);   //翻转
        return list;
    }
}