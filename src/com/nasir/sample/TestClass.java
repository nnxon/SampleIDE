package com.nasir.sample;

public class TestClass implements Inf2 {

	@Override
	public String WhoAmI() {
		// TODO Auto-generated method stub
		return "I am test Class";
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test It");
	}

	public static void main(String[] args) {
		System.out.println("Inside testclass main");
		System.out.println(name);
		
		TestClass test = new TestClass();
		test.testIt();
		
		System.out.println(Inf2.name);
		
		Inf2 obj = new TestClass();
		
		System.out.println(obj.WhoAmI());
		obj.testIt();

		
	}

}
