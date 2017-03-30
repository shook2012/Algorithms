/*
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。
ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数。
*/

/*
思路1：
转换为字符串

思路2：（没有看）
https://leetcode.com/discuss/44281/4-lines-o-log-n-c-java-python
*/
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            StringBuffer s = new StringBuffer(i + ""); //转换为字符串(string不太好)
            for (int j = 0; j < s.length(); j++) { //对每个数字每一位循环
                if (s.charAt(j) == '1') //注意这里charat返回的是字符不是Int
                    count++;
            }
        }
        return count;
    }
}



class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10)
            ones += (n / m + 8) / 10 * m + (n / m % 10 == 1) * (n % m + 1);
        return ones;
    }
}