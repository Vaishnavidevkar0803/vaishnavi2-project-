package constructor;

public class Constructor_Practice
{
	String employeeName;//variable declaration
	int salary;
	char gender;
	char bloodgroup;
	float experience;
	boolean constant;
	
	public  Constructor_Practice()//construtor used to initialize the variable 
	{
		employeeName="Vaishnavi";
		salary=1200000;
		gender='F';
		bloodgroup='O';
		experience=5.6f;//if score 60 distn
		constant=true;
	}
	public static void main(String[] args) //to call the construtor we have to create a object in main method 
	{
		 Constructor_Practice n=new  Constructor_Practice();
				 n.data();
	}
	public void data ()//non static method we have used the variables by creating the method called data 
	{
		System.out.println("my name is "+employeeName);
		System.out.println(salary+ " is my salary");
		System.out.println("my gender is "+gender);
		System.out.println(bloodgroup+ " is my blood group");
		System.out.println("I have" +experience+" years of experience");
		System.out.println("I am a "+constant+" worker");
	}

}
