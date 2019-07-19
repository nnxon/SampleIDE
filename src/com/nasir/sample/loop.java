package com.nasir.sample;

class LoopStatement{
	
	public static void main(String args[]){

		//for loop---------------------------
		// int target = Integer.parseInt(args[0]);
		// for(int i=1; i<=target;++i){
		// 	System.out.println("Line "+ i);
		// }


		//for each loop---------------------
		// for(String items: args){
		// 	System.out.println(items);
		// }


		//while loop------------------------
		// int i=1;
		// while(i<5){
		// System.out.println("This is : "+ i);
		// 	i++;
		// }

		//nested whileloop--------------------
		// int outer=1;
		// while(outer<3){

		// 	int inner=5;
		// 	while(inner<8){
		// 		System.out.println(outer + "  "+inner);
		// 		inner++;
		// 	}
		// 	outer++;
		// }


		//do while loop--------------------------
		int outer=1;
		do{
			int inner=5;
			do{
				System.out.println(outer + "  "+inner);
				inner++;
			}while(inner<8);
			outer++;
		}while(outer<3);

	}
	

}