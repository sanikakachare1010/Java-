package Com.Sgm.Methods;

public class Main 
{
	public static void main(String[] args) {
		ReversNumber r = new ReversNumber();
		Thread t =new Thread(r);
		Thread1 s = new Thread1();
	    s.start();
	    t.start();
		
		
	}

}
