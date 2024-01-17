package Com.Sgm.AbstractClass;

abstract class Parent 
{
	int a =10;
	int b = 20;
	public void Add()
	{
		int Add = a+b;
		System.out.println("Addition is :"+Add);
	}
	public void Sub()
	{
		int sub = a-b;
		System.out.println("Substraction is :"+sub);
	}
	public abstract void Mul();
	
	public abstract void Div();
	
}
