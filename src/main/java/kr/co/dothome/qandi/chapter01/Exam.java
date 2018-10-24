package kr.co.dothome.qandi.chapter01;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer;
		
		while(true) {
			System.out.println("1. 자바에서 변수에 대한 설명 중 틀린것은 무엇입니까?");
			System.out.println("\t 1 - 변수 하나의 값만 저장할 수 있다.");
			System.out.println("\t 2 - 변수는 선언시에 사용한 타입의 값만 저장할 수 있다.");
			System.out.println("\t 3 - 변수는 선언한 중괄호({}) 안에서만 사용 가능하다.");
			System.out.println("\t 4 - 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다.");
			
			System.out.print("정답?");
			answer = sc.nextInt();
			if(answer == 4) return; 
		}
		
		
		
	}
}
