package Com.Sgm.Assignment;

import java.util.Scanner;

public class CountOfDigit 
{
	public static void main(String[] args) 
	{
		int Cnt =0,D_cnt=0,temp=0;
		
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 int No = sc.nextInt();
		
		
		for(temp=No;temp>0;temp/=10)
		{
			D_cnt++;
			
		}
		System.out.println(No);
		
	}

}
