package exjavapro;
//1
public class p167_13 {

	public static void main(String[] args) {

		for(int a = 1 ; a < 100 ; a++) {	
			if (a/10==3 || a/10==6 || a/10==9) {
				if (a%10==3 || a%10==6 || a%10==9)
				System.out.println(a + " 박수짝짝");
				else 
				System.out.println(a + " 박수짝");
				}
			else if (a/10!=3 || a/10!=6 || a/10!=9) {
				if (a%10==3 || a%10==6 || a%10==9)
					System.out.println(a + " 박수짝");
				else continue;
			}
		}
	}
}