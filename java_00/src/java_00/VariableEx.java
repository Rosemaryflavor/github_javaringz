package java_00;

public class VariableEx {
	
	public static void main(String[] args) {
		
		int varNum = 5;
		int varString = 5;
		
	int varNum1 = 5;
		
		int varNumber = 0;
		int varNumber1 = 100; 
		
	int varNumResult;
	varNumResult = varNum1 + varNumber1;
	
	System.out.println("숫자 변수 1 [ "
			+ varNum + " ] 입니다.");
	System.out.print("숫자 변수 2 [ " + varNum + " ] 입니다.");
	System.out.println(varNumResult);
	
//	System.out.println("숫자 1과 숫자 2를 더하면 ? [ " + varNum + varNumber + " ];)
//	System.out.println("숫자1과 숫자2를 더하면 ? [ " + (varNum + varNumber) + " ];)

	int num1 = 10;
	int num2 = 20;
	
	int numResult = 0;
	
	System.out.println(" === 숫자 바꾸기 전 === ");
	System.out.println("숫자 1 [ " + num1 + " ] ");
	System.out.println("숫자 2 [ " + num2 + " ] ");
	System.out.println("더한 값 [ " + numResult + " ]");
	
	numResult = num1;
	num1 = num2;
	num2 = numResult;
	
	System.out.println("숫자 1 [ " + num1 + " ] ");
	System.out.println("숫자 2 [ " + num2 + " ] ");
	
	int var1 = 10;
	int var2 = 20;
	int var3 = 30;
	
	int varTemp;
	
	varTemp= var1;
	var1 = var2;
	var2 = var3;
	var3 = varTemp;
	
	System.out.println(" === 숫자 바꾸기 후 === ");
	System.out.println("숫자 1 [ " + var1 + " ] ");
	System.out.println("숫자 2 [ " + var2 + " ] ");
	System.out.println("숫자 3 [ " + var3 + " ] ");
	
	//년도와 나이 계산
	int curYear = 2024;
	int varNum4 = 1;
    
    int yearResult;
    
    int curAge = 28;
    
    int ageResult;
    
    ageResult = curAge + varNum;
    yearResult = curYear + varNum;
    
    System.out.println("올해는 [ " + curYear + " ] 년도 입니다.");
    System.out.println("올해는 [ " + yearResult + " ] 년도 입니다."); 
    System.out.println("올해 내 나이는 [ " + curAge + " ] 세 입니다.");
    
    yearResult = yearResult + varNum;
    
    System.out.println("올해는 [ " + curYear + " ] 년도 입니다.");
    
    		
    		
    		
    		}
}