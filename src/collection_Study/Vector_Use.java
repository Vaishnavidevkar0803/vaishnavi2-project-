package collection_Study;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Use {

	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.add("pune");
		v.add("vaish");
		v.add("gaurav");
		v.add("addy");
		
		v.capacity();//returns current capacity
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println("====================");

		v.add("pune");
		v.add("vaish");
		v.add("gaurav");
		v.add("addy");
		v.add(null);
		v.add("papa ");
		v.add("mumma ");
		v.add("shruti ");
		v.add("pranav");
		
		System.out.println(v.capacity());//cc*2
		System.out.println("=======================");
		System.out.println(v.size());//actual elements present
		System.out.println("====================");
		System.out.println(v.get(4));
		System.out.println(v.elementAt(4));//returns the string 
		System.out.println("=====*****============");
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v);
		v.insertElementAt("rohini", 1);//working as add method
		System.out.println(v);
		System.out.println("=====================");
		//v.setSize(20);//fullfill the size with null values 
		System.out.println(v);
		
		System.out.println("----------------Traversing through vector ------------------");
		
		System.out.println("---------forloop--------");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			//System.out.println(i);//shows index (0 1 2 3______13)
			System.out.println(v.get(i));//shows all the elements present in list 
		}
		System.out.println("---------for each loop----------");//works on collection
		for (String vect:v)
		{
			System.out.println(vect);//shows all the elements present in list 
		}
		System.out.println("---------Iterator----------");
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());//shows all the elements present in list 
			System.out.println(it.hasNext());//returns false at end of iteration-->boolean 
		}
		System.out.println("---------List Iterator----------");
		ListIterator<String> list = v.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		//while(list.next()) //cannot convert string to boolean ..type mismatch error
		//{
		//	System.out.println(list.hasNext());
		//}
		System.out.println("-----------enumeration-------------");
		Enumeration<String> enumer = v.elements();
		
		while(enumer.hasMoreElements())
		{
			System.out.println(enumer.nextElement());//returns next element of the enumeration 
			//throws no such element exception if there are no elements 
		}
		
	}
}
