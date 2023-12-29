package Com.Sgm.EvenOdd;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		int  i , j;
		
		System.out.println("Even Numbers =>");
		
		for(i = 1; i <= 50;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("ODD Numbers =>");
		
		for(j = 1;j <= 50; j++)
		{
			if(j % 2 != 0)
			{
				System.out.println(j);
			}
		}
	}

}
