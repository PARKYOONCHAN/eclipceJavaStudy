package study.co.kr.jungbu;
//study.co.kr.jungbu;.L20InputOutputStream
import java.io.IOException;

public class L20InputOutputStream {

	public static void main(String[] args) {

		//입출력 장치와 스트림
		//입력(input)과 출력(output) : 컴퓨터 내부(cpu, memory), 외부(장치)에서 프로그램간에 데이터를 주고 받는 것
		//파일을 입력받거나 출력하는 행위
		//소리를 출력, 키보드 or 마우스 입력
		//모니터에 출력
		try {
			int i = System.in.read(); //InputStream : byte 기반의 입출력 클래스라 문자열을 입력받을수없다.
			System.out.println("입력한 값: " + i); 
			//아스키코드(1바이트) : 최초로 만들어진 문자표, 유니코드(2바이트) : 모든 문자를 사용하기 위해 만들어진 문자표
			//입출력은 기본 1바이트를 기준으로 데이터를 입력하거나 출력한다.
			//예) char(97 + 16) (255 77) (0 44) (99 254) -1 (문서) => 유니코드로 변환
			//예) char(97) (16) (255) (77) (0) (44) (99) (254) -1 (문서) => 유니코드로 변환
			
			// 0 0 0 0 0 0 0 0 약속 1바이트타입이라 하겠다.
			// 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 약속 1바이트타입이라 하겠다.
			// 0 0 0 0 0 0 0 0    /    0 0 0 0 0 0 0 0 
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
