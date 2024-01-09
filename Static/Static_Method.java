package Com.Sgm.Static_Method;

public class Static_Method 
{
	public void M1()
	{
		System.out.println("M1 Method");
	}
    static
	{
		System.out.println("Static Block");
	}
    public static void main(String[] args) 
    {
    	System.out.println("Main Method");
    	Static_Method s =new Static_Method ();
    	s.M1();
    	
		
	}    

}
