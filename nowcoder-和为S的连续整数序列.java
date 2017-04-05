
/*
题目描述
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? 

输出描述:
输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
*/

/*
思路1：
//根据数学公式计算:(a1+an)*n/2=s  n=an-a1+1       
//(an+a1)*(an-a1+1)=2*s=k*l(k>l)       
//an=(k+l-1)/2  a1=(k-l+1)/2

思路2：双指针
//当总和小于sum，大指针继续+
//否则小指针+
用两个数字begin和end分别表示序列的最大值和最小值，
首先将begin初始化为1，end初始化为2.如果从begin到end的和大于s，
我们就从序列中去掉较小的值(即增大begin),相反，只需要增大end。
终止条件为：一直增加begin到(1+sum)/2并且end小于sum为止
*/

//思路1：
import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (sum < 3)
            return res;
        int mid = (int) Math.sqrt(2 * sum); // l < sqrt(2*sum) < k
        for (int l = mid; l > 1; l--) { //从sqrt(2*sum)到l
            if (2 * sum % l == 0) {
                int k = 2 * sum / l; //求出k
                if ((k % 2 == 0 && l % 2 != 0) || (k % 2 != 0 && l % 2 == 0)) { // 由an=(k+l-1)/2  a1=(k-l+1)/2得
                                                                                // k和l必须为一个奇数一个偶数
                    int a1 = (k - l + 1) / 2;
                    int an = (k + l - 1) / 2;
                    ArrayList<Integer> sub_res = new ArrayList<Integer>();
                    for (int i = a1; i <= an; i++) //得到一个结果存入
                        sub_res.add(i);
                    res.add(sub_res);
                }
            }
        }
        return res;
    }
}

//思路2:(用时更短)

import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int a1 = 1, an = 2, tol = 0;
        ;
        while (a1 < (sum + 1) / 2 && an < sum) { //一直增加begin到(1+sum)/2并且end小于sum为止
            tol = (a1 + an) * (an - a1 + 1) / 2;  //求和公式
            if (tol < sum)
                an++;
            if (tol == sum) {
                ArrayList<Integer> sub_res = new ArrayList<Integer>();
                for (int i = a1; i <= an; i++) //得到一个结果存入
                    sub_res.add(i);
                res.add(sub_res);
                a1++;  //注意要有这句
            }
            if (tol > sum)
                a1++;
        }
        return res;
    }
}