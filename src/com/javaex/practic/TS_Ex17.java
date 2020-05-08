package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double radius;

		System.out.println("사용자로부터 구의 반지름을 입력받아 부피를 계산하는 프로그램입니다.");
		System.out.print("구의 반지름의 길이를 입력해 주세요 : ");
		radius = sc.nextDouble();

		System.out.println(
				"입력하신 구의 반지름으로 계산한 결과 부피는 " + (double) 4 / (double) 3 * 3.14 * radius * radius * radius + "입니다.");

		sc.close();

	}

}
