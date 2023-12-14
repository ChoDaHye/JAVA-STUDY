package javabook2.ch02;

public class OperationsPromotion {

	public static void main(String[] args) {
		// 자동형변환 연산
//		1. 정수 연산의 경우, int 타입으로 수행
		int intval1 = 10;
		byte byteval1 = 5;
		
//		(int) = (int) + (byte)
//		int result1 = intval1 + byteval1;
		byte result1 = (byte)(intval1 + byteval1);
//		(int) = (int) + (int)
		System.out.println(result1);
		
		System.out.println("====================================");
		
//		2. 같은 타입의 피연산자 간에만 연산 가능
//		- 만약, 서로 다른 타입 피연산자 간에 연산 수행 시, 큰 타입으로 자동변환
		int intval2 = 10;
		double doubleval = 5.5;
		
//		(double) = (int) + (double)
//		double result2 = intval2 + doubleval;
//		(double) = (double) + (double)
		double result2 = intval2 + doubleval;
		System.out.println(result2);
		

	}

}
