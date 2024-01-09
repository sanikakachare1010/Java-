package Com.Sgm.Static_Method;

public class A_Main 
{
	public static void main(String[] args)
	{
		A_Class.m1(); //directly Call by Class Name
		A_Class a = new A_Class();
		a.m1();//call by Object
		
	}

}
