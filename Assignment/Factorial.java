package Com.Sgm.Assignment;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 int No = sc.nextInt();
		 int Fact =1;
		 
		 for(int i =1;i<=No;i++)
		 {
			 Fact = Fact * i;
		 }
		 System.out.println(Fact);
 }

}
