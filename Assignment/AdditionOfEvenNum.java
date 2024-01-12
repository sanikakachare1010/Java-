package Com.Sgm.Assignment;

public class AdditionOfEvenNum 
{
	public static void main(String[] args)
	{
		int Sum =0;
		
		for(int i =10;i<=20;i++)
		{
			if(i%2==0)
			{
				Sum = Sum+i;
				
			}
		}
		System.out.println("Addition of Even Number is :"+Sum);
	}
}
