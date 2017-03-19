/*
在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
*/


/*
思路：
矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
因此从左下角开始查找，当要查找数字比左下角数字大时，右移；
要查找数字比左下角数字小时，上移；

为什么不能从左上：有两个方向都可变化

还可以用二分查找
*/
public class Solution {
    public boolean Find(int target, int [][] array) {
		int row=array.length-1;
        int col=0;
        while(row >=0 && col <= array[0].length-1){
            if(target == array[row][col]){
                return true;
            }
            if(target <array[row][col]){
                row--;
            }
            else
                col++;
        }
     
        return false;
    }
}