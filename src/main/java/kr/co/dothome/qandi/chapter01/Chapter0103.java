/**
 *   chapter 01 변수와 타입 
 *           03 타입 변환
 *           
 *    타입 변환 :  데이터타입을 다른 데이터 타입으로 변환하는 것       
 */
package kr.co.dothome.qandi.chapter01;

public class Chapter0103 {

	public static void main(String[] args) {
		/*--------------------------------------------------------------
		 * 		자동 타입 변환(Promotion)
		 * 		프로그램 실행 도중 자동적으로 타입 변환이일어나는 것
		 * 		작은 크기를 가지는 타입이 큰 크기를 가지는 타입에 저장될때 발생
		 * 		큰 크기 타입과 작은 크기타입의 구분은 사용하는 메모리의 크기 
		 * 		byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 * 		float가 long보다 큰이유는 표현하는 값의 범위가 float가 크기 때문
		 ----------------------------------------------------------------*/
		
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환이 일어난다.
		
		//정수타입이 실수 타입으로 변환될때는 .0 이붙으며 실수가 된다
		
		int intValue2 = 200;
		double doubleValue = intValue2; //200.0
		
		//char 타입의 경우 int타입으로 자동 변환되면 유니코드 값이 int에 저장된다.
		char charValue = 'A';
		int intValue3 = charValue; //65
		
		/*--------------------------------------------------------------
		 * 		강제 타입 변환(Casting)
		 * 
		 *      강제적으로 큰 데이터 타입을 작은 데이터 타입으로 쪼개어 저장하는 방식
		 *      캐스팅 연산자 () 를 사용하여 변환
		 *      작은 크기 타입 = (작은 크기 타입) 큰크기타입
		 *      실수 타입을 정수로 캐스팅 하면 정수 부분만 저장됨		
		 ----------------------------------------------------------------*/
		
		int intValue4 = 44032;
		char charValue2 = (char) intValue4;
		System.out.println(charValue2); // 출력값 가
		
		long longValue = 500;
		int intValue5 = (int) longValue;
		System.out.println(intValue5); // 출력값 500
		
		double doubleValue2 = 3.14;
		int intValue6 = (int) doubleValue2;
		System.out.println(intValue6); // 출력 값 3
		
		/*--------------------------------------------------------------
		 * 		연산식에서의 자동 타입 변환
		 * 		
		 *  	두 피연산자(Operand) 중 큰 데이터 타입으로 자동 변환
		 *  	꼭 작은 데이터 타입을 필요로 할때에는
		 *      큰 데이터 타입을 강제 타입 변환(casting) 후 저장한다.
		 *      자바의 정수연산일 경우 int타입을 기본으로한다 = 
		 *      크기가 4byte 보다 작은 타입(byte,char,short)은 4byte인 int 타입으로 변환된 후 연산이 수행
		 ----------------------------------------------------------------*/
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1+ byteValue2; // 컴파일 에러 int타입으로 변환후 연산수행
		int byteValue3 = byteValue1+ byteValue2;
		System.out.println(byteValue3); //출력값 30
		
		char charValue4 = 'A';
		char charValue5 = 1;
		//char charValue6 = charValue4 + charValue5; // 컴파일 에러 int타입으로 변환후 연산수행
		int charValue6 = charValue4 + charValue5;
		System.out.println(charValue6); //유니코드 출력 66
		System.out.println((char)charValue6); //문자 출력 B
		
		int intValue7 = 10;
		int intValue8 = intValue7/3;
		System.out.println(intValue8);  // 출력값3
		
		int intValue9 = 10;
		//int intValue10 = intValue9 / 4.0;// 컴파일 에러 정수를 실수로 나누었기 때문에 실수 타입
		double intValue10 = intValue9 / 4.0;
		
		System.out.println(intValue10); //출력값 2.5
		
	}
}
