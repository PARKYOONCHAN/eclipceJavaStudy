package study.co.kr.jungbu;

import java.util.Scanner;

public class L06Exception {

	public static void main(String[] args) {

		//컴파일 시 발견되지 않는 오류를 예외처리 하는 방법
		
		String arr[] = {"a", "b", "c"};
	
		
		Scanner sc = new Scanner(System.in); //모든 통신은 기본이 문자열이다.
		System.out.println("{\"a\", \"b\", \"c\"} 찾고싶은 배열의 인덱스 입력!");
		
		while(true) {			
			String str = sc.nextLine();
//			Integer.parseInt("문자여ㅛㄹ"); : 문자열을 정수로 형변환
			try {
				
				System.out.println("arr["+str+"] : " + arr[Integer.parseInt(str)]);
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력하세요!");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("0부터 " + (arr.length-1) + "까지만 정수 입력하세요.");
			}catch (Exception e) { //모든 예외를 처리
				System.out.println("알수없는 오류 발생");
			}finally { // 예외가 발생하든 안하든 무조건 한번 실행(통신을하고 종료할 때 많이 사용)
				System.out.println("어플 다시 실행");
			}
		}
		
	}

}
