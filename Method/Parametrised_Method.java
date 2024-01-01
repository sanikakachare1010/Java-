package Method.Task2;

public class Parametrised_Method
{
	int a =20;
	int  b= 30;
	public void div(int a,char b)
	{
		//int Div = b/a;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		//return Div;
	}
	public static void main(String[] args) 
	{
		Parametrised_Method A = new Parametrised_Method();
		A.div(10+5, 'A');
		
	}
}
