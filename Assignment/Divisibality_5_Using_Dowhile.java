package Com.Sgm.Assignment;

import java.util.Scanner;

public class Divisibality_5_Using_Dowhile
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 int No = sc.nextInt();
		 
		 int i =1;
			do
			{
				if(i%5==0)
				{
					System.out.println(i+" Number is Divisibale by 5");
				}
				else
				{
					System.out.println(i+"Number is not  Divisible by 5");
				}
				i++;
			}
			while(i<=No);
		
	}

}
