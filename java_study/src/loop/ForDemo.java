package loop;

public class ForDemo {

	public static void main(String[] args) {
		// 문제: 다음과 같이 출력되는 프로그램을 작성 하시오.(for문 사용)
		//출력 결과 :
//		Codimg Everybody 3
//		Codimg Everybody 6
//		Codimg Everybody 9
//		Codimg Everybody 12
		
		

//		방법 1
		for(int i = 1; i <5; i ++) {
			System.out.println("Coding Everybody" + " " + 3*i);
		}
		
//		방법2
		for(int i=1; i<14; i++) {
	         if(i%3==0) {
	            System.out.println("Coding Everybody " + i);
	         }
	      }

//		방법3
		// 횟수 반복 사용 4번
		// 증감식: i = i + 3;	
		for(int i = 3; i < 13; i =i + 3) {
			System.out.print("Coding Everybody ");
			System.out.println(i);
		}
	}

}
