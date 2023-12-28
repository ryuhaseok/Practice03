package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {

		/*
		1
		2
		3
		4
		*/
		
		//break는 중간에 빠져나감
		//아래 경우는 반복문 안의 일을 마치고 다음 반복문에 들어갈 수 없음
		
		//i=5일때 flag를 false로 바꾸고 i를 출력한 다음 while이 false로 바뀌었으므로 종료
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i=i+1;
		}
		
		
	}

}
