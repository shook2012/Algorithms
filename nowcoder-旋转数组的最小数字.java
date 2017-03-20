/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个不减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/

/*
思路1：
题目中时间限制为3秒，所以直接一个for循环，通过了测试。。
思路2：
使用二分查找，问题是数组不是递增序列，而是不减序列，当有相同值的时候需要再加一个拍段
*/

//思路1：
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;

    	int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}

//思路2：时间和内存都比思路1大。。醉了（这个是南大一个哥们写的，可以通过。。）
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];
    }
}










