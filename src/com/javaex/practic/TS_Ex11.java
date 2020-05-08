package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex11 {

	public static void main(String[] args) {

		
//		Ex11. 월급을 입력 받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		
		int money;
		
		System.out.println("월급을 입력 받아 10년간 최대 저축액을 계산해 주는 프로그램입니다.");
		System.out.print("월급을 입력하세요 : ");
		
		money = sc.nextInt();
		
		System.out.println("당신의 월급으로 계산한 결과 10년동안 최대 저축액은 " + money*12*10 + "원 입니다.");
		
		sc.close();
	}

}
