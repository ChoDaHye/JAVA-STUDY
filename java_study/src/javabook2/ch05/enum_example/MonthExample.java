package javabook2.ch05.enum_example;

import java.util.Scanner;

public class MonthExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 숫자로 입력하세요: ");
		int month = sc.nextInt();
//		System.out.println(month);
		
		  switch(month) {
	         case 1:
	            System.out.println("1월: HTML");
	            break;
	         case 2:
	            System.out.println("2월: JSP");
	            break;
	         case 3:
	            System.out.println("3월: 스마트팩토리");
	            break;
	         case 4:
	            System.out.println("4월: SPRING");
	            break;
	         case 11:
	            System.out.println("11월: DB");
	            break;
	         case 12:
	            System.out.println("12월: JAVA");
	            break;
	      }
	
//		  변수 선언 
//		  타입 변수명;
	      int a = 2;
	      System.out.println(a);
	      
	      Month m1 = Month.JAN;
	      Month m2 = Month.DEC;
//	      System.out.println(m1);
	      
	      // [문제] : 해당 월에 해야할 일을 스케쥴링하는 프로그램을 작성하라.
	      // 11월: DB
	      // 12월: JAVA
	      // 1월: HTML
	      // 2월: JSP
	      // 3월: 스마트팩토리
	      // 4월: SPRING
	      
	      Month present = Month.DEC;
	      Month afterDec = Month.JAN;
	      
	      // 분기문
	      switch(afterDec) {
	         case JAN:
	            System.out.println("1월: HTML");
	            break;
	         case FEB:
	            System.out.println("2월: JSP");
	            break;
	         case MAR:
	            System.out.println("3월: 스마트팩토리");
	            break;
	         case APR:
	            System.out.println("4월: SPRING");
	            break;
	         case NOV:
	            System.out.println("11월: DB");
	            break;
	         case DEC:
	            System.out.println("12월: JAVA");
	            break;
	      }
	      
	      sc.close();

	}

}
