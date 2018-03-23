package newpackage1;

public class Newclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//System.out.println("Hello world");
			
			for(int i=0; i<5; i++)
			{
				//System.out.print(" ");	
				for(int j=0; j<5-i; j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			   for(int j=0; j<i*2-1; j++)
				{
					System.out.print(" ");
				}
			   if(i>0)
				{System.out.print("*");}
				System.out.print("\n");
			}

			for(int i=0; i<5; i++)
			{
				//System.out.print(" ");	
			for(int j=0; j<i; j++)
					{
						System.out.print(" ");
					}
			   if(i==4)
			   {
				   System.out.print(" ");
			   }
				  System.out.print("*");
				for(int j=0; j<(9-2*i); j++)
				{
					System.out.print(" ");
					//System.out.print("-");
				}
				
			 
			   if(i<4)
				{System.out.print("*");}
				System.out.print("\n");
			}
		
		
	}

}
