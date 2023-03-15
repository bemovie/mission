package exjavapro;
//1
import java.util.Scanner;

public class mission8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <=recty2))
				return true;
		else return false;
	}
	
	public static void main(String[] args) {
			
	Scanner scan = new Scanner(System.in);
	System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
	int c = scan.nextInt();
	int d = scan.nextInt();
	
	if (inRect(a, b, 100, 100, 200, 200) == true && inRect(c, d, 100, 100, 200, 200) == true)
		System.out.println("(" + a + "," + b + ")는 사각형 안에 있습니다.");
	else 
			System.out.println("(" + a +"," + b + ")는 사각형 안에 없습니다.");
		
	
	
	scan.close();
		}
	}