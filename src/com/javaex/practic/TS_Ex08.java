package com.javaex.practic;

public class TS_Ex08 {

	public static void main(String[] args) {

//		Ex08. 다음 코드의 잘못된 부분을 찾아서 수정해 보세요.
//		
//		int x, y = 0;								x와 y를 모두 0으로 초기화
//		
//		char grade = "A";					문자 A를 grade에 대입
//		
//		int salary = 2,000,000;		salary에 2,000,000을 대입
//		
//		byte n = 1000;						n에 1000을 대입

		int x, y = 0;														//		오류가 발생하지 않았다
		
		char grade = 'A';											//		char의 경우에는 ""가 아닌 ''를 사용한다.
		
		String salary = "2,000,000";					//		, 가 포함되어 있기에 문자로 인식되어 String을 사용해야 한다.
		
		short n = 1000;											//		byte의 크기를 초과하여 다음 사이즈인 short로 바꿔 주었다.
		
	}

}
