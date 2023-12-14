package ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		
//		while 문법
//		변수 초기화
//		while(조건식) {
//			실행문
//		}
//		
//		int i = 0;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//		}
//		=======================================
		
//		[문제] 항상 반복하도록 만들어라
//		int i = 0;	// 1 2 3 ... 9 10
		
		int num = 10;
		while(true) {
			System.out.println(num); // 0 1 ... 9
			num++;
//		만약, num가 10이 되면 반복문을 빠져나오게 하고 싶다.
			if(num == 10) {
				break;
			}
			num ++;
		}
			
		
		
////	for문 문법
//		for(초기화식; 조건식; 증감식) {
//			실행문
//		}
//		for(int i = 0; i <10; i++) {
//			System.out.println(i);
//		}
//		
//		=======================================
	}

}
