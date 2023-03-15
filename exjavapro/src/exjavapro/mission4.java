package exjavapro;
//1
import java.util.Scanner;

public class mission4 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.print("정수 3개 입력>>");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	int mid = 0;
	
	if (a>b && a>c) {
		if (b>c)
		mid = b;
		else mid =c;}
	else if	(a<b && a<c) {
		if(b<c)
		mid = b;
		else mid=c;}
	else mid = a;
	System.out.println("중간 값은 " + mid);
	
	scan.close();
	}
}