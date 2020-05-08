package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("동전 별 개수를 입력 받아 총 금액을 계산하는 프로그램입니다.");
		System.out.println("동전의 개수를 입력하세요.");

		int fh, h, ft, t;

		System.out.print("500원의 개수 : ");
		fh = sc.nextInt();
		System.out.print("100원의 개수 : ");
		h = sc.nextInt();
		System.out.print("50원의 개수 : ");
		ft = sc.nextInt();
		System.out.print("10원의 개수 : ");
		t = sc.nextInt();

		System.out.println("동전의 총 합계 금액은 " + (500 * fh + 100 * h + 50 * ft + 10 * t) + "원 입니다.");

		sc.close();
	}

}
