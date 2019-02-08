package kr.co.dothome.qandi.chapter03;

public class Chapter0301 {
	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01	조건문(if문, switch문)
	 --------------------------------------------------------------------------------------------*/
		
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01-01		if문
		 * 	
		 * 	if문은 조건식의 결과에 따라 블록실행여부가 결정됨
		 * 
		 * 		if(조건식){
		 * 			true일 경우 실행	
		 * 		}
		 * 		false일 경우 빠져나감
		 *  
		 *  조건식에는 true 또는 false 값을 산출할 수 있는 연산식이나 boolean 변수가 올수 있음
		 *  조건식 결과가 true일경우 메소드블록{} 안의 연산을 실행
	 	--------------------------------------------------------------------------------------------*/
		
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}	
		if(score<90) {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");
		}	
		// 출력결과 "점수가 90보다 큽니다"
		//			"등급은 A 입니다"
		
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01-02		if-else문
		 * 	
		 * 	else는 조건식이 false인 경우에 연산실행
		 * 
		 * 		if(조건식){
		 * 			true일 경우 실행	
		 * 		}else{
		 * 			false일 경우 실행
		 * 		}
	 	--------------------------------------------------------------------------------------------*/
		
		int score2 = 85;
		
		if(score2>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}else {
			System.out.println("점수가 90보다 작습니다");
			System.out.println("등급은 B 입니다");
		}	
		// 출력결과 "점수가 90보다 큽니다"
		//			"등급은 B 입니다"
		
		
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01-03		if-else if-else문
		 * 	
		 * 	else if는 if(조건식)이 false일 경우 다음 조건식을 비교하도록 한다
		 * 
		 * 		if(조건식){
		 * 			true일 경우 실행	
		 * 		}else if(조건식){
		 * 			위의 조건식이 false일 경우 조건 탐색 -> 조건식이 true일 경우 연산 실행
		 * 		}else{
		 * 			위의 모든 조건식이 false 일경우 연산실행
		 * 		}
		 * 	
		 * 	else if의 갯수는 제한이 없다
	 	--------------------------------------------------------------------------------------------*/
		
		int score3 = 75;
		
		if(score3 >=90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A 입니다");
		}else if(score3 >=80){
			System.out.println("점수가 89~80입니다");
			System.out.println("등급은 B 입니다");
		}else if(score3 >=70){
			System.out.println("점수가 79~70입니다");
			System.out.println("등급은 C 입니다");
		}else {
			System.out.println("점수가 70미만 입니다");
			System.out.println("등급은 D 입니다");
		}
		
		// 출력결과 "점수가 79~70입니다"
		//			"등급은 C 입니다"

		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01-04		중첩 if문
		 * 	
		 * 		if문 내부에 또 다른 if문 사용
		 * 		외부 if문이 true일 경우 내부의 if문 조건 검색 true일 경우 실행
		 * 
		 * 		if(조건식){
		 * 			true일 경우 조건 내부 if문 실행	
		 * 			if(조건식){
		 * 				내부조건식이 true일 경우 연산실행
		 * 			}else{
		 * 				내부조건식이 false일 경우 연산실행
		 * 			}
		 * 		}else{
		 * 			외부 조건식이 false 일경우 연산실행
		 * 		}
	 	--------------------------------------------------------------------------------------------*/
		
		int score4 = (int)(Math.random()*20)+81;
		System.out.println("점수 : "+score4);
		
		String grade;
		
		if(score4>=90) {
			if(score4 >= 95) {				
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score4 >= 85)
				grade = "B+";
			else
				grade = "B";
		}
		
		System.out.println("학점 : "+ grade);
		
		/*---------------------------------------------------------------------------------------------
		 * 	Chapter03-01-05		중첩 switch문
		 * 	
		 * 	if문과 같은 조건 제어문
		 *  switch문은 if문처럼 조건식이 true일 경우 블록 내부의 실행문을 실행하는 것이 아니라,
		 *  변수가 어떤값을 같느냐에 따라 실행문이 선택된다. 
		 *  if문의 조건식의 결과가 true,false 두 가지밖에 없기 때문에 경우의 수가 많아질수록 else-if를 반복적으로 추가해야 하므로 코드가 복잡해짐.
		 *  switch문은 변수의 값에 따라서 실행문이 결정되기 때문에 간결
		 *  
		 *  switch(변수){
		 *  	case 값1:
		 *  		값1일때 실행
		 *  		break;
		 *  	case 값2:
		 *  		값2일때 실행
		 *  		break;
		 *  	default:
		 *  		기본 조건 case문에 모두 아닐때(== else)
		 *  }
		 *  
		 *  switch문은 괄호 안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행
		 *  만약 괄호안의 값과 동일한 값을 갖는 case가 없으면 default로 가서 실행문 실행
		 *  default는 생략가능
	 	--------------------------------------------------------------------------------------------*/
		
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}
		/*
		 * case 끝에 break가 붙어 있는 이유는 다음 case를 실행하지 말고 switch문을 빠져나가기 위해서이다.
		 * break가 없다면 다음 case가 연달아 실행
		 */
		
		//break문이 없는 case
		
		int time = (int)(Math.random()*4)+8;
		System.out.printf("\n현재시간 %d시\n",time);
		
		switch(time) {
		case 8:
			System.out.println("출근 합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		};
		
		/**
		 * char타입의 변수도 switch문에 사용될 수 있다.
		 */
		char grade2 = 'B';
		
		switch(grade2) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		};
		
		/**
		 * 자바 6까지는 switch문의 괄호에 정수타입(byte,char,short,int,long) 변수나 정수값을 산출하는 연산식만올수 있었다.
		 * 자바 7부터는 String 타입의 변수도 올수 있다.
		 */
		
		String position = "과장";
		
		switch(position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
		};
		
	}//end main
}
