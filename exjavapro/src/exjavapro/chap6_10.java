package exjavapro;

import java.util.Scanner;

class Person {
	
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
	int random() {
		
		int r = 1 + (int)(Math.random()*3);
//		int r2 = 1 + (int)(Math.random()*3);
//		int r3 = 1 + (int)(Math.random()*3);
		
		return r;
	}
	
	}

public class chap6_10 {

	
	public static void main(String[] args) {
		
		System.out.print("1번째 선수 이름>>");
		Person a = new Person();
		System.out.print("2번째 선수 이름>>");
		Person b = new Person();
		
		while(true) {
			
			System.out.print("[" + a.name + "]:<Enter>");
			
			Scanner scan2 = new Scanner(System.in);
			String enter = scan2.nextLine();
			int r1 = a.random();
			int r2 = a.random();
			int r3 = a.random();
			
			System.out.print("	" + r1 + "   " + r2 + "   " + r3 + "   ");
			if (r1==r2 && r1==r3) {
				System.out.println(a.name + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요~");
				
			
			System.out.print("[" + b.name + "]:<Enter>");
			enter = scan2.nextLine();
			r1 = b.random();
			r2 = b.random();
			r3 = b.random();
			
			System.out.print("	" + r1 + "   " + r2 + "   " + r3 + "   ");
			if (r1==r2 && r1==r3) {
				System.out.println(b.name + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요~");
			
		}
		
	}

}
