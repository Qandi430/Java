package kr.co.dothome.qandi.chapter01;
/**
 * chapter 01 변수와 타입 
 *         - 01 변수
 *           - 변수란 하나의 값을 지정할수 있는 메모리 공간
 *           
 *           *변수의 선언 
 *             = 타입 변수이름
 *           
 *           작성 규칙
 *            - 첫 번재 글자는 문자이거나 '$','_' 이어야 하고 숫자로 시작 할 수 없다.
 *            - 영어 대소문자가 구분된다(필수)
 *            - 첫 문자는 영어 소문자로 시작하되 다른 단어가 붙을 경우 첫 문자를 대문자로 한다.(관례)
 *            - 문자 수(길이)의 제한은 없다.
 *            - 자바 예약어는 사용 할 수 없다.(필수)
 *            
 *           자바 예약어
 *            1. 기본데이터 타입 : boolean, byte, char, short, int, long, float, double
 *            2. 접근 지정자 : private, protected, public
 *            3. 클래스와 관련된 것 : class, abstract, interface, extends, implements, enum
 *            4. 객체와 관련된 것 : new, instanceoof, this, super, null
 *            5. 메소드와 관련된 것 : void, return
 *            6. 제어문과 관련된 것 : if, else, switch, case, default, for, do, while, break, continue
 *            7. 논리값 : true, false
 *            9. 예외 처리와 관련된 것 : try, catch, finally, throw, throws
 *            10. 기타 : transient, volatile, package, import, synchronized, native,final, static, strictfp, assert
 *           
 *           
 *          
 * @author Qandi
 *
 */
public class Test01 {

	public static void main(String[] args) {
		
		//변수의 사용
		
		int score; // 타입 변수명 으로 선언
		score = 90; // 변수명 = 값으로 저장
		
		int scores = 90; // 타입 변수명 = 값으로 선언과 동시에 저장 가능
		
		/*----------------------------------------------------------------------------------------------
			리터럴 = 소스코드 내에서 직접 입력된값
			
			정수 리터럴 - 소수점이 없는 정수 리터럴은 10진수로 간주 : 0, 75, 100 ...
			              0으로 시작되는 리터럴은 8진수로 간주 : 02, -04...
			              0x 또는 0X 로 시작하고 0~9 숫자나 A,B,C~F 또는 a,b,c~f 로구성된 리터럴은 16진수로 간주 : 0x5, 0xA, 0xB3, 0xAC09...
			              정수리터럴을 저장할수 있는 타입 : byte, char, short, int, long
			
			실수 리터럴 - 소수점이 있는 리터럴은 10진수 실수로 간주 : 0.25, -3.14...
			            - 대문자 E 또는 소문자 e 가있는 리터럴은 10진수 지수와 가수로 간주 : 5E4(5x10⁴), 0.12E-4(0.12 x 10-⁴)
			            - 실수 리터럴을 저장할 수 있는 타입 : float, double
			
			문자 리터럴 - 작은 따옴표(')로 묶은 텍스트는 하나의 문자리터럴로 간주 : 'A','한','\t','\n'...
			            - 문자 리터럴을 저장 할 수 있는타입 : char
			            
			문자열 리터럴 - 큰 따옴표(")로 묶은 텍스트로 간주 : "대한 민국", "탭 만큼 이동 \t 합니다", "한줄 내려쓰기 합니다"..
			              - 문자열 리터럴을 저장 할 수있는 타입 : String
			
			이스케이프 문자 - 역슬래쉬(\) 가 붙은문자 특수한 용도로 이용 문자 리터럴과 문자열 리터럴에 사용
			                - \t : 수평탭 : 0x0009
			                - \n : 줄바꿈 : 0x000a
			                - \r : 리턴   : 0x000d
			                - \" : 큰 따옴표 : 0x0022
			                - \' : 작은 따옴표 : 0x0027
			                - \\ : 역슬래쉬(\) : 0x005c
			                - \+u 16진수 : 16진수에 해당하는 유니코드 : 0x0000~0xffff
			
			논리 리터럴 - true,false 논리타입은 boolean에 저장                
		 ----------------------------------------------------------------------------------------*/
		
		/*------------------------------------------------------
			변수 값 읽기
			변수는 초기화 되어야 읽을수 있고, 초기화되지 않은 변수는 읽을 수가 없다.
		---------------------------------------------------------*/		

		// 10을 변수 value의 초기값으로 저장
		int value = 10;
		
		// 변수 value 값을 읽고 10을 더하는 산술연산을 수행
		// 연산 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		// 변수 result값을 읽고 콘솔에 출력
		System.out.println(result);
		// 결과 값  = 20
		
		/*--------------------------------------------------------------
		 	변수의 사용 범위
		 	변수는 {} 중괄호 내에서 선언되고 사용가능
		 	클래스,생성자, 메서드 등 (메서드 내에서 사용된 변수는 로컬변수(Local Variable)이라고 부른다.)
		 	변수는 생성된 블럭 내에서만 사용 가능
		 ----------------------------------------------------------------*/
		
		int v1 = 15;
		if(v1 > 10) {
			int v2 = v1-10;
		}
		//int v3 = v1 + v2+5; //v2 변수를 사용할수 없어 컴파일 에러 발생(제어문(if) 안에서 선언되었기 때문)
	}
}
