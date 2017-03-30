/*
在一个字符串(1<=字符串长度<=10000，全部由字母组成)
中找到第一个只出现一次的字符,并返回它的位置。
如果字符串为空,返回-1
*/

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if ((str == null) || (str.length() == 0)) //字符串为空
            return -1;
        char[] ch = str.toCharArray(); //得到一个字符数组存放每一个字符
        int[] count = new int[(int) 'z' + 1]; //注意要加一，因为最后的位置比数组长度少一
        for (char x : ch) { //JDK 1.5对for语句进行了改进，为更好遍历数组，改进后的for语句格式如下：
                            //for(声明循环变量 : 数组名)

            count[(int) x]++; //对应的计数位置加一，注意：x不要加引号
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[(int) ch[i]] == 1) //找到第一个计数为1的就返回
                return i;
        }
    }
}
