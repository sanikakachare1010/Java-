package Method.Task2;
import java.util.*;

class Palindrome 
{
	public void palin()
	{
		int no;
		int temp, digit = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		no = s.nextInt();
		temp = no;
		
		while(no>0)
		{
			digit = digit*10 + no%10;
			no = no /10;
			
		}
		if(digit == temp)
		{
			System.out.println(temp +" is Palindrome \n");
			
		}
		else 
		{
			System.out.println(temp + " is Not Palindrome \n");
		}
		
	}

	public static void main(String[] args) 
	{
		Palindrome  p = new Palindrome ();
		p.palin();
		
	}
}
