package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int s = sc.nextInt();
		int n=0;
		for(int i=1; i<=s; i++) {
			n=n+i;
			
			if (i==s ) {
				System.out.println("결과값: "+i*n);
				break;
			}
			
		}
	
		
		
		sc.close();
		
		
		
	}

}
