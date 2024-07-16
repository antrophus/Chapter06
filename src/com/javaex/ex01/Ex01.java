package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		//숫자 출력
		//출장가서 실행하기
		Thread dThread = new DigitThread();
		dThread.start();
		
		
		//문자 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
