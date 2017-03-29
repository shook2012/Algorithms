/*
题目描述:
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
*/

/*
思路1：
【迭代】：字典生成算法，也就是把一个整数和比它小的整数的全排列由小到大的列出。
求一个字典序的算法就是要能找出已得到排列的下一个排列。
eg:123，132，213，232，312，321
eg:排列839647521，首先从最右端开始，找到第一个比它的右临位小的数字，即4，
然后从该数字的右边找到比它大的最小的数字，即5，交换两数字，原排列变为839657421
最后将5位置右端的数字倒序排列，即变为839651247，这就是原排列的下一排列。
于是我们的程序就只需要从1234……n，开始不停的找它的下一排列，直到不存在比他的右临位小的数字（n……4321）为止。
需要注意的是交换了元素，然后进行递归对子序列进行全排列之后，需要将元素的位置换回来。
思路2：
【递归】
代码就是下面的代码，然而单步调试了半天，我还是没有看懂。。。



*/



import java.util.*;

public class Main {

	public static void main(String[] args) {
		String str =new String();
		str="abcd";
		ArrayList<String> ans =new ArrayList<String>();
		ans = Permutation(str);
		System.out.println(ans);
			
	}

	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> res = new ArrayList<>();
		if (str != null && str.length() > 0) {
			PermutationHelper(str.toCharArray(), 0, res);
			Collections.sort(res);
		}
		return res;
	}

	public static void swap(char[] cs, int i, int j) {
		char temp = cs[i];
		cs[i] = cs[j];
		cs[j] = temp;
	}

	private static void PermutationHelper(char[] cs, int i, ArrayList<String> list) {
		if (i == cs.length - 1) { // 解空间的一个叶节点            
			list.add(String.valueOf(cs)); // 找到一个解        
		} else {
			for (int j = i; j < cs.length; ++j) {
				if (j == i || cs[j] != cs[i]) {
					swap(cs, i, j);
					PermutationHelper(cs, i + 1, list);
					swap(cs, i, j); // 复位
				}
			}
		}
	}

}
