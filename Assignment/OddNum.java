package Com.Sgm.Assignment;

public class OddNum
{
	public void forLoop()
	{
		for(int i =1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			
		}
		
	}
	public void WhileLoop()
	{
		int i =1;
		while(i<=10)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			i++;
		}
	}
	public void dowhile()
	{
		int i =1;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i);
				
			}
			i++;
		}
		while(i<=10);
		
	}
	public static void main(String[] args)
	{
		 OddNum a = new  OddNum();
		 System.out.println("ODD Numbers Using For :");
		 a.forLoop();
		 System.out.println("ODD Numbers Using While :");
          a.WhileLoop();
		 System.out.println("ODD Numbers Using doWhile :");
         a.dowhile();
	}

}
