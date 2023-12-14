package javabook2.ch02;

public class Variablle {

	public static void main(String[] args) {	
		// 주의 사항!
		// 1. 변수명은 중복될 수 없다.(단, 재활당은 가능)
		// 2. 실수 타입은 연산시 오차가 있다.(부동 소수점 방식 오차)
		
		int a;      //변수 선언 = 공간을 할당
		a = 100;	//변수 할당= 값을 할당
		
		int b = 200;	//변수 선언과 할당
		
		char c;   // 문자 타입 변수 선언
		c = 'A';   // 문자 타입 변수 할당

		short s = 2;
		long l = 10;
		
		float f1 = 0.1f;
		double d1 = 0.245;
		
		boolean b1  = true;
		b1 = false;
		boolean b2 = false;
		
		
		int x = 1;
//		타입 변수명 = (값);
		boolean b3 = (x == 1);
		boolean b4 = (x ==2 );
		System.out.println(b3);
		System.out.println(b4);
		
//		문자열 데이터 타입
		String s1 = "ab";

//		이스케이프 문자
		String str1 = "\"안녕하세요\"?";
		String str2 = "반갑습니다.";
		String str3 = "안녕하세요?\r반갑\s습니다.";
		String str4 = "안녕하세요?\t\n반갑\s습니다.";
		
//		자동완성 : Ctr1 + space
//	    ex) syso
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	
		
		
			
		

	}

}
