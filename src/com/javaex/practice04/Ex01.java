package com.javaex.practice04;

public class Ex01 {
	
	//[문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로확인해 보세요.
	
	public static void main(String[] args) {
		/*
		int[] intArray=new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;

		
		int result=0;
		
		for(int i=0; i<=intArray.length; i++) {
			result=result+intArray[i];
		}
		System.out.println(result);
		*/
		int[] intArray=new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;

		
		int result=0;
		
		for(int i=0; i<intArray.length; i++) {  //배열은 0부터 시작이기에 5번째 자리가 나올수 없다
			result=result+intArray[i];
		}
		System.out.println(result);
	}

}
