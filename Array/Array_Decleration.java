package Com.Sgm.Array;
import java.util.Scanner;

public class Array_Decleration 
{
	public static void main(String[] args)
	{
		int Add = 0;
		int a[] = new int[4];
		
		//System.out.println("Enter a Arra Elements : ");
		Scanner sc = new Scanner(System.in);
		//int size = sc.nextInt();
		for(int i = 0;i<a.length;i++)
		{
			System.out.println("Please Enter Array Elements :" + i+ "index" );
			a[i] =sc.nextInt();
			Add = Add+a[i];
			System.out.println(Add);
			
		}
		
	}

}
