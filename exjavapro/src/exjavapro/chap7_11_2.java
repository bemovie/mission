package exjavapro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

public class chap7_11_2 {

	static HashMap<String, String> map;
	
	public chap7_11_2() {
		
		map = new HashMap<String, String>();
		map.put("스페인", "마드리드");
		map.put("영국", "런던");
		map.put("프랑스", "파리");
		map.put("독일", "베를린");
		map.put("그리스", "아테네");
		map.put("미국", "워싱턴");
		map.put("멕시코", "멕시코시티");
		map.put("중국", "베이징");
		map.put("일본", "도쿄");	
		
	}
	
	public static void input() {
		
		while(true) {
			
		System.out.print("나라와 수도 입력" + (map.size()+1) + ">> ");
		Scanner scan = new Scanner(System.in);
		scan = new Scanner(System.in);
		String msg = scan.nextLine();
		
//		for ( String a : map.get())
//		System.out.println(a);
		
			if (msg.equals("그만")) { menu(); break;}
			
			StringTokenizer st = new StringTokenizer(msg, " ");
			while (st.hasMoreTokens()) {
				String country = st.nextToken().trim();
				String capital = st.nextToken().trim();
				if ((map.containsKey(country))) { System.out.println(country + "는 이미 있습니다!!"); break;}
				map.put(country, capital);
			
			}
			
		}
	}
	
	public static void print() {
		for(String name : map.keySet())
			System.out.println(map.get(name));
	}
	
	public static void quiz() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {	
			
			//Iterator가 while문 안으로 들어와야 정상적으로 작동한다,
			//아마도 it 초기화 문제인듯?
			Set<String> set = map.keySet();
//		set. //set에는 get이 없다
//		Vector v = (Vector)set; // Vector 강제 casting도 안됨
			Iterator<String> it = set.iterator();
			
//			Random rd = new Random();
//			int num = rd.nextInt(map.size());
			int num = (int)(Math.random()*map.size());
			int count = 0;
			String country = null;
			
			while((it.hasNext())) { //(it.hasNext())
				country = it.next();
//				System.out.println(country);
				if ( count == num ) {
					System.out.println(country + "의 수도는?");
					break;
				}
				
				count ++;
			}
			
			String answer = scan.next();
			if (answer.equals("그만")) { menu(); break; }
		//	System.out.println(answer);
		//	System.out.println(map.get(country).trim());
			if (answer.equals(map.get(country))) { System.out.println("정답!!"); }
			else { System.out.println("아닙니다!!"); }
		}
		
	}
	
	public static void menu() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
		int num = scan.nextInt();
		
			
			switch (num) {
			
			case 1 : {
				System.out.println("현재 " + map.size() + "개의 나라와 수도가 입력되어 있습니다.");
				input();
				break;
				}
			case 2 : { quiz(); break;}
			case 3 : { System.out.println("게임을 종료합니다.."); break; }
			
			}
	}
	
//	public static void answer() {
//		for(String country)
//	}
	
	public static void main(String[] args) {
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		chap7_11_2 ex = new chap7_11_2();
		menu();
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
//		int num = scan.nextInt();
//		
//			
//			switch (num) {
//			
//			case 1 : {
//				System.out.println("현재 " + map.size() + "개의 나라와 수도가 입력되어 있습니다.");
//				input();
//				break;
//				}
//			case 2 : { quiz(); break;}
//			case 3 : { System.out.println("게임을 종료합니다.."); break; }
//			
//			}	

	}

}