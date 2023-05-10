package exjavapro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

//class Nation {
//	
//	private String country;
//	private String capital;
//	
//	public Nation(String country, String capital) {
//		
//		this.country = country;
//		this.capital = capital;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCapital() {
//		return capital;
//	}
//
//	public void setCapital(String capital) {
//		this.capital = capital;
//	}
//
//	
//	@Override
//	public String toString() {
//		return "Nation [country=" + country + ", capital=" + capital + "]";
//	}
//	
//}
//
//public class chap7_11 {
//	
//	static Vector<Nation> vec = new Vector<Nation>();
//	
//	public static void input() {
//		
//		while(true) {
//			
//		System.out.print("나라와 수도 입력" + (vec.size()+1) + ">> ");
//		Scanner scan = new Scanner(System.in);
//		scan = new Scanner(System.in);
//		String msg = scan.nextLine();
//		
//			if (msg.equals("그만")) { menu(); break;}
//			
//			StringTokenizer st = new StringTokenizer(msg, " ");
//			while (st.hasMoreTokens()) {
//				String country = st.nextToken().trim();
//				String capital = st.nextToken().trim();
//				Nation n = new Nation(country, capital);
//				if ((vec.contains(country))) { System.out.println(country + "는 이미 있습니다!!"); break;}
//				vec.add(n);
//			
//			}
//			
//		}
//	}
//	
//	public static void quiz() {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {	
//			
//			Iterator<Nation> it = vec.iterator();
//			
//			int num = (int)(Math.random()*vec.size());
//			int count = 0;
//			Nation country;
//			
//			while((it.hasNext())) { //(it.hasNext())
//				country = it.next();
////				System.out.println(country);
//				if ( count == num ) {
//					System.out.println(country + "의 수도는?");
//					break;
//				}
//				
//				count ++;
//			}
//			
//			String answer = scan.next();
//			if (answer.equals("그만")) { menu(); break; }
//		//	System.out.println(answer);
//		//	System.out.println(map.get(country).trim());
////			if (answer.equals(map.get(country))) { System.out.println("정답!!"); }
//			else { System.out.println("아닙니다!!"); }
//		}
//		
//	}
//	
//	public static void menu() {
//			
//		Scanner scan = new Scanner(System.in);
//		System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
//		int num = scan.nextInt();
//			
//				
//			switch (num) {
//				
//			case 1 : {
//				System.out.println("현재 " + vec.size() + "개의 나라와 수도가 입력되어 있습니다.");
//				input();
//				break;
//				}
//			case 2 : { quiz(); break;}
//			case 3 : { System.out.println("게임을 종료합니다.."); break; }
//				
//			}
//	}
//	
//	public static void main(String[] args) {
//		
//		Nation n1 = new Nation("스페인", "마드리드");
//		Nation n2 = new Nation("영국", "런던");
//		Nation n3 = new Nation("프랑스", "파리");
//		Nation n4 = new Nation("독일", "베를린");
//		Nation n5 = new Nation("그리스", "아테네");
//		Nation n6 = new Nation("미국", "워싱턴");
//		Nation n7 = new Nation("멕시코", "멕시코시티");
//		Nation n8 = new Nation("중국", "베이징");
//		Nation n9 = new Nation("일본", "도쿄");
//		
//		vec.add(n1);
//		vec.add(n2);
//		vec.add(n3);
//		vec.add(n4);
//		vec.add(n5);
//		vec.add(n6);
//		vec.add(n7);
//		vec.add(n8);
//		vec.add(n9);
//		
//		for (Nation a : vec)
//			System.err.println(a);
//
//	}
//}
