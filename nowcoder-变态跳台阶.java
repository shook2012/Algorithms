/*
一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
求该青蛙跳上一个n级的台阶总共有多少种跳法。
*/

/*
思路1：
还是先推一下，有时候数学上简单推一下。会把问题简化很多
 f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) 
      = f(n-1)+f(n-1)
一下子很简单了就，膜拜大神的思路
思路2：
除了最后一个台阶，每个台阶都有【跳】和【不跳】两种状态
所以一共是2^(n-1)种，做完了。。。膜拜大神的思路
*/

//思路1：
public class Solution {
    public int JumpFloorII(int target) {
        int a=1,b=1;
        int ans=0;
        if(target == 1){
            return 1;
        }
        else
            for(int i=1;i<target;i++){
                return 2*JumpFloorII(target-1);  //f(n) = f(n-1)+f(n-1)
            }
        return -1;
    }
}

//思路2：
public class Solution {
    public int JumpFloorII(int target) {
       return  1<<--target; //1移位n-1次，相当于pow(2,n-1)
    }
}
