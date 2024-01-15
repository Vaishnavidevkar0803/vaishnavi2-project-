package methods;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args)
	{
		test1();//methodname();
        test2();
		test3();
	}
public static void test1()//complete static regular method
{
	System.out.println("this is complete static method test1");
	
}
public static void test2()//complete static regular method 
{
	System.out.println("this is complete static method test2");
}
public static void test3()//complete static regular method
{
	System.out.println("this is complete static method test3");
}
}

