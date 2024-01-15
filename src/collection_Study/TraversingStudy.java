package collection_Study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class TraversingStudy {

	public static void main(String[] args)
	{
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(8);
		al.add(30);
		al.add(6);
		al.add(21);
		al.add(14);
		al.add(900);
		System.out.println(al);//will add the elements in square bracket
		System.out.println("--------use of for loop----------");
		
		for (int i=0;i<=al.size()-1;i++)
		{
			//System.out.println(i);//show the index(0 1 2 3 4 5) 
			System.out.println(al.get(i));//show the values on each index (8 30 6 21 14 900)
		}
		System.out.println("--------use for each loop---------");
		for (Integer each_loop:al)
		{
			System.out.println(each_loop);//show the values on each index (8 30 6 21 14 900)
		}
		//iterator(7)-->universal cursor -->only moves ahead -->unidirectional
		
		//list iterator(3)-->moves forward as well as backward-->bidirectional-->supports only list interface
		System.out.println("-------------Iterator------------");
		
		 Iterator<Integer> iterator_use = al.iterator();// iterator_use is reference variable & al is object of arraylist
		 
		 while (iterator_use.hasNext())//returntype = boolean(returns true if iteration has more elements
		 {
			 System.out.println(iterator_use.next());//show the values on each index (8 30 6 21 14 900)
			 System.out.println(iterator_use.hasNext());//cheacks every element till end it gets its last element then returns false after last element 
		 }
		 System.out.println("------------ListIterator--------------");
		 
		 ListIterator<Integer> List = al.listIterator();
		 
		 while (List.hasNext())//show the values on each index (8 30 6 21 14 900)
		 {
			 System.out.println(List.next());//returns next element in list....throws exception-->nosuch a element if the iteration has no next element
			 System.out.println(List.hasNext());//cheacks every element till end it gets its last element then returns false after last element 
		 }
		 System.out.println("---------Using Listiterator in Reverse Direction----------");
		 
		 
		 while ( List.hasPrevious())//returntype boolean..retuens true while traversing through the list in reverse direction
		 {
			 System.out.println(List.previous());
			 System.out.println(List.hasPrevious());//cheacks every element till end it gets its first element then returns false after first element 
		 }
		
		}
		
	}


