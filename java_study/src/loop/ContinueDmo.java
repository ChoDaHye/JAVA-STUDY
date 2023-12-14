package loop;

public class ContinueDmo {

	public static void main(String[] args) {
//		[문제] 다음과 같이 출력되도록 프로그램을 작성하시오
//		출력결과:
//		Coding Everybody 0
//		Coding Everybody 1
//		Coding Everybody 2
//		Coding Everybody 4


		for(int i = 0; i < 5; i++) {
			if(i == 3 ) {		
				continue;		
			}
		System.out.println("Coding Everybody " + i);
			
		}

	}
}
