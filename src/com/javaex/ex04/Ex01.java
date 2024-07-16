package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {

//		Runnable rAble01 = new DigitRunnableImpl();
		Runnable rAble02 = new LowerRunnableImpl();
		Runnable rAble03 = new UpperRunnableImpl();

		// 출장 보내기
		Thread t01 = new Thread(new DigitRunnableImpl());
		Thread t02 = new Thread(rAble02);
		Thread t03 = new Thread(rAble03);

		// 숫자
		t01.start();
		// 소문자
		t02.start();
		// 대문자
		t03.start();

	}

}
