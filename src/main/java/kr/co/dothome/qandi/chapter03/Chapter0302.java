package kr.co.dothome.qandi.chapter03;

import java.io.IOException;
import java.util.Scanner;

public class Chapter0302 {
	public static void main(String args[]) throws IOException {
		/*----------------------------------------------------------------------------------------
		 * 	Chapter03-02	반복문(for문, while문, do-while문)
		 * 
		 * 	반복문은 어떤 작업(코드들)이 반복적으로 실행되도록 할 때 사용되며,
		 * 	반복문의 종류로는 for문, while문, do-while문이 있다.
		 * 	for문은 반복횟수를 알고 있을 때 주로 사용
		 * 	while문은 조건에 따라 반복할 때 주로 사용
		 * 	while문과 do-while문의 차이점은 조건을 먼저 검사하느냐 나중에 검사하느냐일뿐 동작 반식은 동일
		 ----------------------------------------------------------------------------------------*/
		
		/*----------------------------------------------------------------------------------------
		 *	Chapter03-02-01		for문
		 *
		 *	프로그램을 작성하다 보면 똑같은 실행문을 반복적으로 실행해야 할 경우가 많이 발생한다.
		 *	이런경우 for문을 사용하면 코드를 획기적으로 줄여준다.
		 *
		 *	for(①초기화식; ②조건식; ④증감식){
		 *
		 *		③실행문;
		 *	
		 *	}
		 *
		 *	for문이 실행될 때 ①초기화식이 제일 먼저 실행된다. 그런다음 ②조건식을 평가해서
		 *	true일 경우 ③실행문을 실행시키고, false 이면 for문 블록을 실행시키지않고 끝나게 된다. 
		 *	블록 내부의 ③실행문들이 모두 실행되면 ④증감식을 실행시키고 다시 ②조건식을 평가한다.
		 *	평가 결과가 true일 경우 ③ -> ④ -> ②로 다시 진행, false이면 for문이 끝나게 된다.
		 ---------------------------------------------------------------------------------------*/
		
		//1~10까지 출력
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		/*
		 * 	초기화식의 역할은 조건식과 실행문, 증감식에서 사용할 변수를 초기화하는 역할을 ㅁ한다.
		 * 	초기화식이 필요없을 경우에는 생략할 수 있다.
		 */
		
		int start = 1;
		for(; start<=10; start++) {
			System.out.println(start);
		};
		
		/*
		 * 어떤 경우에는 초기화식이 둘 이상이 있을 수도 있고, 증감식도 둘 이상이 있을수 있다.
		 * 이런 경우에는 쉼표(,)로 구분해서 작성하면 된다.
		 */
		
		for(int i=0, j=100; i<=50 && j>=50; i++,j--) {
			System.out.printf("%d+%d = %d\n",i,j,i+j);
		}
		
		
		/*
		 * 	초기화식에 선언된 변수는 for문 블록 내부에서 사용되는 로컬 변수이다. 따라서 for문을 벗어나서는 사용할 수 없다.
		 * 	변수를 for문이 시작하기 전에 선언하면 for문을 끝내고 사용할소 있다.
		 */
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++)
			sum += i;
		
		System.out.println("1~100의 합 : " + sum);
		
