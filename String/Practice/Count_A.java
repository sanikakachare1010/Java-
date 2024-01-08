package Com.Sgm.Practice;
import java.util.Scanner;

public class Count_A 
{
	public static void main(String[] args) 
	{
		int Cnt = 0;
		
		System.out.println("Enter a String :");
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A')
			{
				Cnt++;
			}
			
		}
		System.out.println(Cnt);
		
	}

}
