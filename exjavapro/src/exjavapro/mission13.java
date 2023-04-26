package exjavapro;
//1
import java.util.Scanner;

public class mission13 {
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	System.out.print("철수>>");
		String a = scan.next();
	System.out.print("영희>>");
		String b = scan.next();

//		System.out.println(a);
//		System.out.println(b);
		
	String result="abc";
		if (a.equals("바위")) {
			if (b.equals("바위"))
				result = "무승부";
				else if (b.equals("가위"))
				result = "철수승";
				else result = "영희승";
		}
		if (a.equals("가위")) {
			if (b.equals("바위"))
				result = "영희승";
				else if (b.equals("가위"))
				result = "무승부";
				else result = "철수승";
		}
		if (a.equals("보")) {
			if (b.equals("바위"))
				result = "철수승";
				else if (b.equals("가위"))
				result = "영희승";
				else result = "무승부";
		}

		System.out.println(result);
		
	scan.close();
		}
	}