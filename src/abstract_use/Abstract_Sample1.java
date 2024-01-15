package abstract_use;

public abstract  class Abstract_Sample1 {

	public static void main(String[] args)
	{
		
	}
	public void test()
	{
		System.out.println("it is a complete method grom sample1");
	}
	public abstract void test2();
	{
		System.out.println("it is incomplete abstarct method from sample1");
	}//the program would not run as it is abstract class so need to use concrete class to run the program 
	public static void test5()
	{
		System.out.println("static method from abstract class");
	}
	public abstract void test6();

}
