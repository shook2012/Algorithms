/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如 
如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/

/*
这个边界检测好蛋疼。。。没AC
*/


import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> newmatrix = new ArrayList<Integer> ();
       int row=matrix.length;
       int col=matrix[0].length;
       int left=0,right=col-1,top=0,bottom=row-1;
     
       while(left<=right && top<=bottom){
           for(int i=left;i<=right;++i)    {newmatrix.add(matrix[top][i]);}
           for(int i=top+1;i<=bottom;++i)     {newmatrix.add(matrix[i][right]);}
           for(int i=right-1;i>=left;--i)     {newmatrix.add(matrix[bottom][i]);}
           for(int i=bottom-1;i>top;--i)    {newmatrix.add(matrix[i][left]);}
           left++;right--;top++;bottom--;
       }
      
       return newmatrix;
    }
}