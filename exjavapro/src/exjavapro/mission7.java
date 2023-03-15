package exjavapro;
//1
import java.util.Scanner;

public class mission7 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("점 (x,y)의 좌표를 입력하시오>>");
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	if (a>=100 && a<=200 && b>=100 & b<=200)
		System.out.println("(" + a + "," + b + ")는 사각형 안에 있습니다.");
	else 
			System.out.println("(" + a +"," + b + ")는 사각형 안에 없습니다.");
		
	scan.close();
		}
	}