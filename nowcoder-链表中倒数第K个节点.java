/*
输入一个链表，输出该链表中倒数第k个结点。
*/


/*
思路1：
代码思路如下：两个指针，先让第一个指针和第二个指针都指向头结点，
然后再让第一个指正走(k-1)步，到达第k个节点。然后两个指针同时往后移动，
当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。。（这个好理解）

提交的时候因为考虑不周错误很多次，总结错误如下：
1.没有考虑链表为空链表
2.没有考虑K可以取零
3.没有考虑K可能会越界
*/


/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        
        if(head == null || k==0)   //1.没有考虑链表为空链表  2.没有考虑K可以取零
            return null;
		ListNode ans=head,pre=head;
        for(int i=0;i<k-1;i++){      //这里是K还是K-1？
            pre=pre.next;
        }
        if(pre == null)
            return null;
        while(pre.next!=null){   //这里是pre还是pre.next?  
            pre=pre.next;
            ans=ans.next;
        }
        return ans;
    }
}