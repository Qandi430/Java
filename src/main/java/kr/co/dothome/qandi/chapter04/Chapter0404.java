package kr.co.dothome.qandi.chapter04;

public class Chapter0404 {
	public static void main(String[] args) {
		/*----------------------------------------------------------------------------------------
		 * 	Chapter04-04	null 과 NullPointerException
		 * 	
		 * 	참조 타입 변수는 힙 영역의 객체를 참조하지 않는다는 뜻으로 null값을 가질수 있다.
		 * 	null값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.
		 *  참조 타입 변수가 null값을 가지는지 확인하려면 ==, =! 연산을 수행하면 된다. ex) refVar1 == null or refVar1 != null
		 *  
		 *  자바는 프로그램 실행 도중에 발생하는 오류를 예외(Exception)라고 부른다.
		 *  참조변수를 사용하면서 가장 많이 발생하는 예외중 하나로 NullPointerException이 있다..
		 *  이 예외는 참조타입 변수를 잘못 사용하면 발생한다. 참조타입 변수가 null을 가지고 있을 경우, 참조타입 변수는 사용할 수 없다. 
		 *  참조타입 변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데, 참조할 객체가 없으므로 사용할 수가 없는 것이다. 
		 ----------------------------------------------------------------------------------------*/
		int[] intArray = null;
		//intArray[0] = 10;	//java.lang.NullPointerException
		
	}
}
