package exjavapro;

import java.util.Calendar;
import java.util.Scanner;

public class chap6_6 {

	public static void main(String[] args) {
	
//	int a = Calendar.SECOND;
//			System.out.println(a);
		
	int count = 0;
	String name = null;
	
	
	while (true) {
		count++;
		if (count % 2 == 1)
			name = "황기태";
		else
			name = "이재문";
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다");
		System.out.print(name + "시작 <Enter>키>>");
		
		Scanner scan = new Scanner(System.in);
		String enter = scan.nextLine();
		
		Calendar cal = Calendar.getInstance();
		int s = cal.get(Calendar.SECOND);
		
		if (enter.equals(""))
			System.out.println("	현재 초 시간 = " + s);
		System.out.print("10초 예상 후 <Enter>키>>");
		
		Scanner scan2 = new Scanner(System.in);
		String enter2 = scan2.nextLine();
		
		Calendar cal2 = Calendar.getInstance();
		int s2 = cal2.get(Calendar.SECOND);
		
		if (enter2.equals(""))
			System.out.println("	현재 초 시간 = " + s2);
		
		
		
	}
	
	
	
	}

}
