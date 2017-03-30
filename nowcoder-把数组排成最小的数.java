
/*
输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
*/


/*
思路：
* 先将整型数组转换成String数组，然后将String数组排序，最后将排好序的字符串数组拼接出来。
关键就是制定排序规则。 
* 排序规则如下： 
* 若ab > ba 则 a > b， 
* 若ab < ba 则 a < b， 
* 若ab = ba 则 a = b； 

* 比如 "3" < "31"但是 "331" > "313"，所以要将二者拼接起来进行比较

*/
import java.util.*;
public class Solution {
    public String PrintMinNumber(int[] numbers) {
        if(numbers == null || numbers.length == 0)
            return "";
        String[] str = new String[numbers.length];  //字符数组 和number等长
        StringBuffer res = new StringBuffer();    //结果

        for(int i=0;i<numbers.length;i++)
            str[i] = String.valueOf(numbers[i]);  //整型转换存入字符数组

        Arrays.sort(str,new Comparator <String>(){   //Arrays.sort(T[], Comparator < ? super T > c) 方法用于对象数组按用户自定义规则排序. 
            public int compare(String s1,String s2){
                String c1=s1+s2;
                String c2=s2+s1; 
                return c1.compareTo(c2);            //如果整数等于参数，则返回0。
                                                    //如果整数是小于参数则返回-1。
                                                    //如果该整数大于参数则返回1。(我打印了一下还有-2，为什么？)

            }
        });

        for(int i=0;i<numbers.length;i++)
            res.append(str[i]);        

        return res.toString();          //StringBuffer 转为 string
        
    }
}