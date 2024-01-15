package methods;

public class NonStatic_anotherClass {

	public static void main(String[] args)
	{//syntax ObjectName.methodname();
		
		//from same class 
		//syntax=classNmae ObjectName=new ClassName 
		 NonStatic_anotherClass hall=new  NonStatic_anotherClass();
				 //ObjectName.methodNmae();
		hall.scale();
		hall.eraser();
		System.out.println("**************************************************");
		NonStatic_SameClass compass=new NonStatic_SameClass();
				compass.pen();
				compass.pencil();
		
	}
	public void scale()
	{
		
		System.out.println("i need my scale");
	}
	public void eraser()
	{
		System.out.println("i need my eraser to use");
	}
}
