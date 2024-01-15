package constructor;

public class Constructor_practice_2{
	
	String Employee_name_1;
	String Employee_name_2;
	String Employee_name_3;
	
	
	public Constructor_practice_2()//constructor to initialize the variable
	{
		Employee_name_1 = "pranav";
		Employee_name_2="gaurav";
		Employee_name_3="vaishnavi";
		
	}

	public static void main(String[] args)
	{
		Constructor_practice_2 n1=new Constructor_practice_2();
		                       n1.display();//objectname.methodname	                       
	}
	
	public void display()
	{
		System.out.println(Employee_name_1+" is working in tata motors");
		System.out.println(Employee_name_2+" is working in wipro");
		System.out.println(Employee_name_3+" is working in tcs");
	}

}
