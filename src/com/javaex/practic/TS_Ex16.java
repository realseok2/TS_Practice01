package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("상품을 구매하면 정가의 10%를 부가세로 부여하여 출력하는 프로그램입니다.");

		int price;
		int money;

		System.out.print("상품의 가격을 입력해 주세요 : ");
		price = sc.nextInt();
		System.out.print("받은 금액을 입력해 주세요 : ");
		money = sc.nextInt();

		System.out.println("=======================================");

		System.out.println("받은 금액 : " + money);
		System.out.println("상품가격 : " + price);
		System.out.println("상품의 부가세 : " + price * 0.1);
		System.out.println("계산 결과 잔액 : " + (money - price));

		sc.close();

	}

}
