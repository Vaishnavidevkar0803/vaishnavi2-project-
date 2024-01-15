package constructor;

public class ConstructorUse
{
	int a;//variable declaration
	int b;
	int c;//
	//use of constructor =>to initialize variable /data member 
	public ConstructorUse()//user defined with no parameter 
	{
		a=100;
		b=34;
		c=960;
	}

public static void main(String[]args)
{
	//constructor is called when the object is created 
	ConstructorUse cu=new ConstructorUse();
			cu.addition();
}
public void addition()
{
	int sum;
	sum=a+b+c;
	System.out.println("addition is "+sum);
}
}