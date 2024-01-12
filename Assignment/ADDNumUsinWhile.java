package Com.Sgm.Assignment;

public class ADDNumUsinWhile 
{
	public static void main(String[] args)
	{
		int Sum = 0;
		
		int i =10;
		while(i<=20)
		{
			if(i%2==0)
			{
				Sum = Sum + i;
			}
			i++;
		}
		
		System.out.println("Addition of Even Number is :"+Sum);	
	}

}
