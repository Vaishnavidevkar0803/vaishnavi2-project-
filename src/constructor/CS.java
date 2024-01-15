package constructor;

public class CS
{//variable declaration 
int a;
int b; 
int c;

public CS()//user defined with zero parameter 
{
	a=1;
	b=34;
	c=32;//variable initialization we intialize variable in constructor 
}
public CS(int x)//user defined with one parameter 
{
	a=x;
	//b=?
	//c=?
}
public CS(int x ,int y)
{
	a=x;
	b=y;
	//c=?
}
public CS(int x,int y,int z)
{
	a=x;
	b=y;
	c=z;
}
	
	public static void main(String[] args)//to call the variable we need to create the object in main method
	{
		CS c=new CS();//syntax-->classname objectname=new classname();
		                        //objectname.methodname();
		c.addition();
		c.substraction();
		System.out.println("________________________________________");
		
		CS c1=new CS(100);
		c1.addition();
		c1.substraction();
		System.out.println("________________________________________");
		
		CS c2=new CS(90,90);
		c2.addition();
		c2.substraction();
		System.out.println("________________________________________");
		
		CS c3=new CS(89,99,88);
		c3.addition();
		c3.substraction();
		System.out.println("________________________________________");
	}
	public void addition ()//non static method where we create the method
	{
		int sum=a+b+c;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
		System.out.println("c value is "+c);
		
		System.out.println("sum  is "+sum);
	}
	public void substraction()
	{
		int sub=a-b-c;
		System.out.println("sub is "+sub);
		
		
		
		
		
		
		
	}

}
