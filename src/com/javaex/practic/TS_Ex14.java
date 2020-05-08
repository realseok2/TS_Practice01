package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex14 {

	public static void main(String[] args) {

//		Ex14. 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		double width;
		double height;

		System.out.println("직사각형의 둘레와 면적을 구하는 프로그램입니다.");
		System.out.print("가로의 길이를 입력하세요 : ");
		width = sc.nextDouble();
		System.out.print("세로의 길이를 입력하세요 : ");
		height = sc.nextDouble();

		System.out.println("사각형의 넓이는 " + width * height + "입니다.");
		System.out.println("사각형의 둘레는 " + (width + height) * 2 + "입니다.");

		sc.close();
	}

}
