package demoCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo 
{

	public static void main(String[] args)
	
	{
		
		LinkedList<String>obj = new LinkedList<>();
		
		obj.add("Shraddha");
		obj.add("Pranita");
		obj.add("Pooja");
		obj.add("Anuja");
		obj.add("Shweta");
		obj.add("Ashwini");
		obj.add("Vibha");
		
		//Iterator
		System.out.println("-------Iterator---------");
		
		Iterator<String> it = obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		//sorting
		
		System.out.println("------sorting-----");
		Collections.sort(obj);
		it=obj.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		//ListIteraror
		System.out.println("-------ListIterator---------");
		
		ListIterator<String> li = obj.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

		System.out.println("-------Previous---------");

		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		obj.remove("Anuja");
		obj.remove("Vibha");

		
		System.out.println("-------Enhance for loop---------");
        
		for(String s : obj)
	    System.out.println(s);
		
		System.out.println("-------forEach() Method---------");
		obj.forEach(p->System.out.println(p));

	}
	
	
}
