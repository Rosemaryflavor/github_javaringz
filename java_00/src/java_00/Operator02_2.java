package java_00;

public class Operator02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = 50;
		int c = 1;
		
// 1. a가 b보다 큰가? o
	System.out.println(a > b);
// 2. b가 c보다 크거나 같은가? o
	System.out.println(b >= c);
// 3. a가 c보다 작은가? x
	System.out.println(a < c);
// 4. a가 b보다 작거나 같은가? x
	System.out.println(a == b);
// 5. a와 b가 같은가? x
	System.out.println(a = b);
// 6. a와 a가 다른가? x
	System.out.println(a != a);
// 7. b와 c가 다른가? o
	System.out.println(b != c);
		
//1. > 2. >= 3. < 4. == 5. != 6. =

// 사용자 나이 입력 - 19세 이상 통과, 미만 거절
			// true(통과), false(거절)
int age = 10;
boolean ageResult;

ageResult = age >= 19;

System.out.println("나이 :" + age);
System.out.println("결과 :" +ageResult);

// 숫자 입력 - 짝수인지, 아닌지를 판단
int var = 10;


	}

}
