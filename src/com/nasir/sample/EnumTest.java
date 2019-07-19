package com.nasir.sample;

public class EnumTest {
	Day day;
	
	public EnumTest(Day day){
		this.day=day;
	}
	
	public void tellItLikeItIs(){
		switch(day){
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Friday are getting nicer.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
	
	public static void main(String args[]){
		EnumTest firstday = new EnumTest(Day.WEDNESDAY);
		//EnumTest firstday = new EnumTest(WEDNESDAY); if we import static com.nasir.sample.Day;
		firstday.tellItLikeItIs();
	}

}



