package study.co.kr.jungbu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class L11Swing {
	static boolean start=true;
	public static void main(String[] args) {

		//JFrame Swing Gui를 제공하는 객체
		// java : 플랫폼(os)에 독립적이다. -> 모든 os에서 비슷하게 제공하는 객체를 생성
		JFrame frame = new JFrame("swing frame"); //container : component 객체를 포함할 수 있다. window os에서 제공되는 창을 생성
		JButton btn = new JButton("시간 출력"); // Component : container에 포함될 수 있고 이벤트를 받을수있다.
		JButton btn2 = new JButton("멈춤");
		JLabel label = new JLabel("현재시간 출력");
		label.setFont(new Font("Serif", Font.BOLD, 20));
		//boolean start = true;
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!start) start=true;
				new Thread(()->{while(start) {
					System.out.println("버튼이 눌림");
					String now = LocalTime.now().toString();
					label.setText(now);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} }).start();
				//component 의 thread를 독점하기 때문에 Frame이 아무런 동작도 하지 않는다.
				//actionPerformed() 함수가 종료되어야 Frame 다음 동작을 할 수 있다
			}
		});
		btn2.addActionListener(( (e)->{
			start=false;
		}));
		//frame 은 기본 레이아웃(BorderLayout)이 지정되어 있다.
//		frame.add(btn, BorderLayout.CENTER);
		frame.setLayout(null);// 레이아웃을 없애면 위치나 크기로 컴퍼넌트(버튼)의 위치를 지정할 수 있다.
		btn.setBounds(0, 0, 100, 80); // frame에 존재할 위치와 크기 지정
		btn2.setBounds(150, 0, 100, 80);
		label.setBounds(0, 100, 300, 100);
		frame.add(btn);
		frame.add(btn2);
		frame.add(label);
		
		frame.setBounds(100, 100,300, 200); // 프레임의 화면 위치
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //window의 종료 버튼을 누르면 어떻게 하는지 정의
		frame.setVisible(true);
		
	}

}
