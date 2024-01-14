package Com.Sgm.Assignment;
import java.util.Scanner;

public class Divisible_By_2_Using_For
{
	static int No = 0;
	
	
	public void forLoopDivisiblityCheck()
	{
		for(int i = 1;i<=No;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" Number is Divisible by 2");
			}
			else
			{
				System.out.println(i+" Number is Not Divisible by 2");
			}
		}
	}
	public void whileLoopDivisiblityCheck()
	{
		int i = 1;
		while(i<=No)
		{
			if(i%2 == 0)
			{
				System.out.println(i +" Number is Divisible by 2 ");
			}
			else 
			{
				System.out.println(i+" Number is Not Divisible by 2 ");
			}
			i++;
		}
	}
	public void doWhileDivisibilityCheck()
	{
		int i = 1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i+" Number is Divisible by 2");
			}
			else
			{
				System.out.println(i+" Number is Not Divisible by 2");

			}
			i++;
		}
		while(i<=No);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		 No = sc.nextInt();
		 System.out.println("Divisiblity Check Using ForLoop : \n");
		 Divisible_By_2_Using_For s = new Divisible_By_2_Using_For();
		 s.forLoopDivisiblityCheck();
		 System.out.println("\n Divisiblity Check Using While :\n");
         s.whileLoopDivisiblityCheck();
		 System.out.println(" \n Divisiblity Check Using doWhile :\n");
		 s.doWhileDivisibilityCheck();
		
	}

}
