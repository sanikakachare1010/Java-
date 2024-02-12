package Com.Sgm.Methods;

public class ReversNumber implements Runnable
{
	public void run()
	{
		for(int i =10;i>=1;i--)
		{
			Thread t = Thread.currentThread();
			long s  = t.getId();
			System.out.println(s+""+i);
		}
	}

}
