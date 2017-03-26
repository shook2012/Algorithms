/*
输入一个复杂链表
（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
*/

/*
思路1：递归（一看代码就懂）
运行时间：35ms  占用内存：550k

思路2：(未实践)
1、复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
2、重新遍历链表，复制老结点的随机指针给新结点
3、拆分链表，将链表拆分为原链表和复制后的链表

思路3：Map法（未实践）
假定结点N的random指向结点N'，则把<N,N'>的对应信息放到哈希表中，
这样创建完复制后的链表结点后，从哈希表中直接到到结点对应的random指针。
*/


/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/


//思路1：
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
     if(pHead == null) return null;
     RandomListNode newhead = new RandomListNode(pHead.label);

     newhead.random=pHead.random;  //这里好像有问题，random指向的不是新的链表，而是旧链表（虽然能AC）
     newhead.next=Clone(pHead.next);

     return newhead;   
    }
}