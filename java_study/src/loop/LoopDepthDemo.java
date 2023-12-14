package loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
//		[문제] 구구단 2단을 출력하는 프로그램을 작성하시오.
		
		int i = 0;
		
		while(i < 9) {
			i++;
			System.out.println( 2 + " x " + i + " = " + 2*i);
		}

//		[문제] 구구단 전체를 출력하는 프로그램을 작성하시오.
		
		for(int j = 2; j <= 9; j++ ) {
			System.out.println("=======================");
			for(int k = 1; k <= 9; k++) {
				System.out.println(j + " x " + k + " = " + j*k );
			}
		}
		
	}

}
