package com.nasir.sample;

public class FinalRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass.sayHi("Nasir");
		FinalClass obj = new FinalClass();
		obj.sayHi(obj.className);
		obj.sayHi(obj.className2);
		obj.sayBye("Nasir");
		
		obj.className = "MyClass1";
		obj.className2 = "MyClass2";
		
		obj.sayHi(obj.className);
		obj.sayHi(obj.className2);
		
		FinalClass.sayHi("Naubi");
		FinalClass obj2 = new FinalClass();
		obj2.sayHi(obj2.className);
		obj2.sayHi(obj2.className2);
		obj2.sayBye("Nasir");
		
		obj2.className = "MyClass1";
		obj2.className2 = "MyClass2";
		
		obj2.sayHi(obj2.className);
		obj2.sayHi(obj2.className2);

	}

}
