package com.javaex.practice04;

public class Ex02 {
	
	//[문제] Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.
	
	public static void main(String[] args) {
		
		double[] a=new double[3];
		
		a[0]=6.7;
		a[1]=3.3;
		a[2]=1.2;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
