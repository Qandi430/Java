package kr.co.dothome.qandi.chapter04;

import java.util.Calendar;

public class Chapter0407 {
	public static void main(String[] args) {
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-07	열거 타입
		 * 
		 * 	데이터 중에는 몇 가지로 한번된 값만을 갖는 경우가 흔히 있다.
		 * 	ex) 요일 = 월, 화, 수, 목, 금, 토, 일	계절 = 봄, 여름, 가을, 겨울
		 * 	이와 같이 한정된 값만을 갖는 데이터 타입이 열거 타입(enumeration type)이다.
		 * 	열거 타입은 몇 개의 열거 상수(enumeration constant)중에서 하나의 상수를 저장하는 데이터 타입이다.
		 ----------------------------------------------------------------------------------------*/
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-07-01		열거 타입 선언
		 * 
		 * 	열거 타입을 선언하기 위해서는 먼저 열거 타입의 이름을 정하고 열거 타입 이름으로 소스 파일(.java)을 생성해야 한다.
		 * 	열거 타입의 이름은 관례적으로 첫 문자를 대문자로 하고 나머지는 소문자로 구성한다.
		 * 	만약 여러 단어로 구성된 이름이라면 단어 첫 문자는 대문자로 하는 것이 관례이다,
		 * 	ex) Week.java	MemberGrade.java	ProductKind.java
		 * 	
		 * 	소스 파일의 내용으로는 다음과 같이 열거 타입 선언이 온다 public enum 키워드는 열거타입을 선언하기 위한 키워드 이다.
		 * 	반드시 소문자로 작성해야한다. 열거타입 이름은 소스 파일명과 대소문자가 모두 일치해야한다.
		 * 	ex) public enum 열거타입이름{...} 
		 * 	
		 * 	열거 타입을 선언했다면 이제는 열거 상수를 선언하면된다.
		 * 	열거 상수는 열거 타입의 값으로 사용되는데, 관례적으로 열거상수는 모두 대문자로 작성한다.
		 * 	ex) public enum Week{ MONDAY, TUESDAY, WEDNESDAY, WHURSDAY, FRIDAY, ...}
		 * 
		 * 	만약 열거 상수가 여러 단어로 구성될 경우에는 단어 사이를 밑줄(_)로 연결하는 것이 관례이다.
		 * 	ex) public enum LongResult{ LOGIN_SUCCESS, LOGIN_FAILED}
		 * 
		 ----------------------------------------------------------------------------------------*/
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-07-02		열거 타입 변수
		 * 
		 * 	열거 타입을 선언했다면 이제 열거 타입을 사용할 수 있다. 열거 타입도 하나의 데이터 타입이므로 변수를 선언하고 사용해야 한다.
		 * 	열거타입 변수;
		 * 	ex) Week today;		Week reservationDay;
		 * 	
		 * 	열거 타입 변수를 선언했다면 다음과 같이 열거 상수를 저장할 수 있다. 열거는 단독으로 사용할 수는 없고 반드시 열거타입.열거상수로 사용된다.
		 * 	열겨타입 변수 = 열거타입.열거상수;
		 * 	ex) Week today = Week.MONDAY;
		 * 
		 *  열거 타입 변수는 null값을 저장할 수 있는데 열거타입도 참조 타입이기 때문이다.
		 *  ex) Week birthDay = null;
		 *  
		 *  열거 상수는 열거객체로 생성된다. 열거타입 Week의 경우 MONDAY부터 SUNDAY까지의 총 7개의 Week객체로 생성된다.
		 *  그리고 메서드 영역에 생성된 열거 상수가 해당 Week객체를 각각 참조하게된다.
		 *  
		 *  Week today = Week.SUNDAY
		 *  열거 타입변수 today는 스택영역에 생성된다. today에 저장되는 값은 Week.SUNDAY 열거 상수가 ㅊ참조하는 객체의 번지이다. 
		 *  따라서 Week.SUNDAY와 today변수는 서로 같은 Week를 참조하게 된다.
		 *  그렇기 때문에 today변수와 Week.SUNDAY 상수의 == 연산결과는 true가 된다.
		 ----------------------------------------------------------------------------------------*/
		/*
		 * 자바는 컴퓨터의 날짜 및 요일, 시간을 프로그램에서 사용할 수 있도록 하기 위해 Date, Calendear, LocalDateTime등의 클래스를 제겅한다.
		 * LocalDateTime은 자바 8부터 지원하는 API이다. 이전 버전과의 호환성을 위해 Calender를 이용해서 날짜와 시간을 얻는 방법을 알아보자.
		 * 우선 Calendar변수를 선언하고 Calndar.getInstance() 메소드가 리턴하는 Calendar 객체를 얻는다.
		 */
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);			//년
		int month = now.get(Calendar.MONTH)+1;		//월(1~12)	//0부터 리턴하므로 +1을 해줌
		int day = now.get(Calendar.DAY_OF_MONTH);	//일
		int week = now.get(Calendar.DAY_OF_WEEK);	//요일(1~7)	//일요일부터시작 
		int hour = now.get(Calendar.HOUR);			//시간
		int minute = now.get(Calendar.MINUTE);		//분
		int second = now.get(Calendar.SECOND);		//초
		
		System.out.printf("\n%d년 %d월 %d일 %d번째 요일 %d시 %d분 %d초\n",year, month,day,week,hour,minute,second);
		
		
		//열거 타입과 열거 상수
		
		Week today = null;		//열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();		//Calendar객체 얻음
		week = cal.get(Calendar.DAY_OF_WEEK);		//일(1) ~ 토(7)까지의 숫자를 리턴
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
			
		}
		
		System.out.println("오늘 요일 : "+today);
		
		if(today == Week.SUNDAY)
			System.out.println("일요일에는 축구를 합니다.");
		else
			System.out.println("열심히 자바 공부를 합니다.");
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-07-03		열거 객체의 메서드
		 * 
		 * 	열거 객체는 열거 상수의 문자열을 내부 데이터로 가지고 있다.
		 * 	열겨 객체의 메소드는 java.lang.Enum 클래스에 선언된 메소드인데, 
		 * 	열거 객체에서 사용할 수 있는 이유는 ㅁ도은 열거 타입은 컴파일 시에 Enum클래스를 상속하게 되어있기 때문이다.
		 * 
		 * 	리턴타입		메소드(매개변수)		설명
		 * 	------------------------------------------------------------------------------
		 * 	String			name()					열거 객체의 문자열을 리턴
		 * 	int				ordinal()				열거 객체의 순번(0부터 시작)을 리턴
		 * 	int				compareTo()				열거 객체를 비교해서 순번 차이를 리턴
		 * 	열거타입		valueOf(String name)	주어진 문자열의 열거 객체를 리턴
		 * 	열거배열		values()				모든 열거 객체드를 배열로 리턴
		 * 	------------------------------------------------------------------------------
		 ----------------------------------------------------------------------------------------*/
		
		/*
		 * 	name() 메서드
		 * 
		 * 	name()메서드는 열거 객체가 가지고 있는 문자열을 리턴한다. 
		 * 	이때 리턴되는 문자열은 열거타입을 정의할 때 사용한 상수 이름과 동일하다.
		 * 	
		 */
		Week today2 = Week.SUNDAY;
		String name = today2.name();
		System.out.println(name);		//SUNDAY
		
		/*
		 * 	ordinal() 메서드
		 * 
		 * 	ordinal() 메소드는 전체 열거 객체중 몇 번째 열거 객체인지 알려준다. 
		 * 	열거 객체의 순번은 열거 타입을 정의할 때 주어진 순번을 말 하는데, 0부터 시작한다.
		 *	 	 
		 */
		int ordinal = today2.ordinal();
		System.out.println(ordinal);		//6
		
		/*
		 * 	compareTo() 메서드
		 * 
		 *	compareTo() 메소드는 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지를 비교한다.
		 *	만약 열거 객체가 매개값의 열거 객체보다 순번이 빠르다면 음수가, 순번이 늦다면 양수가 리턴된다.
		 *		 	 
		 */
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println("result1 : "+result1+", result2 : "+result2);		//result1 = -2, result2 = 2
		
		//day1.compareTo(day2)는 day2를 기준으로 day1의 상대적 위치를 리턴한다. 
		//day1(순번:0)이 day2(순번2)보다 앞에 이위치하고 순번차이가 2이므로 result1은 음수 -2가 저장된다.
		
		/*
		 * 	valueOf() 메서드
		 * 
		 *	valueOf() 메소드는 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다. 
		 *	이 메소드는 외부로부터 문자열을 입력받아 열거 객체로 변환할 때 유용하게 사용할 수 있다.
		 *		 	 
		 */
		
		Week weekDay = Week.valueOf("SATURDAY");		//weekDay 변수는 Week.SATURDAY를 참조하게 된다.
		System.out.println(weekDay);		
		
		
		/*
		 * 	values() 메서드
		 * 
		 *	values() 메소드는 열거 타입의 모든 열겨 객체들을 배열로 만들어 리턴한다.	 	 
		 */
		
		Week[] days = Week.values();
		for(Week d : days) {
			System.out.println(d);
		}
		
	}
}
