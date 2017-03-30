/*
输入两个链表，找出它们的第一个公共结点。
*/

/*
思路1：（还有优化的空间）
找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走

思路2：
用两个指针（C++），一画图就很明白，代码很短（未实践）
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*//*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if((pHead1==null) ||(pHead2 == null)) //如果为空直接返回
            return null;

        int len1=0,len2=0;
        ListNode p1=pHead1,p2=pHead2;
        ListNode cur1=null,cur2=null;

        while(p1!=null){ //分别记录两个链表的长度
            cur1=p1;
            p1=p1.next;
            len1++;
        }
        while(p2!=null){ //分别记录两个链表的长度
            cur2=p2;
            p2=p2.next;
            len2++;
        }
        if(cur1 != cur2)  //cur存有两个链表的最后一个节点，如果最后一个节点都不相等，那说明没有公共节点
            return null;  //此处可省略，但是后面有问题会报错，加上这个就不报错了，说明后面关于空集有问题

        if(len1>len2){  //让比较长的链表先移动len1-len2的距离，保证两链表长度相等
            int d_len=len1-len2;
            while(d_len>0){
                pHead1=pHead1.next;  //移动d_len步
                --d_len;
            }
            while(!pHead1.equals(pHead2)){  //进行判断是否相等
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return pHead1;
        }

        else{  
            int d_len=len2-len1;
            while(d_len>0){
                pHead2=pHead2.next;
                --d_len;
            }
            while(!pHead1.equals(pHead2)){
                pHead1=pHead1.next;
                pHead2=pHead2.next;
                
            }
            return pHead1;
        }
    }
}


//思路2：（C++）
class Solution {
    public:
    ListNode* FindFirstCommonNode( ListNode *pHead1, ListNode *pHead2) {
        ListNode *p1 = pHead1;
        ListNode *p2 = pHead2;
        while(p1!=p2){
            p1 = (p1==NULL ? pHead2 : p1->next);
            p2 = (p2==NULL ? pHead1 : p2->next);
        }
        return p1;
    }
};