package exjavapro;
//1
import java.util.Scanner;

public class mission9 {
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	System.out.print("원의 중심과 반지름 입력>>");
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double c = scan.nextDouble();
	System.out.print("점 입력>>");
	double d = scan.nextDouble();
	double e = scan.nextDouble();
	
	if ((Math.sqrt(Math.pow(a-d,2) + Math.pow(b-e,2))) <= c)
		System.out.println("점 (" + d + ", " + e + ")는 원 안에 있다.");
	else 
		System.out.println("점 (" + d +", " + e + ")는 원 안에 없다.");
		
	
	
	scan.close();
		}
	}