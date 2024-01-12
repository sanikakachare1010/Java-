package Com.Sgm.Assignment;
import java.util.*;

public class PrimeNum_Using_While 
{
	public static void main(String[] args)
	{
		int Cnt  = 0;
		System.out.println("Enter a Number :");
		Scanner s = new Scanner(System.in);
		int No = s.nextInt();
		
		int i =1;
		while(i<=No)
		{
			if(No%i==0)
			{
				Cnt++;
			}
			i++;
		}
		if(Cnt==2)
		{
			System.out.println(No+" is Prime Number");
		}
		else
		{
			System.out.println(No +" is Prime Number");
		}
	}

}
