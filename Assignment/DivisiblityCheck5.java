package Com.Sgm.Assignment;
import java.util.*;

public class DivisiblityCheck5 
{
	static int Num = 0;
	public void forCheck()
	{
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
	public void WhileLoop()
	{
		int i =1;
		while(i<=Num)
		{
			if(i%5==0)
			{
				System.out.println(i + "Number is Divisible by 5 ");
			}
			else
			{
				System.out.println(i+" Number is not Divisible by 5");
			}
			i++;
		}
	}
	public void doWhileLoop()
	{
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
		while(i<=Num);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number :");
		Scanner s = new Scanner(System.in);
		Num = s.nextInt();
		
		DivisiblityCheck5 d = new DivisiblityCheck5();
		System.out.println("\n Divisibility Check Using ForLoop :");
		d.forCheck();
		System.out.println("\n Divisibility Check Using WhileLoop :");
        d.WhileLoop();
		System.out.println("\n Divisibility Check Using DoWhileLoop :");
		d.doWhileLoop();

	}

}
