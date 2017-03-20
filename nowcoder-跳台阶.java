/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/

/*
思路1：
f(n) = f(n-1) + f(n-2) ,所以又是一个斐波那契数列，注意序号稍有不同
思路2：
也可以迭代啦， return  JumpFloor(target-1)+JumpFloor(target-2); 就是效率不高
*/

public class Solution {
    public int JumpFloor(int target) {
		int a=1;   
        int b=1;
       if(target == 1)
           return 1;
        else
        for(int i=0;i<target-1;i++){   //正常的斐波那契数列这里是target-2
           //a,b分别向后移动一位
            b=a+b;
            a=b-a;
        }
        return b;
    }
}