import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
     
    	int [] answer=new int[n];
    	int j=k;
    	for(int i=0;i<n;i++)
    	{
    		j=Math.abs(n-k-1);
    		answer[i]=a[j];
    		
    	}
    	return answer;
    	
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
