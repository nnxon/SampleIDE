package com.nasir.sample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UtilCheck {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal use (non-generic)
		//List list = new ArrayList();
				//list.add("hello");
				//list.add(new FinalClass()); this is to show that java did not check for content no error. (code error bu programmer)
				//String s = (String)list.get(0);
				//System.out.println("I got : " + s);
		
		//generic use (so that programmer wont make mistake)
		List <String> list = new ArrayList <String>(); //means it will only take string
		list.add("hello");
		list.add("I");
		list.add("am");
		list.add("java");
		//list.add(new FinalClass()); this will give error because finalClass is not string
		//String s = list.get(0); normal use if we know the size
		
		//use if we dont know the size, much better to avoid runtime error
		for(String s: list){
			System.out.println("I got : " + s);
		}
		
		//implementation using while loop
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		//for loop implementation with filtering
		for(Iterator<?> it2=list.iterator();it2.hasNext();){
			String s = (String) it2.next();
			if(s.equals("hello")){
				System.out.println("I got : " + s);
			}
			//System.out.println("I got : " + it2.next());
		}
		
		
		
	}

}