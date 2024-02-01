package Sgm.Com.Progams;
/* Int OperationChoices(int c,int a, int b)
 *  The function accepts 3 positive integers ‗a‘ , ‗b‘ and ‗c ‗ as its arguments.
 *   Implement the function to return.
     ( a + b ) , if c=1
     ( a – b ) , if c=2
     ( a * b ) , if c=3
     (a / b)   , if c =4
 */
public class A
{	 
	
		public int OperationChoices(int a, int b, int c)
		{
			int n = 0;
			switch(c)
			{
				case 1:
					n = a + b;
					System.out.println(n);
					break;
				case 2: 
					n = a - b;
					System.out.println(n);
					break;
				case 3:
					n = a * b;
					System.out.println(n);
					break;
				case 4: 
					n = a / b;
					System.out.println(n);
					break;
				default:
					System.out.println("Invalid Choice.");
			}
			return n;
		}
		
		public static void main(String[] args) 
		{
			A a = new A();
			a.OperationChoices(10,20,2);
			
	    }

}
