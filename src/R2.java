import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class R2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        int m = in.nextInt();
        int maxReviewHotel=0;
        int hotelId=0;
        HashMap hm = new HashMap();
        HashMap hotelIds = new HashMap();
        String [] wordsArr=words.split(" ");
        for(int i=0;i<wordsArr.length;i++)
        {
        	hm.put(wordsArr[i], wordsArr[i]);
        }
        int currId=in.nextInt();
        for(int i=0;i<(m*2);i++)
        {
        	
        	if(i%2==0)//process review
        	{
        		String review=in.nextLine();
        		String [] reviewArr=review.split(" ");
        		int currentScore=0;
        		for(int x=0;x<reviewArr.length;x++)
        		{
        			if(hm.containsKey(reviewArr[x]))
        			{
        				currentScore++;
        			}
        		}
        		if(hotelIds.containsKey(currId))
        		{
        			int oldScore=Integer.parseInt( hotelIds.get(currId).toString());
        			int newScore=oldScore+currentScore;
        			hotelIds.put(currId, newScore);
        		}
        		else
        		{
        			hotelIds.put(currId, currentScore);
        		}
        	
       
        	}
        	else //id
        	{
        		currId=in.nextInt();
        	}
        }
        ArrayList<Integer> result=new ArrayList<Integer>(hotelIds.values());
        Collections.sort(result);
        Collections.reverse(result);
    	for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}


	}

}
