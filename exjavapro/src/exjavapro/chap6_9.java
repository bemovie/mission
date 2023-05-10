package exjavapro;

import java.util.Scanner;

public class chap6_9 {

	public static void main(String[] args) {
		
		
		while (true) {
			
			System.out.println("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			
			int b = 1 + (int)(Math.random()*3);
			
			switch (a) {
			
			case 1 :
				switch (b) {
				case 1: System.out.println("철수(가위) : 컴퓨터(가위)");
						System.out.println("비겼습니다.");
						continue;
				case 2: System.out.println("철수(가위) : 컴퓨터(바위)");
						System.out.println("컴퓨터가 이겼습니다.");
						continue;
				case 3: System.out.println("철수(가위) : 컴퓨터(보)");
						System.out.println("철수가 이겼습니다.");
						continue;
				}
			case 2 :
				switch (b) {
				case 1: System.out.println("철수(바위) : 컴퓨터(가위)");
						System.out.println("철수가 이겼습니다.");
						continue;
				case 2: System.out.println("철수(바위) : 컴퓨터(바위)");
						System.out.println("비겼습니다.");
						continue;
				case 3: System.out.println("철수(바위) : 컴퓨터(보)");
						System.out.println("컴퓨터가 이겼습니다.");
						continue;
				}
			case 3 :
				switch (b) {
				case 1: System.out.println("철수(보) : 컴퓨터(가위)");
						System.out.println("컴퓨터가 이겼습니다.");
						continue;
				case 2: System.out.println("철수(보) : 컴퓨터(바위)");
						System.out.println("철수가 이겼습니다.");
						continue;
				case 3: System.out.println("철수(보) : 컴퓨터(보)");
						System.out.println("비겼습니다.");
						continue;
				}
			case 4 : break;
				
			}
			
			scan.close();
			break;
		}
		
	}

}
