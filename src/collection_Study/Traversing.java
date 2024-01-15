package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args, int i)
	{
		//traversing-->travel in arraylist
		
		ArrayList<Integer> al=new ArrayList<>();
		al.size();
		System.out.println(al.size());
		al.add(10);
		al.add(8);
		al.add(30);
		al.add(21);
		System.out.println(al);
		System.out.println("==========for loop===========");
		
		for(int i1=0;i1<=al.size()-1;i1++);
		
		System.out.println(al.get(i));
		
		System.out.println("============for each loop===========");
		
		//for(Integer a:al)
		{
		//	System.out.println(a);
		}
		//Iterator<Integer> it1 = al.iterator();
		//while(it1.hasNext())
		{
		//	System.out.println(it1.next());//??????????
		}
		//System.out.println("===========list iterator============");
		
		//ListIterator<Integer> lit = al.listIterator();
		
		//while(lit.hasNext())
		{
		//	System.out.println(lit.nextIndex());//?????????
		}


	}

}
