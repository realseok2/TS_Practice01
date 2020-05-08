package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex15 {

	public static void main(String[] args) {

//		Ex15. 마일을 km로 변환하는 프로그램을 작성하세요. (1마일 = 1.609km 상수로 지정)

		Scanner sc = new Scanner(System.in);

		int mile = 0;
		System.out.println("마일을 km로 변환하는 프로그램입니다.");
		System.out.print("마일을 입력하세요 : ");
		mile = sc.nextInt();

		System.out.println(mile + "마일은 " + mile * 1.609 + "km 입니다.");

		sc.close();
	}

}
