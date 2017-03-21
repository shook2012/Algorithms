/*
输入两个单调递增的链表，输出两个链表合成后的链表，
我们需要合成后的链表满足单调不减规则。
*/

/*
思路1：
使用递归
思路2：
非递归：使用一个current，不停向后移，merge为最初的第一个，最后返回merge
*/




/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//思路1：
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newlist=null;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        if(list1.val<list2.val){
            newlist=list1;
            newlist.next=Merge(list1.next,list2);
        }
        else{
            newlist=list2;
            newlist.next=Merge(list1,list2.next);
        }
        return newlist;
    }
}

