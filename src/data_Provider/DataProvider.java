package data_Provider;

public class DataProvider
{
        @org.testng.annotations.DataProvider(name ="fbregression")
  public static String[][] fbdataset() 
  {
	  {
		  String fbdata[][]= {{"vaish","devkar","abc@gmail.com"},{"pranav","devkar","pranav@gmail.com"}};
		  return fbdata;
	  }
	  
	  //@org.testng.annotations.DataProvider
  }

}
