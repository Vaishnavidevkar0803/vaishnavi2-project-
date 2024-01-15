package inheritance;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
		Student s=new Student();//child class can call superclass & supermostclass
		s.listen();
		s.emplies();
		s.examrules();
		s.meet();
		s.regulations();
		s.rules();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ClassTeacher ct=new ClassTeacher();//super class can call its own methods & supermost methods 
				ct.examrules();
		        ct.meet();
		        ct.regulations();
		        ct.rules();
		    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");    
		        principle p=new principle();//supermost class can only call its own methods 
		        		p.regulations();
		                p.rules();
System.out.println(".........................................................");
	}

}
