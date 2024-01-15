package methods;

public class Method_Use {

	public static void main(String[] args)
	{
		Method_Use bat=new Method_Use();
		bat.a();
	    bat.b();
		System.out.println("---------------------------------------");
		bat.c(132,90 ," krcl @rtn");
		bat.d(803,'D', "imperial heights");
		
		
		
	}
	public void a()
	{
		System.out.println("This is non static regular method without parameter");
	}
	public static void b()
	{
		System.out.println("This is static regular method witjout parameter");
	}
	public void c(int runs,int overs ,String teamName)
	{
		System.out.println("-------------------------------------------------------------------");
		System.out.println("This is non static method with parameter");
		System.out.println("My runs are "+runs);
		System.out.println("Toatal overs are "+overs);
		System.out.println("My team name is "+teamName);
		System.out.println("---------------------------------------------------------------------");
		
	}
	public static void d(int flatnumber,char wing,String buildingName)
	{
	System.out.println("-------------------------------------------------------------------");	
	System.out.println("This is static method with parameters");
	System.out.println("Flat number is "+flatnumber);
	System.out.println("Wing no.is "+wing);
	System.out.println("Name of the building is "+buildingName);
	System.out.println("--------------------------------------------------------------------");
	}
}
