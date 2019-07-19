//multi thread example
package com.nasir.sample;

public class ThreadTest extends Thread{
	
	@Override
	public void run(){
		try{
			long l =  (long)(Math.random() * 100);
			System.out.println("I am a new Thread "+ this.getName() + " running : " + l);
			Thread.sleep(1000);
			System.out.println(this.getName() + " just woke up : " + l);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		

	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest();	
		t1.setPriority(MIN_PRIORITY); //set priority if we want to
		ThreadTest t2 = new ThreadTest();
		ThreadTest t3 = new ThreadTest();
		t3.setPriority(MAX_PRIORITY); //set priority if we want to
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		t1.start(); // not t1.run because only cpu gets to run it
		t2.start(); // not t2.run because only cpu gets to run it
		t3.start(); // not t3.run because only cpu gets to run it
		t4.start(); // not t4.run because only cpu gets to run it
		t5.start(); // not t5.run because only cpu gets to run it

		
		
	}

}



//single threaded example
//package com.nasir.sample;
//
//public class ThreadTest{
//	
//	
//	public void start(){
//		try{
//			long l =  (long)(Math.random() * 100);
//			System.out.println("I am a new Thread running : " + l);
//			Thread.sleep(1000);
//			System.out.println("I just woke up : " + l);
//		}catch(InterruptedException ex){
//			ex.printStackTrace();
//		
//
//	}
//		
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ThreadTest t1 = new ThreadTest();		
//		ThreadTest t2 = new ThreadTest();
//		ThreadTest t3 = new ThreadTest();
//		ThreadTest t4 = new ThreadTest();
//		ThreadTest t5 = new ThreadTest();
//		
//		t1.start(); // not t1.run because only cpu gets to run it
//		t2.start(); // not t2.run because only cpu gets to run it
//		t3.start(); // not t3.run because only cpu gets to run it
//		t4.start(); // not t4.run because only cpu gets to run it
//		t5.start(); // not t5.run because only cpu gets to run it
//
//		
//		
//	}
//
//}
