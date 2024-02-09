package Com.Sgm.Array;

public class EvenOdd
{
	public static void main(String[] args)
	{
		int a[]= {6,9,4,7,3,2};
		
		int EvenAdd = 0;
		int OddAdd = 0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				EvenAdd = EvenAdd + a[i];
			}
			else
			{
				OddAdd = OddAdd + a[i];
			}
			
		}
		System.out.println(EvenAdd);
		System.out.println(OddAdd);
		
	}

}
