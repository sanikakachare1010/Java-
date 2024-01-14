package Com.Sgm.Assignment;

import java.util.Scanner;

public class Sum_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 int No = sc.nextInt();
		 int temp =0,D_sum =0,Dig =0;
		    
		    temp = No;
		 
		    while(temp>0)
			{
			    Dig = temp%10;
				D_sum = D_sum + Dig;
				temp= temp/10;
				
				
			}
			System.out.println(D_sum);
			
		
	}

}
