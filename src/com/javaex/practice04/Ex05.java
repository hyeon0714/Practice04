package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {
	
	//[문제] Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] a=new int[5];
		int b=0;
		
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		a[3]=sc.nextInt();
		a[4]=sc.nextInt();
		
		for(int i=0; i<a.length; i++) {
			b=b+a[i];
			
		}System.out.println("평균은 "+(b/5)+" 입니다");
		
		sc.close();
	}
}
