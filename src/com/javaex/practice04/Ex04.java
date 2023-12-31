package com.javaex.practice04;

public class Ex04 {
	/*
	[문제] Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요.
	int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
	*/
	
	
	public static void main(String[] args) {
		
		int[] data =new int[13];
		int a=0;
		int b=0;
		data[0]=1;
		data[1]=3;
		data[2]=5;
		data[3]=8;
		data[4]=9;
		data[5]=11;
		data[6]=15;
		data[7]=19;
		data[8]=18;
		data[9]=20;
		data[10]=30;
		data[11]=33;
		data[12]=31;
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%3==0) {
				a=a+1;
				b=b+data[i];
			}else {
				
			}
		}System.out.println("주어진 배열에서 3의 배수의 개수=>"+a);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+b);
		
		
	}
}
