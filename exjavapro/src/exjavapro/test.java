package exjavapro;

import java.util.Calendar;

import java.util.List;

import java.util.Scanner;

public class test {


static void game(String name, String name2) {


// int a = Calendar.SECOND;

// System.out.println(a);


// int count = 0;

// String name = null;

// int a[] = null;


// while (count<2) {


// if (count % 2 == 0)

// name = "황기태";

// else

// name = "이재문";




// ~ 게임 시작 ~


System.out.println("10초에 가까운 사람이 이기는 게임입니다");


// ~ name의 턴 ~


int diff = 0;


System.out.print(name + "시작 <Enter>키>>");


Scanner scan = new Scanner(System.in);

String enter = scan.nextLine();


Calendar cal = Calendar.getInstance(); // cal 객체로 받고, 변수에 받음

int s = cal.get(Calendar.SECOND);


if (enter.equals(""))

System.out.println(" 현재 초 시간 = " + s);

System.out.print("10초 예상 후 <Enter>키>>");


Scanner scan2 = new Scanner(System.in);

String enter2 = scan2.nextLine();


Calendar cal2 = Calendar.getInstance();

int s2 = cal2.get(Calendar.SECOND);


if (enter2.equals(""))

System.out.println(" 현재 초 시간 = " + s2);


if (s2 >= s) diff = s2 - s;

else diff = s2 + 60 - s;

// ~ name2 의 턴 ~


int diff2 = 0;


System.out.print(name2 + "시작 <Enter>키>>");

// Scanner scan3 = new Scanner(System.in);

enter = scan.nextLine();

// Calendar cal3 = Calendar.getInstance();

// s = cal3.get(Calendar.SECOND);

s = Calendar.getInstance().get(Calendar.SECOND); // 변수에 바로 받음


if (enter.equals(""))

System.out.println(" 현재 초 시간 = " + s);

System.out.print("10초 예상 후 <Enter>키>>");


// Scanner scan4 = new Scanner(System.in);

enter2 = scan2.nextLine();

// Calendar cal4 = Calendar.getInstance();

// s2 = cal4.get(Calendar.SECOND);

s2 = Calendar.getInstance().get(Calendar.SECOND);


if (enter2.equals(""))

System.out.println(" 현재 초 시간 = " + s2);


if (s2 >= s) diff2 = s2 - s;

else diff2 = s2 + 60 - s;


// count++;

// }



// ~ 최종 결과 ~


System.out.print(name + " 의 결과" + diff + ", ");

System.out.print(name2 + " 의 결과" + diff2 + ", ");


// System.out.println(name + "의 결과" + a[1]);



if (Math.abs(10 - diff) < Math.abs(10 - diff2))

System.out.println("승자는 " + name);

if (Math.abs(10 - diff) > Math.abs(10 - diff2))

System.out.println("승자는 " + name2);

else

System.out.println("무승부입니다~");


scan.close();

scan2.close();

// scan3.close();

// scan4.close();


}



public static void main(String[] args) {


game("황기태","이재문");


}




}