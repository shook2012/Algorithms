/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
*/


/*
思路1：
经过一分钟的思考，发现还是一个斐波那契数列。。。
注意一点，不要以为f(n)=f(n-1)+2*f(n-2),因为f(n-2)中如果把小矩形横着摆放，就和f(n-1)一样了
代码都没改。。。
*/

public class Solution {
    public int RectCover(int target) {
        int a=1;   
        int b=1;
        if(target == 0) //第一次没通过于是加了这个
            return 0;
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