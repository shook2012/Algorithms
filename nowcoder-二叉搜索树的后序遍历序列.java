/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
假设输入的数组的任意两个数字都互不相同。
*/

/*
BST的后序序列的合法序列是，对于一个序列S，
最后一个元素是x也就是根），如果去掉最后一个元素的序列为T，那么T满足：
T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。
*/

/*
BST的中序遍历必定是严格递增的。
*/

/*
思路1：
相当精妙，抓住了后序遍历最大的特点：序列前一部分都小于最后的值，后一部分都大于最大的值。
二叉搜索树的后序遍历序列可以看成后序遍历是左右中左边的小于最后一个元素，右边的大于最后一个元素。
i指针指向要和最后一个元素比较的位置，如果是搜索树最后i指针可以移动到n的位置。
思路2：递归递归
*/


//思路1：非递归，O(N)
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        int n = sequence.length;
        if(n == 0)
            return false;
        int i=0;
        while((--n)>0){
            while(sequence[i]<sequence[n]) i++; //序列前一部分都小于最后的值
            while(sequence[i]>sequence[n]) i++; //后一部分都大于最大的值。
            if(i<n) return false;
            i=0;
        }
        return true;
    }
}



//思路2：递归
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        
        return isBST(sequence,0,sequence.length-1);  //判断整个序列
    }
    public boolean isBST(int[] sequence,int start,int end){     //每次判断序列从start到end
        if(start == end || start == end+1)     //说明这个序列已经长度为零了，就是说明都满足，也是迭代结束的条件
            return true;
        int i = start;
        while(sequence[i]<sequence[end]){       //用i找到左右子树的分界线
            i++;
        }
        int j=i;
        for(;j<end;j++){
            if(sequence[j]<sequence[end])     //如果右子树还有比根节点小，说明出错
                return false;
        }
        return isBST(sequence,start,i-1) && isBST(sequence,j,end-1);    //最后迭代，注意边界范围
    }
}


