/*
牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
正确的句子应该是“I am a student.”。
Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
*/

/*
java.lang.String.trim() 方法返回一个字符串副本，并忽略(去除)开头和结尾的空白 
*/

import java.util.*;

public class Solution {
    public String ReverseSentence(String str) {
        if (str.trim().equals("")) //java.lang.String.trim() 方法返回一个字符串副本，并忽略(去除)开头和结尾的空白 
            return str;
        StringBuffer res = new StringBuffer();
        String[] s = str.split(" "); //将str这个字符串用空格“ ”进行分割，分割后的字符串数组放在s[]中
        for (int i = s.length - 1; i >= 0; i--) {   //注意这里是数组长度，不是字符串长度
            res.append(s[i]);
            res.append(" ");   //这样的后果会让最后多一个空格，所以下面用trim()处理
        }

        return res.toString().trim(); //java.lang.String.trim() 方法返回一个字符串副本，并忽略(去除)开头和结尾的空白 
    }
}