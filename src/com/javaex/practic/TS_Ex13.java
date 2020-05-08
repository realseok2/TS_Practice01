package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex13 {

	public static void main(String[] args) {

//		Ex13. 원화를 달러화로 계산하는 프로그램을 작성하세요. (환율 1달러 = 1230.95원 상수로 지정)

		Scanner sc = new Scanner(System.in);

		int money;

		System.out.println("원화를 달러화로 계산하는 프로그램입니다.");
		System.out.print("환전 할 원화를 입력하세요 : ");
		money = sc.nextInt();

		System.out.println("받으실 달러는 " + money / 1230.95 + "달러 입니다.");

		sc.close();

	}

}
