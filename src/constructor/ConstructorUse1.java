package constructor;

public class ConstructorUse1
{
	//variable declaration 
	int a;
	int b;
	int c;
	
	//use of constructor-->to initialize the data member/variable
	public ConstructorUse1()//user defined with zero parameter /no parameter 
	{
		a=32;
		b=900;
		c=534;
	}
	public ConstructorUse1(int x,int y)//with 2 parameters 
	{
		a=x;
		b=y;
	}
	public ConstructorUse1(int x)//with 1 parameters 
	{
		a=x;
	}
	public ConstructorUse1(int x,int y,int z)//3 parameters 
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args)
	{//constructor is called when the object is created 
		ConstructorUse1 c1=new ConstructorUse1();
				c1.addition();
				c1.substraction();
				
				ConstructorUse1 c2=new ConstructorUse1(89,98);
				c2.addition();
				c2.substraction();
				
				ConstructorUse1 c3=new ConstructorUse1(76);
						c3.addition();
				        c3.substraction();

				        ConstructorUse1 c4=new ConstructorUse1(12,65 ,897 );
				        		c4.addition();
				        c4.substraction();
			
		
	}
	public void addition()
	{
		int sum;
		sum=a+b+c;
		System.out.println("addition is "+sum);
	}
	public void substraction()
	{
		int sub;
		sub=a-b-c;
		System.out.println("substraction is "+sub);
		System.out.println("value of a is "+ a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+c);

	}
	
}
