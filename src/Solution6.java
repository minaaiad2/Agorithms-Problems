
public class Solution6 {
	 static char [][] cGrid=new char[5000][5000];
	  static int Group(String[] grid) {
		  int ans=0;
		  
		   cGrid=new char[grid.length][grid[0].length()];
		  
		  for(int i=0;i<grid[0].length();i++)
		  {
			  for(int j=0;j<grid.length;i++)
			  {
				  if(cGrid[i][j]=='Y')
				  {
					  ans++;
					  infect( i, j, grid[0].length(), grid.length);
				  }
			  }
		  }
		  
		  return ans;
	    }
	public static void infect(int i,int j,int row,int column)
	{
		if(i >= 0 && i < row && j >= 0 && j < column && cGrid[i][j] == 'Y')
		{
			cGrid[i][j] = 'N';
			infect(i - 1, j, row, column);
			infect(i, j - 1, row, column);
			infect(i, j + 1, row, column);
			infect(i + 1, j, row, column);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
