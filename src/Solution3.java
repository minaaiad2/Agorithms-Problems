import java.util.Scanner;


public class Solution3 {

	
	 public static int kDifference(int[] a, int k) {
		 int ans=0;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(Math.abs(a[i]-a[j])==Math.abs(k))
					 ans++;
			 }
		 }
		 return ans;

	    }
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n=in.nextInt();
	        int [] array=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	array[i]=in.nextInt();
	        }
	        int k=in.nextInt();
	        System.out.println(kDifference(array, k));
	       
	 }
	
	}


