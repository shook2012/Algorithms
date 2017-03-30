/*
HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,他又发话了:
在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
*/

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {   //数组为空 最大和为零
            return 0;
        }
        int sign = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0)
                sign = 0;     //说明存在负数
        }
        int count = 0;

        if (sign == 1) {  //当数组全为正数，直接求和
            for (int i = 0; i < array.length; i++) {
                count += array[i];
            }
            return count;
        } else {    //数组存在负数（其实没必要分正负，后面动态规划算法可以包括任何数）
            count = array[0];
            int cur = array[0];  //动态规划
            for (int i = 1; i < array.length; i++) {
                cur = (cur < 0) ? array[i] : array[i] + cur;  //如果之前的和小于零了，那就没有添加到和中的必要了，就直接舍掉从头来
                count = (cur > count) ? cur : count;  //始终保持一个最大的
            }
            return count;
        }
    }
}