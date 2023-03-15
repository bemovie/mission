package exjavapro;
//1
import java.util.Scanner;

public class mission6 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("1~99 사이의 정수를 입력하시오>>");
	int a = scan.nextInt();
	
//	System.out.println(a);
	if (a/10==3 || a/10==6 || a/10==9) {
		if (a%10==3 || a%10==6 || a%10==9)
		System.out.println("박수짝짝");
		else 
		System.out.println("박수짝");
		}
	else if (a/10!=3 || a/10!=6 || a/10!=9) {
		if (a%10==3 || a%10==6 || a%10==9)
			System.out.println("박수짝");
		else 
			System.out.println("NO박수");
		}
	
	scan.close();
	}
}