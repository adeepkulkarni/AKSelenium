package newpackage1;

import java.util.Scanner;

public class calculator {
	static int n1=0,n2=1,n3=0;
	static void fibo(int count)
	{
		if(count>0)
		{
			n3=n1+n2; 
			n1=n2;
			n2=n3;
		    System.out.print(" "+n3);     
            fibo(count-1);    
		}
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number for factorial");
		int fac=sc.nextInt();
		System.out.println("Factorial is: "+factorial(fac)); 
		System.out.println("Enter fibonacci limit");
		int fibcnt=sc.nextInt();
		System.out.print(n1+" "+n2);       
	    fibo(fibcnt-2);
	}
	 static int factorial(int n){      
         if (n == 1)      
           return 1;      
         else      
           return(n * factorial(n-1));      
   }  
	 
	/*	System.out.print("Enter number 1:-");
		int num1= sc.nextInt();
		System.out.print("Enter number 2:-");
		int num2= sc.nextInt();
		calculator c=new calculator();
		int opt=1;
		do{
		System.out.print("Choose an operation \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
		System.out.print("\nEnter choice:-");
		int ch= sc.nextInt();
		switch(ch){
		case 1: System.out.print("Addition is="+c.add(num1,num2));break;
		case 2:System.out.print("Subtraction is="+c.sub(num1,num2));break;
		case 3:System.out.print("Multiplication is="+c.mul(num1,num2));break;
		case 4:System.out.print("Division is="+c.div(num1,num2));break;
		default:System.out.println("Enter correct choice");break;
		}
		System.out.println("Press 1 to continue");
		opt=sc.nextInt();
		}while(opt==1);
	}
	public int add(int num1,int num2)
	{
		int num3=num1+num2;
	     return num3;
	}
	public int sub(int num1,int num2)
	{
		int num3=num1-num2;
	     return num3;
	}
	public int mul(int num1,int num2)
	{
		int num3=num1*num2;
	     return num3;
	}
	public double div(int num1,int num2)
	{
		double num3=num1/num2;
	     return num3;
	}*/
}

