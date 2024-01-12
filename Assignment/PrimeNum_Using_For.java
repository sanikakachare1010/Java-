package Com.Sgm.Assignment;

import java.util.Scanner;

public class PrimeNum_Using_For
{
	public static void main(String[] args) 
	{
        int Cnt = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int No = s.nextInt();
		
		
		for(int i = 1;i<=No;i++)
		{
			if(No%i == 0)
			{
				 Cnt++;
			}
		}
		if(Cnt == 2)
		{
			System.out.println(No+" : Number is Prime \n ");
			
		}
		else
		{
			System.out.println(No+" : Number is Not Prime Number \n");
		}
			
		
	}

}
