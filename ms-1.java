package neteasy;

import java.util.*;
import java.util.regex.Pattern;



public class Main {

	public static class queen {
	    int x = 0;
	    int y = 0;
	}
	  
    public static void main(String[] args) {
        //[1,2,4,7,11,15],15
       // Scanner in = new Scanner(System.in);
       // while (in.hasNext()) {
    	//String s = String.valueOf(1/3);
    	//int[] array={1,2,4,7,11,15};
    	String str="student. a am I";
    	 //System.out.println(s);
       //  System.out.println(ReverseSentence(str) );
    	
    	queen[] q = new queen[100000];

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            q[i] = new queen();
        }
        int count=0;
        int i = 0;
        while (in.hasNext()) {
            q[i].x = in.nextInt();
            q[i].y = in.nextInt();
            i++;
        }
        
        for(int j=0;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                if((q[j].x==q[k].x)||(q[j].y==q[k].y)||(Math.abs(q[j].x-q[k].x)==Math.abs(q[j].y-q[k].y))){
                    count++;
                }
            }
        }


        
            System.out.println(count);
        
        
           
        
       }
    
    
  

   
}