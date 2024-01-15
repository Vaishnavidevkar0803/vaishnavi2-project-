package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException 
	{
		//create object of properties
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Vaishnavi\\properties");
		prop.load(myfile);
		
		Object value = prop.getProperty("age");
		System.out.println(value);
		
		Object value2 = prop.getProperty("pinCode");
		System.out.println(value2);
		
		Object value3= prop.getProperty("MobNum");
		System.out.println(value3);
		

	}

}
