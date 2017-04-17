/*
题目描述
将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 
输入描述:
输入一个字符串,包括数字字母符号,可以为空


输出描述:
如果是合法的数值表达则返回该数字，否则返回0

输入例子:
+2147483647
    1a33

输出例子:
2147483647
    0
*/
public class Solution { //没有考虑边界 不过AC了
    public int StrToInt(String str) {
        int signal = 1, res = 0;
        char[] s=str.toCharArray();
        if(str.length()==0)
            return 0;
       if (s[0] == '+') {
            signal = 1;
            s[0] = '0';
        }
        if (s[0] == '-') {
            signal = -1;
            s[0] = '0';
        }
        for (int i = 0; i < str.length(); i++) {
            if (s[i] < '0' || s[i] > '9') {
                return 0;
            }
            res = res * 10 + (s[i] - '0');
        }
        return signal*res;
    }
}
