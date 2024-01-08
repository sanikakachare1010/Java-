package Com.Sgm.Practice;
import java.util.Scanner;

public class Count_Of_I 
{
	public static void main(String[] args)
	{
		int Cnt = 0;
		
		System.out.println("Enter a String :");
		Scanner sc =new Scanner(System.in);
		String a = sc.next();
		
		for(int i = 0;i<a.length();i++)
		{
			if(a.charAt(i) == 'i' || a.charAt(i) == 'I')
			{
				Cnt++;
			}
		}
		System.out.println(Cnt);
		
		
	}

}
