package collection_Study;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Study {

	public static void main(String[] args)
	{   //SET Properties 
		//duplicates are not allowed ,only 1 null value is allowed(except treeset) ,order of insertion is random/maintain/ascendending 
		//stoarge type=hashable
		//1.HASHSET
		//duplicates are not allowed ,only 1 null value is allowed(except treeset) ,order of insertion is random/maintain/ascendending 
		//stoarge type=hashable
		//supports for each & iterator 
		//get() method can't applicable for Set interface, so that we can not able to use 'For Loop'
		//and ListIterator applicable only for list interface type impl classes
		//DataStructure =doubly...IC=CC*2
		//best choice =to remove the element s order of insertion is not mandatrory 
	
		java.util.HashSet<Object> hash=new HashSet<Object>();
		hash.add("vaish");
		hash.add(30);
		hash.add('G');
		hash.add(76.90);
		hash.add(null);
		hash.add(null);
		hash.add("vaish");
		System.out.println(hash);//order of insertion is random,duplicy avoided,only took 1 null value
		System.out.println("=========for each loop ===============");
		for(Object obj:hash)
		{
			System.out.println(obj);
		}
		System.out.println("=========for loop ===============");
		
		for(int i=0;i<=hash.size()-1;i++)
		{
			System.out.println(i);//will only shows the index not the element on each index 
			//as in hashset order is not maintained its not possible for complier to fetch the element on each index 
		}
		System.out.println("=========Iterator ===============");
		Iterator<Object> ha = hash.iterator();
		while(ha.hasNext())
		{
			System.out.println(ha.next());
		}
		System.out.println("=========List Iterator ===============");
		//hash.li there is no method called listiterator in hastset 

	}

}
