package kr.co.dothome.qandi.chapter01;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String[] stringList; // 스트링을 담을 배열

		stringList = str.split(""); //배열에 한글자씩 저장하기}
				
		String[] tempArray = new String[stringList.length/2];
		
		int cnt = 0;
		String result = "YES";
	
		for(int i = 0; i<stringList.length; i++) {
			System.out.print(stringList[i]+",");
		}
		System.out.println("===========");
		for(int i = 0; i < stringList.length; i++ ) {
			System.out.println(stringList[i]);
			System.out.println(cnt);
			
			if(stringList[i].equals("(")|| stringList[i].equals("{")||stringList[i].equals("[")) {
				
				tempArray[cnt] = stringList[i];			
				
				for(int j = 0; j<stringList.length; j++) {
					System.out.print(tempArray[i]+",");
				}
				
				cnt  = cnt+1;
			}else if(stringList[i].equals(")")|| stringList[i].equals("}")||stringList[i].equals("]")) {
				if(stringList[i]!=tempArray[cnt]) {
					result = "NO";
					System.out.println(result);
					return;
				}else {
					cnt = cnt -1;
				}
			}
		}
		System.out.println(result);
	}
	
}
