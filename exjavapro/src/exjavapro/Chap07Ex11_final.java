package exjavapro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;

class Nation { // 나라이름(country)과 수도(capital)로 구성된 Nation 클래스 작성
	
	//필드(private)
	private String country;
	private String capital;
	
	//생성자
	public Nation(String country, String capital) {
		
		this.country = country;
		this.capital = capital;
	}
	
	//getters & setters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	@Override
	public String toString() {
		return "Nation [country=" + country + ", capital=" + capital + "]";
	}
	
}

public class Chap07Ex11_final {
	
	static Vector<Nation> vec = new Vector<Nation>(); 
	// Vector<Nation> 컬렉션 vec 이용
	
	//입력 method
	public static void input() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("나라와 수도 입력" + (vec.size()+1) + ">> ");
		String msg = scan.nextLine();
		
			if (msg.equals("그만")) { menu(); break; }
			
			StringTokenizer st = new StringTokenizer(msg, " ");
			while (st.hasMoreTokens()) {
				
				String country = st.nextToken().trim();
				String capital = st.nextToken().trim();
				Nation n = new Nation(country, capital);
				
				for(int i=0 ; i < vec.size() ; i ++) {
					if ((vec.get(i).getCountry().equals(country))) { 
						System.out.println(country + "는 이미 있습니다!!"); 
						vec.remove(i); // Vector는 중복 허용이므로, 기존의 element를 미리 삭제시켜준다
						break;
					}
				}	
				vec.add(n);	
			}
			
		}
	}
	
	//퀴즈 method
	public static void quiz() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			int num = (int)(Math.random()*vec.size());
			Nation na = vec.get(num);	//무작위 num의 index의 element를 na 객체로 받음
			String q = na.getCountry();	//question
			String a = na.getCapital();	//answer
			
			System.out.println(q + "의 수도는?");
			String answer = scan.next().trim();
			
			if (answer.equals("그만")) { menu(); break; }
			if (answer.equals(a)) { System.out.println("정답!!"); }
			else { System.out.println("아닙니다!!"); }
		}
				
	}
	
	//print method (list에서 사용)
	public static void print() {
		for (Nation a : vec)
			System.out.println(a);
	}	
	
	//메뉴 method
	public static void menu() {
			
		Scanner scan = new Scanner(System.in);
		System.out.print("입력:1, 퀴즈:2, 종료:3 list:4>> ");
		int num = scan.nextInt();
			
			switch (num) {
				
			case 1 : {
				System.out.println("현재 " + vec.size() + "개의 나라와 수도가 입력되어 있습니다.");
				input();
				break;
				}
			case 2 : { quiz(); break; }
			case 3 : { System.out.println("게임을 종료합니다.."); break; }
			case 4 : { print(); menu(); break; }
			
			}
	}
	
	public static void main(String[] args) {
			
		vec.add(new Nation("스페인", "마드리드"));
		vec.add(new Nation("영국", "런던"));
		vec.add(new Nation("프랑스", "파리"));
		vec.add(new Nation("독일", "베를린"));
		vec.add(new Nation("그리스", "아테네"));
		vec.add(new Nation("미국", "워싱턴"));
		vec.add(new Nation("멕시코", "멕시코시티"));
		vec.add(new Nation("중국", "베이징"));
		vec.add(new Nation("일본", "도쿄"));

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

		menu();
		
	}
}