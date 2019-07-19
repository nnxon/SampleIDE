package com.nasir.sample;

public class ContinueTriangle{
	public static void main(String args[]){
		int input;
		int target;

try{
	input = Integer.parseInt(args[0]);
	target = 0;
	
	target=(input>10)?10:input;  // for many if else can use   target=(input>1)?10:(input>5)?50:(input>20)?200:0;

			outer: for(int i=0;i<target;i++){
				for(int j=0;j<10;j++){
					
					if(j>i){
						System.out.println("L");
						continue outer;
					}
					System.out.print(" " + (i+j));
				}
			}
			System.out.println();
			
			//arithmetic
			int num = 10;
			int result = num/input;
			
			System.out.println("Result : " + result);
			
}catch(Exception e){
	System.out.println("Please insert a number input instead of string : "+ args[0]);
	//e.printStackTrace();
}finally{
	System.out.println("Finally it's done");
}


	}
}