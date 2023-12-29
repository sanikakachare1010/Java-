package Com.Sgm.PrimeNum;

public class PrimeNum 
{
	public static void main(String[] args)
	{
		int i, Num,Count;
		
		for(Num = 1;Num <= 60;Num++)
		{
			Count = 0;
			
			for(i = 2;i<= Num/2;i++)
			{
				if(Num % i == 0)
				{
					Count++;
				}
				
			}
			if(Count == 0 && Num != 1)
			{
				System.out.println(Num + " ");
			}
		}
		
	}

}
