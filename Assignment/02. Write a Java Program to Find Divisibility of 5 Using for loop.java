package Com.Sgm.Assignment;

import java.util.Scanner;

public class DiviBy5UsingFor
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number :");
		Scanner s = new Scanner(System.in);
		int Num = s.nextInt();
		

		for(int i = 1;i<=Num;i++)
		{
			if(i%5 ==0)
			{
				System.out.println(i+"Number is Divisible by 5");
			}
			else
			{
				System.out.println(i+"Number is Not Divisible by 5");
			}
		}
	}
}
