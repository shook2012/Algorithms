/*
大家都知道斐波那契数列，现在要求输入一个整数n，
请你输出斐波那契数列的第n项。n<=39
*/


/*
思路1：
就用循环，超快的。。。log(n)时间复杂度，O(1)空间复杂度

思路2：
迭代（Iteration） 对空间不友好吧后两种。。未尝试

思路3：
递归（Recursion）
*/
public class Solution {
    public int Fibonacci(int n) {
		int a=1;   
        int b=1;
        if(n==0)
            return 0;         //测试里第0项是0
        if(n<3)
            return 1;
        else
        for(int i=0;i<n-2;i++){
           //a,b分别向后移动一位
            b=a+b;
            a=b-a;
        }
        return b;
    }
}