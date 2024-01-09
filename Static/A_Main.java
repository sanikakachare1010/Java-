package Com.Sgm.Static_Variable;

public class A_Main 
{
	public static void main(String[] args)
	{
		A a = new A(12,34);
		a.c = 50;
		a.b=1000;
		System.out.println(a.a);
		System.out.println(a.b);
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println("================");
		System.out.println(a.c);
		System.out.println(a1.c);
		System.out.println(A.c);//Call By Class 
		
		
	}

}
