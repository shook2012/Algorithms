/*
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
*/


/*
思路1：
最常规的方法写下去，注意区分指数大于小于等于零的情况
因为指数是Int型，所以不用考虑指数在（0,1）区间的情况
注：使用 return exponent < 0 ? 1/ r : r; 会显得更简洁

思路2：（未使用)
使用递归，时间复杂度O(logn)
当n为偶数，a^n =（a^n/2）*（a^n/2）
当n为奇数，a^n = a^[(n-1)/2] * a^[(n-1)/2] * a

*/




//思路1：
public class Solution {
    public double Power(double base, int exponent) {
        double ans=1;
        if(exponent == 0){  //等于零
            return 1;
        }
        if(exponent>0){    //大于零
        for(int i=1;i<=exponent;i++){
            ans *= base;
        }
            return ans;
        }
        else{    //小于零
            exponent=-exponent;
            for(int i=1;i<=exponent;i++){
            ans *= base;
        }
            return 1/ans;
        }
       
  }
}