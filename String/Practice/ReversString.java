package Com.Sgm.Practice;

public class ReversString
{
	public void Revers()
	{
		String s ="India";
		String S1 ="\0";
		int length = s.length();
		for(int i=(length-1);i>=0;i--)
		{
			S1 = S1+s.charAt(i);
			
		}
		System.out.println(S1);
	
	}
	public static void main(String[] args)
	{
		ReversString R = new ReversString();
	    R.Revers();
		
	}

}
