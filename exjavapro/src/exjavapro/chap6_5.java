package exjavapro;

import java.util.Calendar;

public class chap6_5 {
	
	private static int hour24;
	private static int min;

	static String run(int a) {
		
		if (a >= 4 && a < 12)
			return "Good Morning";
		else if (a >= 12 && a < 18)
			return "Good Afternoon";
		else if (a >= 18 && a < 22)
			return "Good Evening";
		else
			return "Good Night";
		
	}
	
	static String ap(int b) {
		
		if (hour24 >= 12) {
			b = hour24 - 12;
			return "오후 " + b;	
		}
		
		else
			return "오전 " + b;
		
	}

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		hour24 = cal.get(Calendar.HOUR_OF_DAY);
		min = cal.get(Calendar.MINUTE);
		
		System.out.println("현재 시간은 " + ap(hour24) + "시 " + min + "분입니다.");
		System.out.println(run(hour24));

	}
	
}


