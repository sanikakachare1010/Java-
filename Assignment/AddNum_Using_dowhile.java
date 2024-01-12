package Com.Sgm.Assignment;

public class AddNum_Using_dowhile 
{
	public static void main(String[] args)
	{
		int Sum =0;
		
		int i = 10;
		do
		{
			if(i%2==0)
			{
				Sum = Sum + i;
			}
			i++;
		}
		while(i<=20);
		System.out.println("Addition of Even Number is :"+Sum);
		
	}

}
