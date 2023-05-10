package exjavapro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class chap8_10 {

	public static void main(String[] args) throws IOException {
		
		menu();
	}
	
	
	public static void input() {
		FileWriter fw = null;
		System.out.println("이름, 전화번호를 입력하세요>> ");
		Scanner scan = new Scanner(System.in);
		try {
			fw = new FileWriter("c:\\javaex\\phone2.txt", Charset.forName("UTF-8"), true); //true를 추가해야 이어쓰기 가능
			while(true) {
				String input = scan.nextLine();
				if(input.length() == 0) { menu(); break; } // 입력이 0(아무것도 입력안함)이면 break
				
				fw.append(input, 0, input.length());
				fw.append("\r\n", 0, 2);
			}
			fw.close();
		}
		catch(IOException e) {
			System.out.println("파일 입출력 오류");
		}
		scan.close();
	}
		
	public static void search() throws IOException {
		File f = new File("C:\\javaex\\phone2.txt");
		InputStreamReader is = new InputStreamReader(new FileInputStream(f), "UTF-8");
		BufferedReader reader = new BufferedReader(is);
		
		String line;
		StringTokenizer st;
		HashMap<String, String> map;
		map = new HashMap<String, String>(); //new로 공간할당
		while (!(line = reader.readLine()).equals("q")) {
			st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				map.put(st.nextToken(), st.nextToken());
			}
			
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");
		while (true) {
			System.out.print("이름>> ");
			String msg = scan.nextLine();
			if(map.containsKey(msg)) { System.out.println(map.get(msg)); }
			else if (msg.equals("그만")) { menu(); break; }
			else System.out.println("찾는 이름이 없습니다.");
		}
	}
	
	public static void menu() throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.입력 2.조회 3.종료>> ");
		int command = scan.nextInt();
		switch (command) {
			case 1 : { input(); break; }
			case 2 : { search(); break; }
			case 3 : { System.out.println("종료합니다.."); break; }
		}
		
	}
	
}
