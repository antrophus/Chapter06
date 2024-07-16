package com.javaex.ex03;

public class Ex01 {
	
	public static void main(String[] args) {
		
		//숫자 출력 출장
		Runnable dr = new DigitRunnableimpl();
		
		Thread thread = new Thread(dr);
		thread.start(); // 출장기능 있음, 해야할 일이 없음
		
		
		//문자 출력
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try{
				Thread.sleep(900);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
