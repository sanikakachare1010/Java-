package Com.Sgm.Assignment;

import java.util.Scanner;

public class ReversNum 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 int No = sc.nextInt();
		 int ReverseNum =0;
		 
		 while(No!=0)
		 {
			 int remainder = No %10;
			 ReverseNum = ReverseNum *10 +remainder;
			 No = No/10;
		 }
		 System.out.println(ReverseNum );
   }

}
