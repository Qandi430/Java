package kr.co.dothome.qandi.chapter04;

public class Chapter0406 {
	public static void main(String[] args) {
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-06	배열 타입
		 * 	
		 * 	배열은 같은 타입의 데이터를 연속된 공간에 나열시키고, 각 데이터에 인덱스(index)를 부여해 놓은 자료구조이다.
		 * 	
		 * 	배열은 같은 타입의 데이터만 저장할 수 있다.
		 * 	배열은 선언과 동시에 저장할 수 있는 데이터 타입이 결정된다.
		 * 	만약 다른 타입의 값을 저장하려고 하면 타입 불일치(Type mismatch) 컴파일 오류가 발생한다.
		 * 	한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
	 	----------------------------------------------------------------------------------------*/	
		
		/*---------------------------------------------------------------------------------------
		 * 	Chapter04-06-02		배열 선언
		 * 
		 * 	배열 변수 선언은 다음과 같이 두 가지 형태로 작성할 수 있다.
		 * 	타입[] 변수;	타입 변수[];
		 * 	대괄호 []는 배열 변수를 선언하는 기호로 사용되는데, 타입 뒤에 붙을수도 있고 변수 뒤에 붙을 수도 있다. 
		 * 	타입은 배열에 저장될 데이터의 타입을 말한다.
		 * 	
		 * 	배열 변수는 참조 변수에 속한다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 객체를 참조하게 된다.
		 * 	참조할 배열 객체가 없다면 배열 변수는 null 값으로 초기화 될수 있다.
		 ---------------------------------------------------------------------------------------*/
		
		/*---------------------------------------------------------------------------------------
		 * 	Chapter04-06-03		값 목록으로 배열 생성
		 * 
		 * 	배열 항목에 값의 목록이 있다면 다음과 같이 간단하게 배열 객체를 만들 수 있다.
		 * 	데이터 타입[] 변수 = {값0, 값1, 값2......};
		 * 	이렇게 생성된 배열에서 값을 읽을 땐 
		 * 	변수[index]; 로 읽을수 있다. ex) 변수[0] == 값0;
		 * 	값을 바꾸고 싶다면 변수[index] = 바꿀값; 으로 대입할수 있다.
		 * 
		 * 	값의 목록으로 배열 객체를 생성할 때 주의할 점이 있는데, 
		 * 	배열 변수를 이미 선언한 후에 다른 실행문에서 중괄호를 사용한 배열생성은 허용되지 않는다.
		 * 
		 * 	배열 변수를 미리 선언한 후, 값 목록들이 나중에 결정되는 상황이라면 다음과 같으 new 연산자를 사용해서 값 목록을 지정해 주면된다.
		 * 	new 연산자 바로 뒤에는 배열 변수 선언에서 사용한 "타입[]"를 붙여주고 중괄호 {}에는 값들을 나열해주면 된다. 
		 * 
		 * 	타입[] 변수;
		 * 	변수 = new 타입[]{값0,값1,값2....};
		 * 
		 ---------------------------------------------------------------------------------------*/
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : "+sum1);
		//리턴된 총합을 sum2에 저장
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : "+sum2);
		System.out.println();
		
		/*---------------------------------------------------------------------------------------
		 * 	Chapter04-06-04		new 연산자로 배열 상성
		 * 
		 * 	값의 목록을 가지고 있지 않지만, 향후 값들을 저장할 배열을 미리 만들고 싶다면 new 연산자로 다음과 같이 배열 객체를 생성시킬수있다.
		 * 	타입[] 변수 = new 타입[길이];
		 * 	길이는 배열이 저장할 수 있는 값의 수를 말한다. new 연산자로 배열을 생성할 경우에는 이미 배열 변수가 선언된 후에도 가능하다.
		 * 	타입[] 변수 = null;
		 * 	변수 = new 타입[길이];
		 * 
		 * 	다음은 길이 5인 int[] 배열을 생성한다.
		 * 	int[] intArray[] = new int[5];
		 * 	자바는 intArray[0]~intArray[4]까지 값이 저장될 수 있는 공간을 확보하고, 배열의 생성 번지를 리턴한ㄴ다.
		 * 	리턴된 번지는 intArray 변수에 저장된다. 각각 항목ㅇ 크기는 int 타입의 크기인 4byte이다.
		 * 
		 * 	new 연산자로 배열을 처음 생성할 경우, 배열은 자동적으로 기본값으로 초기화 된다.
		 * 	
		 * 	타입별 배열의 초기값
		 * 	---------------------------------------------------------------------------------------
		 * 	분류				데이터 타입			초기값
		 * 	---------------------------------------------------------------------------------------
		 * 	기본 타입(정수)		byte[]				0
		 * 						char[]				'\u0000'
		 * 						short[]				0
		 * 						int[]				0
		 * 						long[]				0
		 * 	---------------------------------------------------------------------------------------
		 * 	기본 타입(실수)		float[]				0.0f
		 * 						double[]			0.0
		 * 	---------------------------------------------------------------------------------------
		 * 	기본 타입(논리)		boolean[]			false
		 * 	---------------------------------------------------------------------------------------
		 * 	참조타입			클래스[]			null
		 * 						인터페이스[]		null
		 * 	---------------------------------------------------------------------------------------
		 * 
		 * 	배열이 생성되고 나서 새로운 값을 저장하려면 대입 연산자를 사용하면된다.
		 * 	변수[인덱스] = 값;
		 ---------------------------------------------------------------------------------------*/
		
		int arr1[] = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		double arr2[] = new double[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
		/*---------------------------------------------------------------------------------------
		 * 	Chapter04-06-05		배열 길이
		 * 
		 * 	배열의 길이란 배열에 저장할 수 있는 전체 항목 수를 말한다. 
		 * 	코드에서 배열의 길이를 얻으려면 배열객체의 length필드를 읽으면 된다. 
		 * 	필드는 객체내부의 데이터를 말한다.
		 * 	배열의 length필드를 읽기 위해서는 배열 변수에 도트(.) 연산자를 붙이고 length를 적어주면 된다.
		 * 
		 * 	length 필드는 읽기 전용 필드이기 때문에 값을 바꿀수가 없다
		 * 
		 * 	배열의 length 필드는 for문을 사용해서 배열 전체를 루필할 때 매우 유용하게 사용할 수 있다.
		 ---------------------------------------------------------------------------------------*/
		
		int[] arr4 = {1,2,3,4};
		System.out.println(arr4.length); // 4
		for(int i = 0 ; i<arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		/*
		 * for문의 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열길이보다 1이 적기 때문.
		 * 배열의 인덱스 범위는 0~(길이 - 1) 이다.
		 * 만약 인덱스를 초과해서 사용하면 ArrayIndexOutOfBoundsException이 발생한다.
		 */
		
		/*----------------------------------------------------------------------------------------------
		 * 	Chapter04-06-06		커맨드 라인 입력
		 * 	
		 * 	main() 메소드의 메개값인 String[] args의 필요성
		 * 	"Java 클래스"로 프로그램을 실행하면 JVM은 길이가 0인 배열을 먼저 생성하고 main()메서드를 호출할 때 매개값으로 전달한다.
		 * 	
		 * 	메뉴 > Run > Run Configurations > Main > Arguments > Program arguments 에서 관리가 가능 
		 ---------------------------------------------------------------------------------------------*/
		
		/*----------------------------------------------------------------------------------------------
		 * 	Chapter04-06-07		다차원 배열
		 *
		 * 	다차원 배열이란 배열안에 또다른 배열을 참조하는 형식
		 * 
		 * 	2차원 배열
		 * 	2차원 배열은 수학의 행렬을 떠올리면 되는데 가로 인덱스와 세로인덱스를 사용한다.
		 * 	자바는 2차원 배열을 정첩 배열방식으로 구현 2(행) x 3(열) 행렬을 만들기위해 다음과 같은 코드를 사용한다.
		 * 	int[][] scores = new int[2][3];
		 * 	
		 * 	배열변수인 scores는 길이 2인 배열 A를 참조
		 * 	배열 A의 scores[0]은 다시 길이 3인 배열 B를 참조한다.
		 * 	배열 A의 scores[1]은 다시 길이 3인 배열 C를 참조한다.
		 * 	
		 * 	자바는 일차원 배열이 서로 연결된 구조로 다차원 배열을 구현하기 때문에 수학 행렬 구조가 아닌 계단식 구조를 가질 수 있다.
		 * 
		 * 	int[][] scores = new int[2][];
		 * 	socres[0] = new int[2];
		 * 	scores[1] = new int[3];
		 ---------------------------------------------------------------------------------------------*/
		
		int[][] mathScores = new int[2][3];
		
		for(int i = 0; i<mathScores.length; i++) {
			for(int k = 0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
	
		for(int i = 0; i<englishScores.length; i++) {
			for(int k = 0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80},{92, 96, 80}};
		for(int i = 0; i<javaScores.length; i++) {
			for(int k = 0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
		
		/*----------------------------------------------------------------------------------------------
		 * 	Chapter04-06-08		객체를 참조하는 배열
		 * 
		 * 	기본 타입(byte, char, short, int, float, double, boolean) 배열은 각 항목에 직접 값을 갖고 있지만, 
		 * 	참조 타입(클래스, 인터페이스) 배열은 각 항목에 객체의 번지를 가지고 있다.
		 *	
		 *	예를 들어 String은 클래스 타입으므로 String[] 배열은 각 항목에 문자열이 아니라 
		 *	String객체의 주소를 가지고 있다. 즉 String 객체를 참조한다.
		 ---------------------------------------------------------------------------------------------*/
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println( strArray[0] == strArray[1]);	//true 같은 주소를 참조
		System.out.println( strArray[0] == strArray[2]);	//false 다른 주소를 참조
		System.out.println( strArray[0].equals(strArray[2]) );	//true 문자열이 같음
		
		/*----------------------------------------------------------------------------------------------
		 * 	Chapter04-06-09		배열 복사
		 * 	
		 * 	배열은 한 번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장 공간이 필요하다면 
		 * 	보다 큰 배열을 새로 만들고 이전 배열로부터 항목값들을 복사해야한다.
		 * 	배열 간의 항목 값들을 복사하려면 for문을 사용하거나 System.arrayCopy()메소드를 사용하면 된다.
		 * 
		 * 	System.arrayCopy() 메소드를 호출하는 방법
		 * 	System.arrayCopy(Object src, int srcPos, Object dest, int destPos, int length);
		 * 	src 매개값은 원본배열이고, srcPos는 원본 배열에서 복사할 항목의 시작인덱스이다.
		 * 	dest 매개값은 새 배열이고, destPos는 새 배열에서 붙여넣을 시작 인덱스. 
		 * 	length는 복사할 개수이다.
		 ---------------------------------------------------------------------------------------------*/
		
		//for문 사용 배열 복사
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		System.out.printf("\nnewIntArray = ");
		for(int a : newIntArray) {
			System.out.printf("%d,",a);
		}
		
		//System.arrayCopy()메소드 사용 배열 복사
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		System.out.printf("\nnewStrArray = ");
		for(String a : newStrArray) {
			System.out.printf("%s,",a);
		}
		System.out.println();
		/*
		 *	참조타입 배열일 경우, 배열 복사가 되면 복사되는 값이 객체의 번지이므로 새배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일하다
		 *	이것을 얕은 복사(shallow copy)라고 한다. 반대로 깊은 복사(deep copy)는 참조하는 객체도 별도로 생성하는 것을 말한다. 
		 */
		
		/*----------------------------------------------------------------------------------------------
		 * 	Chapter04-06-10		향상된 for 문
		 * 	
		 * 	향상된 for문은 반복 실행을 하기 위해 카운터 변수와 증감식을 사용하지 않는다. 
		 * 	배열 및 컬렉션 항목의 개수만큼 반복하고, 자동적으로 for문을 빠져나간다.
		 * 
		 * 	for( ②타입 변수: ①배열){
		 * 		③ 실행문;	
		 * 	}
		 * 
		 * 	for문이 처음 실행될 때 ①배열에서 가져올 첫번째 값이 존재하는지 평가
		 * 	가져올 값이 존재하면 해당 값을 ②변수에 저장한다. 그리고 ③실행문을 실행한다.
		 * 	블록 내부의 ③실행문이 모두 실행됨녀 다시 루프를 돌아 ①배열에서 가져올 다음 값이 존재하는지 형가한다.
		 * 	가져올 항목이 존재하면 ② -> ③ -> ①로 다시 진행하고, 가져올 다음 항목이 없으면 for문이 종료된다.
		 ---------------------------------------------------------------------------------------------*/
		int score[] = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int s:score) {
			sum = sum+s;
		}
		System.out.println("점수 총합 = "+sum);
		
		double avg = (double)sum/score.length;
		System.out.println("점수 평균 = "+avg);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
