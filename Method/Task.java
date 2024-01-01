package Method.Task;

public class Task 
{
	int a = 10;
	int b = 20;
	int Add,Mul,Div;
	
	public int Add()
	{
	    Add =  a +b;
		System.out.println(Add);
		return Add;
	}
	public int Mul()
	{
		Mul = Add * 4;
		System.out.println(Mul);
		return Mul;
	}
	public int Div()
	{
	    Div = Mul/6;
		System.out.println(Div);
		return Div;
	}
	public static void main(String[] args)
	{
		Task A = new Task();
		A.Add();
		A.Mul();
		A.Div();
	}

}
