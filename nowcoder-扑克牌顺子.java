
/*
LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....
LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0。
*/

/*
思路1：
我基本穷举了，非常难看，非常非常难看。
首先先排序，每个条件下先排除相等的情况，然后看相邻的差值。
没有考虑是否会超出扑克的范围，比如出现数字16

思路2：
事后想了一下，确实没必要考虑有几个王，在保证不重复的情况下，把最大最小值卡死，就够了。

max 记录 最大值 
min 记录  最小值 
min ,max 都不记0 
满足条件 ：
1 max - min  <5                
2 除0外没有重复的数字(牌)                
3 数组长度 为5
*/
import java.util.*;

public class Solution {
    public boolean isContinuous(int[] numbers) {
        if (numbers.length == 0)
            return false;
        Arrays.sort(numbers);
        if (numbers[0] != 0) { //有0个王
            int d = numbers[1] - numbers[0];
            if ((numbers[4] - numbers[3]) == d && (numbers[3] - numbers[2]) == d && (numbers[2] - numbers[1]) == d) {
                return true;
            } else
                return false;
        }
        if (numbers[3] == 0) { //有4个王
            return true;
        } else if (numbers[2] == 0) { //有3个王
            if (numbers[4] == numbers[3])
                return false;
            if ((numbers[4] - numbers[3]) <= 4)
                return true;
            else
                return false;
        } else if (numbers[1] == 0) { //有2个王
            if ((numbers[4] == numbers[3]) || numbers[3] == numbers[2])
                return false;
            if ((numbers[4] - numbers[3]) <= 2 && (numbers[3] - numbers[2]) <= 2)
                return true;
            else if ((numbers[4] - numbers[3]) * (numbers[3] - numbers[2]) == 3)
                return true;
            return false;
        } else { //有1个王
            if (numbers[4] == numbers[3] || numbers[3] == numbers[2] || numbers[2] == numbers[1])
                return false;
            if ((numbers[4] - numbers[3]) * (numbers[3] - numbers[2]) * (numbers[2] - numbers[1]) == 2)
                return true;
            else
                return false;
        }

    }

}

//思路2：
public boolean isContinuous(int [] numbers) { 
int[]d = new int[14];  
d[0] = -5;  
int len = numbers.length;  
int max = -1;  
int min = 14;  
for(int i =0;i<len;i++){
    d[numbers[i]]++;  
    if(numbers[i] == 0){  //有零就跳过
        continue;  
    } 
    if(d[numbers[i]]>1){  //有重复的就返回FALSE
        return false;  
    } 
    if(numbers[i] >max){
        max = numbers[i];  
    } if(numbers[i] <min){
        min = numbers[i];  
    }
 
} 
if(max -min<5){ 
    return true;  
} 
    return false; 
}
