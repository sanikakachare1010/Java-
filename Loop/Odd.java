package Com.Sgm.Odd;

public class Odd 
{
   public static void main(String[] args) 
   {
	   int i = 0 ,j =0;
	   
	   while(i<=50 && j <=50)
	   {
		  if(i % 2 == 0)
		  {
			  if(j %2 != 0)
			  {
				  System.out.println(i+"  " + j);
			  }
			  
			  j++;
		  }
		   i++;
		   
	   }
	  
   }
}
