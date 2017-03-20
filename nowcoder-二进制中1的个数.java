/*
输入一个整数，输出该数二进制表示中1的个数。
其中负数用补码表示。
*/

/*
思路1：（我觉得给我一天我也想不到）
如果一个整数不为0，那么这个整数至少有一位是1。
如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，
原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。
其余所有位将不会受到影响。
把一个整数减去1，再和原整数做与运算，
会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。

思路2：（偷工减料的方式）
  return Integer.toBinaryString(n).replaceAll("0","").length(); 
或者
  return Integer.bitCount(n);

思路3：（我能想到的思路）
把n和1做与运算，如果结果是1，说明最后一位是1，如果结果是0，说明最后一位是0；
注意负数要做处理，可以将最高位的符号位1变成0，也就是n & 0x7FFFFFFF，
这样就把负数转化成正数了，唯一差别就是最高位由1变成0，因为少了一个1，所以count加1

*/



//思路1：
public class Solution {

    public int NumberOf1(int n) { 
        int count = 0; 
        while(n!= 0){ 
        count++; 
        n = n & (n - 1);
        }
        return count;
    }
}

//思路3：
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        if (n < 0) {     //将负数最高位置零
            n = n & 0x7FFFFFFF;  //不做这个处理直接进入while是不行的,因为负数的右移前面是补零
                                //对于带符号右移,若为负数,则在存储时首位表示符号位,其值为1在移位过程中,高位补1,
                                //若符号位是0,表示是正数,在移位过程中高位补零
            ++count;
        }
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }
}