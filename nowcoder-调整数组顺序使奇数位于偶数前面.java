/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
*/

/*
思路1：
最傻的方法，先把奇数存到数组B中，再把偶数存进去，然后让数组A等于数组B,应该是O(n)？
判断奇偶还可以用与运算
*/
public class Solution {
    public void reOrderArray(int [] array) {
        int[] newarray = new int[array.length];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(isOdd(array[i])){
                newarray[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(!isOdd(array[i])){
                newarray[j]=array[i];
                j++;
            }
        }
        for(int i=0;i<array.length;i++)
        	array[i]=newarray[i];
    }
    private boolean isOdd(int n){
        if(n%2==1)
            return true;
        else
            return false;
    }
}