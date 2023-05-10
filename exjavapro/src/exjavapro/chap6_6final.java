package exjavapro;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

class game {
	
	game(){}
	
	static Scanner scan = new Scanner(System.in);
	String name;
	
	int game(String name) {	
				
		 this.name = name;	// static이라 this로 못받음
		
			int diff = 0;
			
			System.out.print(name + "시작 <Enter>키>>");
			String enter = scan.nextLine();
			int s = Calendar.getInstance().get(Calendar.SECOND);
			
			if (enter.equals(""))
				System.out.println("   현재 초 시간 = " + s);
			
			System.out.print("10초 예상 후 <Enter>키>>");
			String enter2 = scan.nextLine();
			int s2 = Calendar.getInstance().get(Calendar.SECOND);
			
			if (enter2.equals(""))
				System.out.println("   현재 초 시간 = " + s2);
			
			if (s2 >= s) diff = s2 - s;
			else 		 diff = s2 + 60 - s;
			
			scan.close();
			return diff;
	}
	
//	scan.close();
	
}

public class chap6_6final {

	public static void main(String[] args) {
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다");
		
		game g = new game();
		int a = g.game("황기태");	// main이 static이라 static method만 받음
		String n1 = g.name;
		int b = g.game("이재문");
		String n2 = g.name;
		System.out.print(n1 + " 의 결과 " + a + ", ");
		System.out.print(n2 + " 의 결과 " + b + ", ");
		
		if (Math.abs(10 - a) < Math.abs(10 - b))
			System.out.println("승자는 " + n1);
		if (Math.abs(10 - a) > Math.abs(10 - b))
			System.out.println("승자는 " + n2);
		else
			System.out.println("무승부입니다~");
		
	}
	
}
