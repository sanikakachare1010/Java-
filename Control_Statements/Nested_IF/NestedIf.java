import java.util.Scanner;
class NestedIf
{
	public static void main(String args[])
	{
		int No1,No2,No3;
                Scanner sc =new Scanner(System.in);
                No1 = sc.nextInt();
                No2 = sc.nextInt();
                No3 = sc.nextInt();
                
		if(No1>No2)
                {
		   if(No1>No3)
                   {
			System.out.println(No1+"is greater number");
		   }
		   else 
                   {
			System.out.println(No3+"is greater number");
                   }
                 }
                 else if(No2>No3)
		 {
			System.out.println(No2+"is greater number");
		 }
                 else if(No3>No1)
		 {
			System.out.println(No3+"is greater number");
		 }
		 else
		 { 
			System.out.println("All Numbers are equal");
		 }
		
		
		
	}
}