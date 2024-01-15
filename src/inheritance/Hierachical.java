package inheritance;

public class Hierachical {

	public static void main(String[] args)
	{
		Developer d= new Developer();
				d.coding();//subclass calling his own properties
				d.communication();//subclass calling superclass properties
				d.decipline();//subclass calling superclass properties
				
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				
		Tester	t=new Tester();
				t.build();//subclass calling his own properties
				t.test_case_execution();//subclass calling his own properties
				t.communication();//subclass calling superclass properties
				t.decipline();//subclass calling superclass properties

	}

}
