package com.javaex.practice04;

public class Ex08 {
	
	public static void main(String[] args) {
		/*
		[문제] Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
		(중복체크 할 것)
		*/
		int a[]=new int[6];
		
		a[0]=(int)(Math.random()*45)+1;		
		a[1]=(int)(Math.random()*45)+1;	
		a[2]=(int)(Math.random()*45)+1;	
		a[3]=(int)(Math.random()*45)+1;	
		a[4]=(int)(Math.random()*45)+1;	
		a[5]=(int)(Math.random()*45)+1;	
		
		for(int i=0; i<a.length; i++) {
			for(int k=0; k<i; k++) {
				if(a[i]==a[k]) {
					a[i]=(int)(Math.random()*45)+1;	
				}
			}
			System.out.print(a[i]+"  ");
		}
	}

}
