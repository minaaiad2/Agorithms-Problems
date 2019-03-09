import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Solution4 {

	public static boolean isBST(String [] a)
	{

        Stack<Integer> s = new Stack<Integer>();
 
        int root = Integer.MIN_VALUE;
 
        for (int i = 0; i < a.length; i++) {
        
            if (Integer.parseInt(a[i]) < root) {
                return false;
            }

            while (!s.empty() && s.peek() < Integer.parseInt(a[i])) {
                root = s.peek();
                s.pop();
            }
            s.push(Integer.parseInt(a[i]));
        }
        return true;
	}
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String numOfArrays=in.nextLine();
	        int q=Integer.parseInt(numOfArrays);
	        for(int i=0;i<q;i++)
	        {
	        	String strArrayLenght=in.nextLine();
	        	int n=Integer.parseInt(strArrayLenght);
	        	String arryLine=in.nextLine();
	        	String [] elems=arryLine.split(" ");
	        	if(isBST(elems))
	        		System.out.println("YES");
	        	else
	        		System.out.println("NO");
	        	
	        }
	       
	       
	 }
	
}
