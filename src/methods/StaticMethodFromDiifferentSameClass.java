package methods;

public class StaticMethodFromDiifferentSameClass {

	public static void main(String[] args)
	{sample1();
	sample2();
	System.out.println("************************************");
	System.out.println("calling from different class");
	//syntax=ClassName.methodName
	StaticMethodCallFromSameClass.test1();
	StaticMethodCallFromSameClass.test2();
	StaticMethodCallFromSameClass.test3();//syntax-->
	sample1();
	sample2();
	
	
	}
	public static void sample1()//static method 
	{
		System.out.println("calling sample1 from different class ");
	}
	public static void sample2()
	{
		System.out.println("calling sample2 from different class");
	}
	

}
