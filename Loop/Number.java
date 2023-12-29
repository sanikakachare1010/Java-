package Com.Sgm.Number;

public class Number 
{
	public static void main(String[] args)
	{
		int a = 926;
		int Mod;
		while(a!=0) 
		{
			Mod = a % 10;
			System.out.println(Mod);
			a =  a /10;
		}
		
		
	}

}
