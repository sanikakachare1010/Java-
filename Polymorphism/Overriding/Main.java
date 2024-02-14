package Com.Sgm.Overriding;

public class Main 
{
	public static void main(String[] args)
	{
		A a = new A();
		a.M1();
		a.M2();
		
		B b =new B();
		b.M1();
		b.M2();
		b.M3();
		
		A a1 = new B();
		a1.M1();
		a1.M2();
		//a1.M3();//Can Not Access,it Access only Override Methods.
		a1.M5();
		
		
	}

}
