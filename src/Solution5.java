import java.util.Arrays;
import java.util.Scanner;


public class Solution5 {

    static int[] mergeArrays(int[] a, int[] b) {
        
               
		       
		        int[] newArray = new int[a.length + b.length];
		        System.arraycopy(a, 0, newArray, 0, a.length);
		        System.arraycopy(b, 0, newArray, b.length, b.length);
		      Arrays.sort(newArray);
		        return newArray;
		      
        
    }
	public static void main(String[] args) {
	
		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		       int nSize=2*n;
		        int a[] = new int[nSize];
		        for(int a_i=0; a_i < nSize; a_i++){
		            a[a_i] = in.nextInt();
		        }
		      
		        Arrays.sort(a);
		      
		    

	}

}
