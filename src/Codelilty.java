import java.awt.HeadlessException;


public class Codelilty {

	private static int [] flagUsed=new int[4];
	
    


    private static boolean checkValidHourDigit(String x)
    {
    	int xx=Integer.parseInt(x);
    	if(xx<=23)
    		return true;
    	else
    		return false;
    }

    private static String getHour2(int B,int C,int D,int value)
    {
    	String answer="";
    	if(B>C && B>D &checkValidHourDigit(""+value+B))
		{
			answer=answer+B+":";
			for(int i=0;i<flagUsed.length;i++)
			{
				if(B==flagUsed[i])
				{
					flagUsed[i]=-1;
				}
			}
		}
		else if(C>D &checkValidHourDigit(""+value+C))
		{
			answer=answer+C+":";
			for(int i=0;i<flagUsed.length;i++)
			{
				if(C==flagUsed[i])
				{
					flagUsed[i]=-1;
				}
			}
		}
		else if(checkValidHourDigit(""+value+D))
		{
			answer=answer+D+":";
			for(int i=0;i<flagUsed.length;i++)
			{
				if(D==flagUsed[i])
				{
					flagUsed[i]=-1;
				}
			}
		}
    	return answer;
    }
    private static boolean ValidTime(String time)
    {
    	boolean result=true;
    	String [] hourMinutes=time.split(";");
    	int hour=Integer.parseInt(hourMinutes[0]);
    	int minutes=Integer.parseInt(hourMinutes[1]);
    	if(hour>23)
    		result=false;
    	if(minutes>59)
    		result=false;
    	
    	return result;
    }

    public static String solution(int A, int B, int C, int D) {
    		
    		flagUsed[0]=A;
    		flagUsed[1]=B;
    		flagUsed[2]=C;
    		flagUsed[3]=D;
    		String answer="";
    		if(A==2)
    		{
    			flagUsed[0]=-1;
    			answer=answer+"2";
    			answer=answer+getHour2(B, C, D,2);
    			if (flagUsed[1]==-1) {
					//B is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+B;
    				else
    					answer=answer+D+C;
    			}
    			
    		}else if(B==2)
    		{
    			flagUsed[1]=-1;
    			answer=answer+"2";
    			answer=answer+getHour2(A, C, D,2);
    			
    			if (flagUsed[0]==-1) {
					//A is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+A;
    				else
    					answer=answer+A+C;
    			}
    			
    			
    		}
    		else if(C==2)
    		{
    			flagUsed[2]=-1;
    			answer=answer+"2";
    			answer=answer+getHour2(B, A, D,2);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    			
    		}
    		else if(D==2)
    		{
    			flagUsed[3]=-1;
    			answer=answer+"2";
    			answer=answer+getHour2(B, C, A,2);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+C;
    				else
    					answer=answer+C+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+C;
    				else
    					answer=answer+C+A;
    			}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    		}else if(A==1)//////////////////check for 1
    		{
    			flagUsed[0]=-1;
    			answer=answer+"1";
    			answer=answer+getHour2(B, C, D,1);
    			if (flagUsed[1]==-1) {
					//B is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+B;
    				else
    					answer=answer+D+C;
    			}
    			
    		}else if(B==1)
    		{
    			flagUsed[1]=-1;
    			answer=answer+"1";
    			answer=answer+getHour2(A, C, D,1);
    			
    			if (flagUsed[0]==-1) {
					//A is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+A;
    				else
    					answer=answer+A+C;
    			}
    			
    			
    		}
    		else if(C==1)
    		{
    			flagUsed[2]=-1;
    			answer=answer+"1";
    			answer=answer+getHour2(B, A, D,1);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    			
    		}
    		else if(D==1)
    		{
    			flagUsed[3]=-1;
    			answer=answer+"1";
    			answer=answer+getHour2(B, C, A,1);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+C;
    				else
    					answer=answer+C+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+C;
    				else
    					answer=answer+C+A;
    			}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    		}else if(A==0)/////////////check for 0
    		{
    			flagUsed[0]=-1;
    			answer=answer+"0";
    			answer=answer+getHour2(B, C, D,0);
    			if (flagUsed[1]==-1) {
					//B is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+B;
    				else
    					answer=answer+D+C;
    			}
    			
    		}else if(B==0)
    		{
    			flagUsed[1]=-1;
    			answer=answer+"0";
    			answer=answer+getHour2(A, C, D,0);
    			
    			if (flagUsed[0]==-1) {
					//A is used
    				if(C<=5)
    					answer=answer+C+D;
    				else
    					answer=answer+D+C;
				}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(C<=5)
    					answer=answer+C+A;
    				else
    					answer=answer+A+C;
    			}
    			
    			
    		}
    		else if(C==0)
    		{
    			flagUsed[2]=-1;
    			answer=answer+"0";
    			answer=answer+getHour2(B, A, D,0);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+D;
    				else
    					answer=answer+D+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+D;
    				else
    					answer=answer+D+A;
    			}
    			else if(flagUsed[3]==-1)
    			{
    				//D is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    			
    		}
    		else if(D==0)
    		{
    			flagUsed[3]=-1;
    			answer=answer+"0";
    			answer=answer+getHour2(B, C, A,0);
    			if (flagUsed[0]==-1) {
					//A is used
    				if(B<=5)
    					answer=answer+B+C;
    				else
    					answer=answer+C+B;
				}
    			else if(flagUsed[1]==-1)
    			{
    				//B is used
    				if(A<=5)
    					answer=answer+A+C;
    				else
    					answer=answer+C+A;
    			}
    			else if(flagUsed[2]==-1)
    			{
    				//C is used
    				if(B<=5)
    					answer=answer+B+A;
    				else
    					answer=answer+A+B;
    			}
    		}
    		if(!ValidTime(answer))
    		{
    			answer="NOT POSSIBLE";
    		}
    			
    		
    		return answer;
    }
	public static void main(String[] args) {
		int [] a=  {-1, 3, -4, 5, 1, -6, 2, 1} ;
		//System.out.println(solution(  a ));
		System.out.println(solution(3, 0, 7, 0));
	}

}
