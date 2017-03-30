/*
把只包含因子2、3和5的数称作丑数（Ugly Number）。
例如6、8都是丑数，但14不是，因为它包含因子7。 
习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
*/

/*
思路1：（此方法会超时）
从1开始不断增加，判断是否为丑数，并且计数，直到计数等于N

//思路2：
下一个最小的数，无非是之前的数字 乘以2或者3或者5
凡是乘过出现最小的数后，就不会再用这个数去乘了，就移一位
看代码吧，太屌
*/

//思路1：
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 1)
            return 1;
        int count = 1;
        for (int j = 2;; j++) {
            int i = j; //保持J不变，让I减小直到1
            while (i > 1) {
                if (i % 2 == 0)
                    i /= 2;
                if (i % 3 == 0)
                    i /= 3;
                if (i % 5 == 0)
                    i /= 5;
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                    break;
            }
            if (i == 1)
                count++;
            if (count == index) {
                return j;
            }
        }
    }
}

//思路2：
public class Solution {import java.util.*;
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)  //小于7的数都是丑数
            return index;
        int[] res = new int[index];
         res[0]=1;  //第一个丑数是 1
        int t2 = 0, t3 = 0, t5 = 0;
        int i=0;
        for (i = 1; i < index; ++i) {
            res[i] = Math.min(res[t2] * 2, Math.min(res[t3] * 3, res[t5] * 5));   
            if (res[i] == res[t2] * 2)
                t2++;
            if (res[i] == res[t3] * 3)
                t3++;
            if (res[i] == res[t5] * 5)
                t5++;
        }
            return res[index - 1];
    }
}