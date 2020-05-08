package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex12 {

	public static void main(String[] args) {

//		Ex12. 반지름을 입력 받아 원의 면적을 구하는 프로그램을 작성하세요. (파이값은 3.14 상수로 지정)

		Scanner sc = new Scanner(System.in);

		int length;

		System.out.print("반지름을 입력하세요 : ");
		length = sc.nextInt();

		System.out.println("원의 넓이는 " + length*length*3.14 + "입니다.");
		sc.close();
	}

}
