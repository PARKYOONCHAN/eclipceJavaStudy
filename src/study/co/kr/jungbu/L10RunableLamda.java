package study.co.kr.jungbu;

import java.time.LocalTime;

public class L10RunableLamda {

	public static void main(String[] args) {

		//인터페이스는 객체를 생성할 수 없다, 그러나 생성과 통시에 추상메서드를 구현{}하면 된다.
//		Thread clockThread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				while(true) {
//					System.out.println(LocalTime.now());
//					try {	Thread.sleep(1000);	} catch (InterruptedException e) {	e.printStackTrace();	}
//				}
//			}
//		});
		
		Runnable clock=()->{
			while(true) {
				System.out.println(LocalTime.now());
				try {	Thread.sleep(1000);	} catch (InterruptedException e) {	e.printStackTrace();	}
			}
		};
		
		Thread clockThread = new Thread(clock);
		clockThread.start();
		System.out.println("main thread");
	}

}
