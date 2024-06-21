package java_00; 

public class Operator04 {
	public static void main(String[] args) {

		/*
		 * [ 당신의 선택은? 치킨 vs 소 ]
		 * 
		 * 입력받을 변수는 1 또는 2
		 * 1번은 닭 vs 2번은 소
		 * 닭은 치킨 vs 소는 스테이크
		 * 
		 * 결과물 예시 : 가져오신 동물은 닭이므로, 치킨을(를) 요리하겠습니다.
		 * 결과물 예시 : 가져오신 동물은 소이므로, 스테이크을(를) 요리하겠습니다.
		 * 
		 */
		int age = 1;
		String ageResult = "치킨";
		ageResult = (age >= 1 && age < 2)? "치킨" : "스테이크";
		System.out.println("가져오신 동물은" + age + "이므로" + ageResult + "을 요리하겠습니다.");
		
		int age1 = 2;
		String ageResult1 = "스테이크";
		ageResult1 = (age >= 2 && age < 1)? "치킨" : "스테이크";
		System.out.println("가져오신 동물은" + age1+ "이므로" + ageResult1+ "를 요리하겠습니다.");
		
		
		
		
		/*
		 * [ 홀짝 감별기 ]
		 * 
		 * 입력받은 변수의 값이 홀이냐 짝이냐를 구분
		 *  
		 * 결과물 예시 : 입력하신 숫자 3은(는) 홀수입니다.
		 * 결과물 예시 : 입력하신 숫자 8은(는) 짝수입니다.
		 * 
		 */
         	
//		 int age = 10;
//	       String ageResult = "19";
//	       ageResult = (age >= 19 && age < 60) ? "통과" : "거절";
//	       System.out.println("회원님의 나이는" + age + "세이므로," + ageResult + "입니다.");
int number = 3;
String numberResult = "홀수";
numberResult = (number >= 3 && number < 8) ? "홀수" : "짝수";
System.out.println("입력하신 숫자" + number + "는" + numberResult + "입니다.");

int number1 = 8;
String numberResult1 = "짝수";
numberResult1 = (number1 >= 8 && number1 <3) ? "홀수":"짝수";
System.out.println("입력하신 숫자" + number1 + "은" + numberResult1 + "입니다.");


int kor = 85;
int eng = 90;
int math = 61;
int sum;
double avg;
String avgResult = "";

sum = kor + eng + math;
avg = sum / 3.0;

avgResult = (avg >= 85) ? "합격" : "불합격";

System.out.println("당신의 평균 점수는" + avg + "이고," + avgResult + "입니다.");



}
}
