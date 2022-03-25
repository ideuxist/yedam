package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

//process (main 쓰레드) 
public class BeepPrintExample {
	public static void main(String[] args) {
		// 쓰레드 생성하는 방법
		// Thread의 생성자 매개값으로 Runnable을 구현한 객체

		// Thread thread = new Thread(new BeepTask());
		Thread thread = new Thread(() -> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			

	});
thread.start();	
}
}
