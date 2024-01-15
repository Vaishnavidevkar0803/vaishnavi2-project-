package methods;

public class NonStatic_SameClass {

	public static void main(String[] args)
	{//ClassName ObjectName=new ClassNmae();
		NonStatic_SameClass compass=new NonStatic_SameClass();//new-->memory assignment operator 
		//ObjectName.methodNmae();
		compass.pen();
		System.out.println("....................................");
		compass.pencil();//memory of the non static method is not fixed 
		

	}
public void pen()//non static 
{
	System.out.println("hi this is non static method calling from same class.....i need my pen");
}
public void pencil()
{
	System.out.println("hi i need my pencil from same class");
}
}
