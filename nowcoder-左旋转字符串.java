/*
汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
*/

/*
思路1：
用一个写函数：截取和拼接


思路2：
把字符串复制一遍，取中间的部分就是答案
*/

//思路1：
public class Solution {
    public String LeftRotateString(String str, int n) {
        String res1, res2;
        if (str.length() == 0)
            return "";
        n = n % str.length(); //可能循环很多遍
        res1 = str.substring(n, str.length()).trim();
        res2 = str.substring(0, n).trim();
        return res1.concat(res2); //连接两个字符串
    }
}

//思路2：

class Solution {
    public String LeftRotateString(String str, int n) {
        int len = str.length();
        if (len == 0)
            return "";
        n = n % len;
        tr += str;
        return str.substr(n, len);
    }
}