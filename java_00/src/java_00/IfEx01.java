package java_00;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {

		// (예제) 입력받은 값이 홀수인지 짝수인지 판단하시오.

		Scanner sc = new Scanner(System.in);

		// 1. if
		System.out.print("입력 (if) : ");
		int input1 = sc.nextInt();

		if (input1 % 2 == 1) {
			System.out.println("홀수입니다.");
		}

		if (input1 % 2 == 0) {
			System.out.println("짝수입니다.");
		}


		// 2. if-else
		System.out.print("입력 (if-else) : ");
		int input2 = sc.nextInt();

		if (input2 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}


		// 3. if-else if
		System.out.print("입력 (if-else if) : ");
		int input3 = sc.nextInt();

		if (input3 % 2 == 1) {
			System.out.println("홀수입니다.");
		} else if (input3 % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		
		//1~12 사이의 정수를 입력 받아 해당 월의 마지막 일자 출력
		//[예시] 6월의 마지막 날은 30일 이다.
		
		
//		String month = sc.next();
//
//		switch (month) {
//		case "1" : case "3" : case "5" : case "7" : case "9" : case "12" :
//			System.out.println(month + " 월은 30일까지 있다.");
//			break;
//		case "2" :
//			System.out.println(month + " 월은 28~9일까지 있다.");
//			break;
//		case "4" : case "6" : case "8" : case "11" :
//			System.out.println(month + " 월은 31일까지 있다.");
//			break;
//		default : 
//			System.out.println("달(월)은 1~12월까지만 있다.");
//		}

	int month = 3;
		//같은 문제의 if문 
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month + "월은 31일까지 있습니다.");
		}else if (month == 2) {
			System.out.println(month + "월은 28~29일까지 있습니다.");
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(month + "월은 30일까지 있습니다.");
		}else {
			System.out.println("달(월)은 1월~12월까지만 있다.");
		}
		
sc.close();
	}

}