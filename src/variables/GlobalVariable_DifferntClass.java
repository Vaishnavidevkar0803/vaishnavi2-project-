package variables;

public class GlobalVariable_DifferntClass {
 
	static String  m="mango";

	 public static void main(String[] args) 
	{
		
		GlobalVariable_DifferntClass fruit=new GlobalVariable_DifferntClass();
				fruit.say();
				System.out.println("value of a is "+Global_Variables.a);//calling static global variable from another class
				//syntax-->classname.variablename
	}
public void say()
{
	String a="apple";
	System.out.println("a is the value of "+a);
	System.out.println("m is the value of "+m);
}
}
