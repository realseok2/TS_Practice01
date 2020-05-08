package com.javaex.practic;

public class TS_Ex09 {

	public static void main(String[] args) {

		
//		Ex09. 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
//					 결과 값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하시오.
//					 
//		double f = 80.0;
//		System.out.println(5/9*(f-32.0));
//		
//		참고 : 화씨 -> 섭씨 = 5/9*(F-32)						섭씨 -> 화씨 = (C*9/5)+32
		
		double f = 80.0;
		System.out.println((double)5/9*(f-32.0));										//		5/9는 몫만 구하는 구문이기에 0이 출력되므로 0과 어떤 숫자를 곱해도 0이 나온다
		 																																//		따라서 5/9를 소수점을 포함하는 double로 형 변환을 하여 사용해야 정상적인 값을 도출해 낼 수 있다.
	}

}
