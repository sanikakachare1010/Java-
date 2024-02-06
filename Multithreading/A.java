package Com.Sgm.GetMethod;

public class A extends Thread
{
	public void run()
	{
		if(Thread.currentThread().getName().equals("Thread-1"))
		{
			for(int i =1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+"  "+i);
			}
		}
	}

}
