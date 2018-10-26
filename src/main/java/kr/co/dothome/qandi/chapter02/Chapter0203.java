package kr.co.dothome.qandi.chapter02;

public class Chapter0203 {

	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-03	단항 연상자
		 *  
		 *  단항연산자 : 피 연산자가 하나인 연잔자
		 *               ex) 부호 연산자(+,-), 증감 연산자(++,--), 논리 부정 연산자(!), 비트 반전 연산자(~)	
		 * 
		 --------------------------------------------------------------------------------------------*/
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-03-01		부호 연산자(+,-)
		 * 
		 *  부호 연산자 : 양수,음수를 표시하는 +,-
		 *  boolean 타입과 char타입을 제외ㅏㄴ 나머지 기본타입에 사용 가능
		 ---------------------------------------------------------------------------------------------*/
		
		//+,- 피연산자앞에붙여 사용
		int i1 = +100;
		int i2 = -100;
		double d1 = +3.14;
		double d2 = -3.14;
		
		//변수 앞에 '-' 붙이면 음수 양수 반전
		int a = -100;
		int result1 = +a; //-100
		int result2 = -a; //+100
		
		//부호 연산자의 산출타입은 int 
		short s = 100;
		//short sResult = -s;// 컴파일 에러
		int sResult = -s; // int 타입 또는 캐스팅 해야함

		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-03-02		증감 연산자(++,--)
		 * 
		 *  증감 연산자 : 변수의 값을 1 증가 시키거나 1감소시킴
		 *  boolean 타입을 제외한 나머지 기본타입에 사용 가능
		 *  
		 *  연산자			설명
		 *  ++피연산자		다른 연산을 수행하기 전에 피연잔사의 값을 1증가시킴
		 *  --피연산자		다른 연산을 수행하기 전에 피연산자의 값을 1감소시킴		
		 *  피연산자++		다른 연산을 수행한 후에 피연산자의 값을 1증가시킴
		 *  피연산자--		다른 연산을 수행한 후에 피연산자의 값을 1감소시킴
		 ---------------------------------------------------------------------------------------------*/
		int x = 1;
		int y = 1;
		
		int resultX = ++x + 10; //12 증감연산자가 앞에 있으므로 1 증가한후 10을 더함
		int resultY = x++ + 10; //11 증감연산자가 뒤에 있으므로 10을 더한후 1을증가
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-03-03		논리 부정 연산자(!)
		 * 
		 * 	논리부정 연산자 : boolean 타입의 값을 반전(true->flase, flase-> true)
		 *  토글(toggle) 기능을 구현할때 주로 사용
		 ---------------------------------------------------------------------------------------------*/
		boolean play = true;
		System.out.println(play); //true
		
		play = !play;
		System.out.println(play); //false
		
		play = !play;
		System.out.println(play); //true
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter02-03-04		비트 반전 연산자(~)
		 *
		 *  비트반전연산자 : 정수타입(byte,short,int,long)의 피 연산자에서만 사용가능
		 *                   피 연산자를 2진수로 표현했을 때 비트닶인 0을 1로 1을 0으로 반전한다.
		 *                   연산 후 부호비트인 최상위 비트를 포함 모든 비트가 반전되기 때문에 부호가 반대인 새로운 값이 산출
		 *                   피 연산자는 연산을 수행하기전에 int 타입으로 변환되고 비트반전이 일어남
		 ---------------------------------------------------------------------------------------------*/
		
		 int v1 = 10;
		 int v2 = ~v1;
		 int v3 = ~v1+1;
		 
		 
		 System.out.println(toBinaryString(v1)+" (십진수 : "+v1+") "); // 출력값 00000000000000000000000000001010 (십진수 : 10) 
		 System.out.println(toBinaryString(v2)+" (십진수 : "+v2+") "); // 출력값 11111111111111111111111111110101 (십진수 : -11) 
		 System.out.println(toBinaryString(v3)+" (십진수 : "+v3+") "); // 출력값 11111111111111111111111111110110 (십진수 : -10) 
		 System.out.println();
		 
		 int v4 = -10;
		 int v5 = ~v4;
		 int v6 = ~v4+1;
		
		 System.out.println(toBinaryString(v4)+" (십진수 : "+v4+") "); // 출력값 11111111111111111111111111110110 (십진수 : -10) 
		 System.out.println(toBinaryString(v5)+" (십진수 : "+v5+") "); // 출력값 00000000000000000000000000001001 (십진수 : 9) 
		 System.out.println(toBinaryString(v6)+" (십진수 : "+v6+") "); // 출력값 00000000000000000000000000001010 (십진수 : 10) 
		
	}
	
	public static String toBinaryString(int value) {
		// 비트 표현 메서드
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0"+str;
		}
		return str;
	}
}
