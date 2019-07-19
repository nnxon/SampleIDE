package com.nasir.sample;

class Outer_Class {
	
	private class Inner_Class{
		public void print(){
			System.out.println("This is an inner class");
		}
	}
	
	void myMethod(){
		class Inner_Class3{
			public void print(){
				System.out.println("This is inner class3 inside myMethod");
			}
			
		}
		Inner_Class3 inner = new Inner_Class3();
		inner.print();
	}
	
	public class Inner_Class2{
		public void print(){
			System.out.println("This is an inner class 2");
		}
	}
	
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();
	}

}

class My_Class{
	
	public void displayMessage(Message m){
		System.out.println(m.greet());
	}
	
	public static void main(String args[]){
		Outer_Class outer = new Outer_Class();
		outer.display_Inner();
		
		Outer_Class.Inner_Class2 inner =  outer.new Inner_Class2();
		inner.print();
		
		outer.myMethod();
		
		My_Class obj = new My_Class();
		obj.displayMessage(new Message() {
			
			@Override
			public String greet() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});
		
		
	}
}
