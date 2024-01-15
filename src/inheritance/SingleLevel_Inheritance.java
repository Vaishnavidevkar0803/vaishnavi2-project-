package inheritance;

public class SingleLevel_Inheritance {

	public static void main(String[] args) {
		Mother m=new Mother();
				m.money();
		        m.property();//calling superclass to this class by creating object
		     
		        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		        
		        Daughter d=new  Daughter();//crating object of childclass or subclass
		        		d.mobile();//calling subclass using own method 
		                d.makeup();
		                d.money();//calling superclass method
		                d.property();
	}

}
