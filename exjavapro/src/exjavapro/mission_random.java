package exjavapro;

import java.util.Scanner;

public class mission_random {

	public static void main(String[] args) {

		System.out.print("몇 명을 뽑을까요? >> ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int rand = 0;
		for (int i=0 ; i < count ; i++) {
		rand = 1 + (int)(Math.random()*21);
		System.out.println(rand);
		}
	}

}
