package exjavapro;
//1
import java.util.Scanner;

public class mission12 {
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	System.out.print("연산>>");
	 double a = scan.nextDouble();
	 String b = scan.next();
	 double c = scan.nextDouble();
	 
//	 System.out.println(a+b+c + "의 계산 결과는 " + (a+c));
	 
	 switch (b) {
	 	case "+":
			System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a+c));
			break;
	 	case "=":
			System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)a + "=" + (int)c);
			break;
	 	case "*":
			System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a*c));
			break;
	 	case "/": 
			System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a/c));
			break;
	 }
	 
//	if (b.equals ("+"))
//		System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a+c));
//	else if (b.equals ("="))
//		System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)a + "=" + (int)c);
//	else if (b.equals ("*"))
//		System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a*c));
//	else if (b.equals ("/") && c != 0) 
//		System.out.println((int)a+b+(int)c + "의 계산 결과는 " + (int)(a/c)); 
//	else if (b.equals ("/") && c == 0)
//		System.out.println("0으로 나눌 수 없습니다.");
	
	// casting
	
	
	
	
	scan.close();
		}
	}