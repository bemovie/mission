package exjavapro;
//1
import java.util.Scanner;

public class mission10 {
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	System.out.print("첫번째 원의 중심과 반지름 입력>>");
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double c = scan.nextDouble();
	System.out.print("두번째 원의 중심과 반지름 입력>>");
	double d = scan.nextDouble();
	double e = scan.nextDouble();
	double f = scan.nextDouble();
	
	if ((Math.sqrt(Math.pow(a-d,2) + Math.pow(b-e,2))) <= c+f)
		System.out.println("두 원은 서로 겹친다.");
	else 
		System.out.println("두 원은 서로 안 겹친다.");
		
	
	
	scan.close();
		}
	}