package com.javaex.practic;

public class TS_Ex04 {

	public static void main(String[] args) {

		
//		Ex04. 다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하고 수정해 보세요.

//	   문제
//		int x, y;
//		x = 10
//		y = 20
//		
//		sum = x + y
//		
//		System.out.println("합은 ' + sum);"
//
//}
	
	
			int x, y;
			int sum;																										//		제대로 동작하기 위에 추가했음.
			x = 10;																											//		;이 빠졌다.
			y = 20;																											//		;이 빠졌다.
			
			
			sum = x + y;																								//		;이 빠졌고, sum에게 int값 등의 변수명이 지정되지 않았다.
			
			System.out.println("합은 " + sum);												//		'이 "으로 바뀌어야 하고 위와 마찬가지로 sum이 지정되지 않았다.
		
		}
}																																	//		}가 하나 덜 닫혀 있었다.