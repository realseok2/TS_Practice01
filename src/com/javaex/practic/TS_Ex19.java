package com.javaex.practic;

public class TS_Ex19 {

	public static void main(String[] args) {

		System.out.println("long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하는 프로그램입니다.");

		int time = 60 * 60 * 24 * 365;

		System.out.println("빛이 1년동안 가는 거리는 " + (time * 3000000l) + "km 입니다.");
	}						//		long형 변수를 사용하기 위해서는 넘치는 값의 뒤에 l을 붙여준다.
							//		같은 방식으로 float을 사용하기 위해서는 값의 뒤에 f를 붙여준다.
}