		/*
		 * for문을 작성할 때 주의할 점은 초기화식에서 루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하지 말아야한다.
		 * 0.1은 float타입으로 정확하게 표현할수 없기 때문에 x에 더 해지는 값은 0.1보다 약간 크다.
		 */
		
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}
		
		/*
		 * 	for문은 또다른 for문을 내포할 수 있는데, 이것을 중첩된 for문이라고 한다.
		 * 	이 경우 바깥쪽 for문이 한번 실행할 때마다 중접된 for문은 지정된 횟수만큼 반복해서 돌다가 다시 바깥쪽 for문으로 돌아간다. 
		 */
		
		System.out.println("\n-----------구구단-------------\n");
		for(int i = 2; i<=9; i++) {
			System.out.printf("    %d단\n",i);
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
		System.out.println("--------------끝-----------------");
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter03-02-02		while문
		 * 	
		 * 	while문은 조건식이 true일 경우에 계속 반복한다.
		 * 	조건식에는 비교 또는 논리 연산식이 주로 오는데, 조건식이 false가 되면 반복행위를 멈추고
		 * 	while문을 종료한다.
		 * 
		 * 	while(①조건식){
		 * 		②실행문
		 * 	}
		 * 
		 * 	while문이 처음 실행될 때 ①조건식을 평가한다. 평가 결과가 true이면 ②실행문을 실행한다.
		 * 	②실행문이 모두 실행되면 다시 조건식으로 되돌아가서 ①조건식을 다시 평가한다.
		 * 	만약 조건식이 true 라면 ② -> ①로 다시 진행하고, false라면 while문을 종료한다.
		 ---------------------------------------------------------------------------------------*/
		
		//1~10까지 출력
		start = 1;
		while(start <= 10) {
			System.out.println(start);
			start++;
		}
		
		/*
		 * 만약 조건식에 true를 사용하면 while(true){...}가 되어서 무한루프를 돌게 된다.
		 * 무한루프는 무한히 반복하여 실행하기 떄문에 언젠가는 while문을 빠져 나가기 위한 코드가 필요하다.
		 * 
		 * 다음 예제는 ㅣㅋ보드에서 1, 2를 입력했을때 속도를 증속, 감속시키고, 3을 입력하면 프로그램을 종료시킨다.
		 */
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		System.out.println("프로그램 시작");
		while(run) {
			if(keyCode!=13 && keyCode !=10) {	//Enter키가 입력되면 캐리지리턴(13)과 라인피드(10)가 입력되므로 이 값을 제외시킴
				System.out.println("-------------------------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------------------------------");
				System.out.println("선택 : ");
			}// 메뉴생성
			
			keyCode = System.in.read();// 키보드의 키코드를 읽음
			
			if(keyCode == 49) {
				speed ++;
				System.out.println("현재속도 : " + speed);
			}else if(keyCode == 50) {
				speed --;
				System.out.println("현재속도 : " + speed);
			}else if(keyCode == 51) {
				run = false;	//while문 종료를 위해 run변수에 false를 저장
			}
		}
		System.out.println("프로그램 종료");
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter03-02-03		do-while문
		 * 	
		 * 	do-while문은 조건식에 의해 반복 실행 한다는 점에서는 while문과 종일
		 * 	while문은 시작핼 때부터 조건식을 검사하여 블록 내부를 실행할지 결정하지마느 경우에 따라서는 
		 * 	블록 내부의 실행문을 우선 실행시키고 실행 결과에 따라서 반복 실행을 계속할지 결정하는 겨우도 발생한다.
		 * 	이때 do-while문을 사용할수 있다.
		 * 	
		 * 	do{
		 * 		①실행문;
		 * 	}while(②조건문);
		 * 
		 * 	작성시 뒤에 반드시 세미콜론을 붙여줘야 한다.
		 *  do-while문은 처음 실행할때 ①실행문을 우선 실행한다. 
		 *  ①실행문이 모두 실행되면 ②조건식을 평가하는데 그 결과가 true이면 
		 *  ① -> ②와 같이 반복실행을 하고, 
		 *  조건식의 결과가 false이면 do-while문을 종료한다.
		 ---------------------------------------------------------------------------------------*/
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);	//Scanner 객체 생성 System.in.read() 메서드는하나의 키 코드만 읽기떄문에 문자열을 읽을수 없다
													//Scanner객체를 생성하고 nextLine() 메서드를 호출하면 콘솔에 입력된 문자열을 한번에 읽을수 있다.
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();	//키보드로 입력한 문자열을 얻음
			System.out.println(inputString);
		}while(! inputString.equals("q"));		//문자열을 비교할때는 equals()메소드를 사용
		System.out.println("프로그램 종료");
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter03-02-04		break문
		 * 	
		 * 	break문은 반복문인 for문, while문, do-while문을 실행 중지할때 사용된다.
		 * 
		 * 	for(...){				while(..){
		 * 		break;					break;
		 * 	}						}
		 * 
		 * 	break문은 대개 if문과 같이 사용되어 if문의 조건식에 따라 for문과 while문을 종료할때ㅑ 사용한다.
		 * 	다음 예제는while문을 이용해서 주사위 번호중 하나를 반복적으로 뽑되, 6이 나오면 while문을 종료시킨다.
		 ---------------------------------------------------------------------------------------*/
		
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		/*
		 * 만약 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.
		 * 중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 바깥쪽 반복문에 이름(라벨)을 붙이고, "break 이름;" 을 사용하면 된다.
		 * 
		 * 	Label:for(){
		 * 		for(){
		 * 			break Label;
		 * 		}
		 * 	}
		 */
		
		Outter:for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
		
		/*----------------------------------------------------------------------------------------
		 * 	Chapter03-02-05		continue문
		 * 	
		 * 	continue문은 반복문인 for문, while문, do-while문에서만 사용되는데, 블록 내부에서
		 * 	continue문이 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다.
		 * 
		 * 	for(...){			while(...){
		 * 		continue;			continue;
		 * 	}					}
		 * 
		 * 	continue문은 반복문을 종료하지 않고 계속 반복을 수행한다. 
		 * 	continue문도 break문과 마찬가지로 if문과 같이 사용된다.
		 * 	특정조건을 만족하는 경우에 continue문을 실행해서 그 이후 문장을 실행하지 않고 다음 반복으로 넘어간다.
		 * 	다음 예제는 1~10 사이으 수 중에서 짝수만 출려하는 코드이다.
		 ---------------------------------------------------------------------------------------*/
		
		for(int i = 1; i<=10; i++) {
			if(i%2 !=0)
				continue;
			
			System.out.println(i);
		}
		
	}//end main
}
