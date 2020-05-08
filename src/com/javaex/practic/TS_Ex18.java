package com.javaex.practic;

import java.util.Scanner;

public class TS_Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사용자로부터 화씨 온도를 입력 받아 섭씨 온도로 변환하는 프로그램입니다.");

		double F;

		System.out.print("확인하고자 하는 화씨의 온도를 입력해 주세요 : ");
		F = sc.nextDouble();

		System.out.println("입력한 화씨 온도로 계산한 결과 섭씨 온도는 " + (double) 5 / (double) 9 * (F - 32) + "도 입니다.");

		sc.close();
	}

}
