package exjavapro;

import java.util.Scanner;

public class p386_8 {

	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scan = new Scanner(System.in);
		String msg = scan.nextLine();
		
		//System.out.println(msg);
		
		String s[] = msg.split("");
		String a;
		for (int i=0; i<msg.length(); i++)
			System.out.print(s[i]);

		for (int i=0; i<msg.length(); i++) {
			System.out.println(msg);
			msg = msg.substring(i);
//			msg = msg.concat(msg.charAt(i));

		}
			
		
//		int count = 0;
//		while(true) {
//			
//			for (int i=0; i<msg.length(); i++) {
//				System.out.print(s[i]);
//				String temp = s[i];
//				s[i] = s[i+1];
//				s[msg.length()-1] = s[i];	//이러면 뒷부분은 데이터가 사라져서 안됨;
//				
//			}
//			System.out.println();
//			count++;
//			if (count > msg.length())
//			break;
			
		}
	}

	
	

