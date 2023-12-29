package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.print("숫자를 입력하세요: ");
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		for(int z=1; z<=n; z++) {
			if (z!=n) {
				System.out.print(z);
				System.out.print("+");
			} else {
				System.out.println(n);
				break;
			}
		}
		System.out.println("합계: "+sum);
		
		
		
		sc.close();
		
		
	}

}
