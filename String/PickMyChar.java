package Com.Sgm.String;

public class PickMyChar 
{
	public void PickChar()
	{
		String s = "Sanika";
		for(int i = 0;i<s.length();i++)
		{
			char a = s.charAt(i);
			System.out.println(a);
		}
		
	}
	public static void main(String[] args)
	{
		PickMyChar p = new PickMyChar();
		p.PickChar();
		
		
	}

}
