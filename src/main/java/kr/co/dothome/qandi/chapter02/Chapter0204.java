package kr.co.dothome.qandi.chapter02;

public class Chapter0204 {

	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-04	이항 연상자
		 *  
		 *  이항연산자 : 피 연산자가 두개인 연잔자
		 *               ex) 산술연산자,연결연산자,대입 연산자, 비교연산자, 논리연산자 등등...
		 --------------------------------------------------------------------------------------------*/
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-04-01		산술 연산자
		 * 
		 *  산술 연산자 : 사칙여난5가지.. boolean타입을 제외한 모든 기본 타입에사용 가능
		 *  
		 *  연산자							설명
		 *  -------------------------------------------------------------------------------------------
		 *  피연산자	+	피연산자		덧셈연산
		 *  -------------------------------------------------------------------------------------------
		 *  피연산자	-	피연산자		뺄셈연산
		 *  -------------------------------------------------------------------------------------------
		 *  피연산자	*	피연산자		곱셈연산
		 *  -------------------------------------------------------------------------------------------
		 *  피연산자	/	피연산자		좌측 피연산자를 우측 피연산자로 나눗셈 연산
		 *  -------------------------------------------------------------------------------------------
		 *  피연산자	%	피연산자		좌측 피연산자를 우측 피연산자로 나눈 나머지를 구하는 연산
		 *  -------------------------------------------------------------------------------------------
		 *  
		 *  피연산자들의 타입이 다를 경우의 규칙
		 *  
		 *  1. 피연사들이 모두 정수 타입이고, int 타입(4byte)보다 크기가 작은 타입일 경우 모두 int 타입으로 변환후, 연산을 수행한다.
		 *     따라서 연살의 산출 타입은 int 이다
		 *     ex) byte + byte -> int + int = int
		 *  
		 *  2. 피연산자들이 모두 정수 타입이고 long타입이 있을경우 모두 long 타입으로 변한후 연산을 수행
		 *     연산의 산출 타입은 long타입
		 *     ex) int + long -> long + long = long
		 *   
		 *  3. 피연자중 실수 타입(float 타입, double 타입)이 있을경우, 크기가 큰 실수 타입으로 변환후 연산을 수행
		 *     연산의 산출 타입은 실수 타입
		 *     ex) int + double -> double + double = double
		 ---------------------------------------------------------------------------------------------*/
		
		 int v1 = 5;
		 int v2 = 2;
		 
		 int result = v1+v2;
		 
		 System.out.println("result :"+ result); // 출력값 = 7
		 
		 result = v1-v2;
		 System.out.println("result :"+ result); // 출력값 = 3
		 
		 result = v1*v2;
		 System.out.println("result :"+ result); // 출력값 = 10

		 result = v1/v2;
		 System.out.println("result :"+ result); // 출력값 = 2

		 result = v1%v2;
		 System.out.println("result :"+ result); // 출력값 = 1

		 double result2 = (double)v1/v2;
		 System.out.println("result :"+ result2); // 출력값 = 2.5
	}
}
