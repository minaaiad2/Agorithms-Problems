import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class LeetCode {

	
    public static void moveZeroes(int[] nums) {
    	
    	int insertPos=0;
    	for (int i=0;i<nums.length;i++)
    	{
    		if(nums[i]!=0)
    		{
    			nums[insertPos]=nums[i];
    			insertPos++;
    		}
    		
    	}
    	while(insertPos<nums.length)
    	{
    		nums[insertPos]=0;
			insertPos++;
    	}
        
        
    }
	
    public List<String> fizzBuzz(int n) {
        List<String> ans=new LinkedList<String>();
        
        for(int i=0;i<=15;i++)
        {
        	if(i%3==0)
        		ans.add("Fizz");
        	else if(i%5==0)
        		ans.add("Buzz");
        	else
        		ans.add(""+i);
        }
        return ans;
    }
   public String reverseString(String s) {
        String ans="";
        StringBuilder xx=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
        	
        	xx.append(s.charAt(s.length()-1-i));
        }
       ans=xx.toString();
        return ans;
    }
   public int singleNumber22(int[] nums) {
    
	   HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	   for(int i=0;i<nums.length;i++)
	   {
		   Integer temp=hm.get(nums[i]);
		   if(!hm.containsKey(nums[i]))
			   hm.put(nums[i], nums[i]);
		   else
			   hm.remove(nums[i]);
	   }
	  
	      
	      
	      Iterator i = hm.keySet().iterator();
	     Integer result=0;
	      while(i.hasNext())
	      {
	    	  result=(Integer) i.next();
	      }
	      
	    
	   return result.intValue();
   }
   public static int singleNumber(int[] nums) {
	    int result = 0;
	    for(int i : nums) {
	        result ^= i;
	    }
	    return result;
	}
   public static int firstUniqChar(String s) {
       char [] a=s.toCharArray();
       int ans=-1;
       for(int i=0;i<a.length;i++)
       {
    	if(s.indexOf(a[i])==s.lastIndexOf(a[i]))   
    	{
    		ans=i;
    		break;
    	}
       }
       return ans;
   }
	public static void main(String[] args) {
	String s="mina";
		System.out.println(s.indexOf('a'));

	}

}
