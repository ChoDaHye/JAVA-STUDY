package javabook2.ch02;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] oldInArr= {1,2,3};		// 값 목록으로 배열 생성
		int[] newInArr= new int[5];		// new 연산자 배열 생성
		
		for(int i = 0; i <newInArr.length; i++) {
			System.out.print(newInArr[i] + " ");
		} 
		System.out.println();
		
		// arrycopy(이전배열, 위치, 새배열, 위치, 복사길이)
		// oldInArr의 1개만 복사
		System.arraycopy(oldInArr, 0, newInArr, 0, 2);
		
		// 3개중 1개 빼고 복사
		System.arraycopy(oldInArr, 0, newInArr, 0, oldInArr.length-1);
		
		
		for(int i = 0; i <newInArr.length; i++) {
			System.out.print(newInArr[i] + " ");
		} 
		
		
	}

}
