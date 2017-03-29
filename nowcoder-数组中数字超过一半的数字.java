/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
*/


/*
思路1：
采用阵地攻守的思想：第一个数字作为第一个士兵，守阵地；count = 1；
遇到相同元素，count++;遇到不相同元素，即为敌人，同归于尽,count--；
当遇到count为0的情况，又以新的i值作为守阵地的士兵，继续下去，
到最后还留在阵地上的士兵，有可能是主元素。再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
*/
public class Solution {
   public static int MoreThanHalfNum_Solution(int [] array) {
        int count=0;
        int defend=0; //阵地上防守的士兵
        for(int i=0;i<array.length;i++){
            if(count == 0){
                defend=array[i];
                count=1;
                continue; //一旦阵地没人，补充人数后就进入下次循环
            }
            if(array[i] != defend){
                count--;
            }
            else 
                count++;
        }    
        int realcount=0;
       if(count>1){  //如果是奇数的话，如果除最后一项外全部同归于尽，最后count=1,defend=最后一项，那就需要后面的循环判断了。
           return defend;
       }
       else{ for(int i=0;i<array.length;i++){
            if(array[i]==defend)
                realcount++;
        }
       
        if(realcount*2 > array.length)
            return defend;
        else
            return 0;
        }
    }
}