/*
输入两个单调递增的链表，输出两个链表合成后的链表，
我们需要合成后的链表满足单调不减规则。
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
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newlist=null;
        while(list1 != null || list2 != null){
            if(list1 == null){
                while(list2 != null){
                newlist=list2;
                list2=list2.next;
                }
            }
            if(list2 == null){
                while(list1 != null){
                newlist=list1;
                list1=list1.next;
                }
            }
            if(list1.val<list2.val){
                newlist=list1;
                list1=list1.next;
            }
            else{
                newlist=list2;
                list2=list2.next;
            }  
        }
        return newlist;
    }
}