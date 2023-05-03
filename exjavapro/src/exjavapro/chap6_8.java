package exjavapro;

import java.util.Scanner;

public class chap6_8 {

	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		for (int i=0; i < a.length() ; i++) {
			a = (a.substring(1)).concat(a.substring(0,1));
			System.out.println(a);	
		}
		
		scan.close();
	}
}
