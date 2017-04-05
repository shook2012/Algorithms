/*
一个整型数组里除了两个数字之外，其他的数字都出现了两次。
请写程序找出这两个只出现一次的数字。
*/

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

/*
思路1：O(n*n)
在java程序里面的异或用法：
相同输出0，不同输出1
例如：
System.out.println(1^1); 输出0
System.out.println(1^2)；输出3，因为最后2个低位都不一样，所有输出3 


思路2：O(n)
我们还是从头到尾依次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果。
因为其它数字都出现了两次，在异或中全部抵消掉了。由于这两个数字肯定不一样，那么这个异或结果肯定不为0,
也就是说在这个结果数字的二进制表示中至少就有一位为1.
我们在结果数字中找到第一个为1 的位的位置，记为第N位。
现在我们以第N  位是不是1 为标准把原数组中的数字分成两个子数组，第一个子数组中每个数字的第N 位都为1 ，
而第二个子数组的每个数字的第N位都为0 。 
现在我们已经把原数组分成了两个子数组，每个子数组都包含一个只出现一次的数字，而其它数字都出现了两次。
*/

public class Solution {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int[] res = new int[array.length]; //每个数字计数
        int count = array.length; //数组长度，变量名写错了
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if ((array[i] ^ array[j]) == 0)
                    res[i]++; //凡是出现两次的数，会有两次计数（自己和相同的数字）
            }
        }
        int mid = 0;
        for (int i = 0;; i++) {
            if (res[i] == 1) {
                num1[0] = array[i];
                mid = i;
                break;
            }
        }
        for (int i = mid + 1; i < count; i++) {
            if (res[i] == 1) {
                num2[0] = array[i];
                break;
            }
        }
    }

}

    //思路2：
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {

        if (array == null || array.length < 2)

            return;

        int temp = 0;

        for (int i = 0; i < array.length; i++)

            temp ^= array[i];    //得到的结果就是两个只出现一次的数字的异或结果

        int indexOf1 = findFirstBitIs(temp);   //在结果数字中找到第一个为1 的位的位置

        for (int i = 0; i < array.length; i++) {

            if (isBit(array[i], indexOf1))     //第一个子数组中每个数字的第N 位都为1

                num1[0] ^= array[i];

            else                                //第二个子数组的每个数字的第N位都为0

                num2[0] ^= array[i];

        }

    }

    public int findFirstBitIs(int num) {

        int indexBit = 0;

        while (((num & 1) == 0) && (indexBit) < 8 * 4) {

            num = num >> 1;

            ++indexBit;

        }

        return indexBit;

    }

    public boolean isBit(int num,int indexBit){ 

          num = num >> indexBit; 

          return (num & 1) == 1; 

      }
