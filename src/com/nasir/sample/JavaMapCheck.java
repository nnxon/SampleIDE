package com.nasir.sample;
import java.util.*;

public class JavaMapCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		int i=1;
		for(String s:args){
			map.put(Integer.toString(i), s);
			i++;
		}
		
		System.out.println(map);
		System.out.println(map.get("3"));
		
	}

}
