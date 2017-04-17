
/*
输入一个递增排序的数组和一个数字S，在数组中查找两个数，
是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
输出描述:
对应每个测试案例，输出两个数，小的先输出。
*/



/*
思路1：（注意是上一题【和为S的连续整数序列的区别：双指针的位置不同）
数列满足递增，设两个头尾两个指针i和j， 
  若ai + aj == sum，就是答案（相差越远乘积越小） 
  若ai + aj > sum，aj肯定不是答案之一（前面已得出 i 前面的数已是不可能），j -= 1 
  若ai + aj < sum，ai肯定不是答案之一（前面已得出 j 后面的数已是不可能），i += 1
*/
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int low = 0, high = array.length-1;
        
        while ( low < high) {
            if ((array[low] + array[high]) < sum)
                low++;
            if ((array[low] + array[high]) == sum) {
                res.add(array[low]);
                res.add(array[high]);
                break;  //a和b越远乘积越小，而一头一尾两个指针往内靠近的方法找到的就是乘积最小的情况。
            }
            if ((array[low] + array[high]) > sum)
                high--;
        }
        
        return res;

    }
}