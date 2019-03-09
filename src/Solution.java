import java.util.LinkedList;
import java.util.Scanner;


public class Solution {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       
	       
	        
	        int squareCount=0;
	        int rectangleCount=0;
	        int otherPolyCount=0;
	       
	        while(in.hasNextLine())
	        {
	        	 String ln=in.nextLine();
	        	if(ln!=null && !ln.isEmpty())
	        	{
	        	String [] elems=ln.split(" ");
	 	     
	        	int a=Integer.parseInt(elems[0]);
	        	int b=Integer.parseInt(elems[1]);
	        	int c=Integer.parseInt(elems[2]);
	        	int d=Integer.parseInt(elems[3]);
	        	if(a<=0 || b<=0 || c<=0 ||d<=0)
	        		otherPolyCount++;
	        	else if((a==b)&&(b==c)&&(c==d))
	        		squareCount++;
	        	else if((a==c)&& (b==d))
	        		rectangleCount++;
	        	else
	        		otherPolyCount++;
	        	 }
	        	 
	        	
	        
	        }
	        
	        System.out.println(squareCount+" "+rectangleCount+" "+otherPolyCount+" ");
	        
	 }
	
}
