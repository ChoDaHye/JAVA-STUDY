package javabook2.ch02;

public class StringToPrimary {

	public static void main(String[] args) {
		// String => int
		String str = "10";
//		int intVal3 = str +10
		int intVal = Integer.parseInt(str);
		System.out.println(intVal);
		
		int intVal2 = intVal + 10;
		System.out.println(intVal2);
		
		int month = 12;
		System.out.printf("오늘은 %d월 입니다.\n", month);
		
		double pi = 3.14;
		System.out.printf("수학기호 파이의 값은 %f 입니다.\n", pi);
		
		int date = 4;
		System.out.printf("오늘은 %d월 %d일 입니다.", month, date);
	

	}

}
