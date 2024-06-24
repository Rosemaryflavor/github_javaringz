package java_00;

import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {

		// -----------------------------------------------------
		// 학생의 성적을 Scanner로 입력받아, 학점을 출력하세요.
		//
		// 90점 이상이면, A
		// 80점 이상이면, B
		// 70점 이상이면, C
		// 60점 이상이면, D
		// 60점 미만이면, F
		// -----------------------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int score = sc.nextInt();

		String result = "";

		if (score >= 90) {
			result = "A";
		}else if (score >=80) {
			result = "B";
		}else if (score >=70) {
			result = "C";
		}else if (score < 60) {
			result = "F";
		}

		System.out.println("당신의 점수는" + score + "점이고, 학점은"+ result +"입니다.");


		// -----------------------------------------------------
		// Scanner를 통해 1부터 5까지의 숫자를 입력 받아 영문으로 변환
		// 
		// [ 결과 예시 ] 1 은 one 입니다.
		// -----------------------------------------------------



		int number = sc.nextInt();
		String english = "";
		if (number == 1) {
			english = "one";
		}else if (number > 2) {
			english = "two";
		}else if (number >3) {
			english = "three";
		}else if (number > 4) {
			english = "four";
		}else if (number > 5) {
			english = "five";
		}
		System.out.println(number + "는" + english + "입니다.");



		System.out.println("성별을 입력하세요. (m / M / f / F / + / - )");
		System.out.println(" >> ");

		String gender = sc.next();

		switch (gender) {
		case "m" : case "M" : case "+" :
			System.out.println("남성입니다.");
			break;
		case "f" : case "F" : case "-":
			System.out.println("여성입니다.");
			break;
		default : 
			System.out.println("잘못된 입력입니다.");
		}
		
		
	}
}