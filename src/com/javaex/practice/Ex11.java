package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		int sum=0;
		
		if(n%2==1) {
		
			for (int i=1; i<=n; i++) { 
			
				if(i%2==1 || i==1) {
					sum=sum+i;
				}
			}
			
		} else {
		
			for(int i=1; i<=n; i++) {
			
				if(i%2==0) {
					sum=sum+i;
				}
			}
		}
		System.out.println("결과값: "+sum);
		sc.close();
		*/
		
		//복습필요
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int startNum;
		int sum = 0;

		//시작 숫자를 1, 2로 나눔
		if (num % 2 == 1) {
			startNum = 1;
		} else {
			startNum = 2;
		}

		        //i를 시작값으로 지정    i 값이 홀수면 홀수대로 짝수면 짝수대로 변할 수 있게
		for (int i = startNum; i <= num; i = i + 2) {
			sum = sum + i;
		}

		System.out.println("결과값: " + sum);
		sc.close();
		
	}

}
