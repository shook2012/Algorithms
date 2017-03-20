/*
输入一个链表，反转链表后，输出链表的所有元素。
*/

/*
思路1：
反序的过程整个链表分成两个部分，前面的代表已反序，后面的代表待反序，
反序和待反序是断开的，所以要注意保存这两条链表的头节点        
// 1->2->3->4->5
// 1<-2<-3 4->5
ListNode next = null;//用来保存待反序的第一个节点（head 和 next节点）        
ListNode pre = null;//用来保存已经反序的第一个结点

核心的四句我确实绕了半天。。。
*/



/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

import java.util.*;
public class Solution {
    public ListNode ReverseList(ListNode head) {
    	ListNode pre=null;   //用来保存待反序的第一个节点（head 和 next节点）        
        ListNode next = null; //用来保存已经反序的第一个结点
        while(head!=null){
            next=head.next;  
             //保存完next，就可以让head从指向next变成指向pre了
            head.next=pre;
            //head指向pre后，就继续依次反转下一个节点
            //让pre，head，next依次向后移动一个节点，继续下一次的指针反转
            pre=head;
            head=next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表
        return pre;
    }
}