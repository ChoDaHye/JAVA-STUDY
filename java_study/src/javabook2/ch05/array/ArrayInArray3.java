package javabook2.ch05.array;

public class ArrayInArray3 {

	public static void main(String[] args) {
		// [문제] : 다차원 배열을 선언하세요.
		
		// 2차원 배열 선언
		String[][] num = {
				{"하나", "둘", "셋" },
				{"넷", "다섯", "여섯"},
				{"일곱","여덟","아홉"}
		};
		
//		[문제]1차원 배열 선언하시오.(new 연산자 사용)
		String[] car = new String[2];
		car[0] = "제네시스";
		car[1] = "벤츠";

		
//		[문제]2차원 배열에 할당된 데이터를 출력하시오.(for문 사용)
		
		for(int i= 0; i< car.length; i++) {
			System.out.println("자동차 이름: " + car[i]);
		}
		
	}

}
