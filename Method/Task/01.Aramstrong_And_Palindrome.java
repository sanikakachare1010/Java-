package Method.Task2;
import java.util.*;
//import java.lang.Math;

public class Task04 
{
	public void Armstrong()
	{
		int n,digits,sum=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		n = s.nextInt();
		//Task04 t = new Task04();
		//t.palin();
		int temp = n;
		
		while(n>0)
		{
			digits= n%10;
			
			n = n/10;
			
			sum = sum + digits*digits*digits;
			//System.out.println(n);
			
			
		}
		if(temp==sum)
		{
			System.out.println(temp+" Armstrong number : \n");
			
		}
		else
		{
			System.out.println(temp +"Not Armstrong number : \n");
		}
		
		
	}
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
		Task04 A = new Task04();
		A.Armstrong();
		A.palin();
		
	}

}
