package Com.Sgm.While_Prime;

public class Prime
{
	public static void main(String[] args) 
	{
		int i = 1,Count = 0;
		int No = 7, temp= 0;
		
		while(i<=No)
		{
			temp = No % i;
			
			if(temp == 0)
			{
				Count++;
			}
			i++;
		}
		if(Count == 2)
		{
			System.out.println(No);
		}
		
	}

}
