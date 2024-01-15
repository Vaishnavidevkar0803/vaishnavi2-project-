package methods;

public class Math_Operation {

	public static void main(String[] args)
	{
		Math_Operation mo=new Math_Operation();
		mo.addition();
		mo.multiplication();
		mo.subtraction(32,9076);
		mo.addition(946,640746,6464 );
		
		
		
		
		
	}
	public void addition()//method without parameter 
	{
		int a;
		int b;
		int c;
		int sum;
		a=89;
		b=78;
		c=53;
		sum=a+b+c;
		System.out.println("addition is "+sum);
		
	}
	public void multiplication()//without parameter 
	{
		int a;
		int b;
		int multi;
		a=32;
		b=78;
		multi=a*b;
		System.out.println("multiplication is "+multi);
				
	}
	public void subtraction(int a,int b)//method with parameter 
	{
		int sub;
		sub=a-b;
		System.out.println("subtraction is "+sub);
	}
	public void addition(int a,int b,int c)//with parameter
	{
		
		 int add=a+b+c;
		System.out.println("addition is "+add);
	}
	
	
	

}
