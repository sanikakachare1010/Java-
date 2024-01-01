package Method.ChangeValue;

public class ChangeValue 
{
	int a =20;
	int b =30;
	int c =0;
	
	public int Add()
	{
		c = a + b; 
		System.out.println(c);
		return(c);
	}
	public void Changevalue()
	{
		c =  c - 10;
		System.out.println(c);
	}
    public static void main(String[] args) 
    {
		ChangeValue A = new ChangeValue();
		A.Add();
		A.Changevalue();
	} 

}
