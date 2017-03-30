/*
思路1：
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

思路2：
堆排列
*/

import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        	ArrayList<Integer> res = new ArrayList<Integer>();
        	if(input==null || input.length<=0 || input.length<k)
                return res;
	    	
	    	//input=intput.sort();
	    	Arrays.sort(input);//快排
	    	for(int i=0;i<k;i++){
	    		res.add(input[i]);
	    	}
	    	return res;
	    }
}