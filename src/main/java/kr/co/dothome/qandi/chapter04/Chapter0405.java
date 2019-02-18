package kr.co.dothome.qandi.chapter04;

public class Chapter0405 {
	public static void main(String[] args) {
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-05	String타입
		 * 	
		 * 	자바는 문자열을 String변수에 저장하기 때문에 다음과 같이 String 변수를 우선 선언해야한다.
		 * 	String 변수;
		 * 	String 변수에 문자열을 저장하려면 큰 따옴표로 감싼 문자열 리터럴을 대입하면된다,
		 * 	변수 = "문자열";
		 * 	변수 선언과 동시에 문자열을 저장할 수도 있다.
		 * 	String 변수 = "문자열";
	 	----------------------------------------------------------------------------------------*/		
		
		String name;
		name = "신용권";
		String hobby = "자바";
		
		/*-------------------------------------------------------------------------------------------
		 * 	문자열이 직접 변수에 저장되는 것이 아니라, 문자열은 String 객체로 생성되고 변수는 String 객체를 참조
		 *	name 변수와 hobby변수는 스택 영역에 생성되고, 문자열 리터럴인 "신용권"과 "자바"는 힙 영역에 String 객체로 생성
		 *	그리고 name 변수와 hobby 변수에는 String 객체의 주소 값이 저장된다.
		 *
		 * 	자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어있다.
		 -------------------------------------------------------------------------------------------*/
		
		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1==name2);		//true
		
		/*-------------------------------------------------------------------------------------------
		 * 	일반적으로 변수에 문자열을 저장할 경우에는 문자열 리터럴을 사용하지만, 
		 * 	new 연산자를 사용해서 직접 String 객체를 생성시킬 수도 있다.
		 * 	new 연산자는 힙 영역에 새로운 객체를 만들 때 사용하는 연산자로 객체 생성 연산자라고 한다.
		 -------------------------------------------------------------------------------------------*/
		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		System.out.println(name3==name4);	//false 다른 객체 참조
		
		//객체와 상관없이 문자열만 검사할경우 String 객체의 equals() 메서드를 사용해야한다.
		
		System.out.println(name3.equals(name4));	// true 문자열 비교시 같을경우
		
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
		
		//String 변수는 참조 타입이므로 초기값으로 null을 대입할수 있다.
		//null은 String 변수가 참조하는 String 객체가 없다는 뜻이다.
		String strVar5 = null;
		//변수가 String객체를 참조하였으나, null을 대입 함으로써 더 이상 String객체를 참조하지 않도록 할수도 있다.
		String strVar6 = "여행";
		strVar6 = null;
		//참조를 잃은 String 객체는 쓰레기 객체로 취급하고 쓰레기 수집기(Garbage Collector)를 구동시켜 메모리에서 자동 제거한다.
	}
	
}
