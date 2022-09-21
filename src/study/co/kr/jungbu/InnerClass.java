package study.co.kr.jungbu;
import java.lang.*;
import java.util.Scanner; // 개발에 유용한 클래스의 집합
import java.util.ArrayList; // HashMap ... 컬렉션 프레임워크(유용한 자료구조)

public class InnerClass {

	// class 생성 : java -> class로 컴파일 (javac)
	// package 생성 : 클래스에 고유 이름을 제공, 비슷한 성격의 클래스의 모음
	// public class : java 문서와 동일한 이름의 class, 다른 패키지에서 import해서 사용가능한 class
	// main 메소드(앱) : jre를 호출해서 작성한 코드를 실행 => 순차적 언어
	public static void main(String[] args) {
		System.out.println("안녕!");
		java.lang.String s="dd";	//기본?? 참조??(ㅇ)
		java.lang.Integer i = 13; //??랩퍼클래스
		
		int i2=44; //오른쪽 생성 후 왼쪽 참조
		int i3=44;
		int i4=44;
		int i5=44;
		
		char arrC[] = {'a', 'b', 'c', 'd', 'e'}; //배열(리터럴하게 선언 가능) -> 참조형
		char arrC2[] = new char[5]; //{0,0,0,0,0};
		Character arrC3[] = new Character[5]; //{null, null, null,null, null};
		String s3 = "abcde"; // 마치 기본형처럼 선언됨
//		s3.
		
		//기본형(원시형)데이터 타입의 특징 ?? -> 면접 단골 primitive type(원시적 -> 기계와 가까울수록)
		//1. 원시형데이터 int i=4; => 메모리 4바이트 공간을 할당(주소생성) => 데이터 원본 (필드가 없다)
		//2. 리터럴하게 선언 (문자그대로) : 대부분 수와 관련되어 있기 때문, 자주 사용하기 때문 
		//3. 스택 메모리에 생성됨 : 자주 사용하기 때문 i2~i5까지 같은 44를 참조
		
		//참조형데이터 타입의 특징
		Object o = new Object(); 
		// 1. {"경민", "길동", "둘리"} data를 참조하고 있어서 참조형 데이터 타입
		// 2. new 연산자로 생성자를 호출하면 참조형 데이터(객체) 생성 (생성자 class와 동일한 이름을 갖는 존재)
		// 3. 객체가 힙 메모리에 생성(가비지 컬랙션 의해 정리=>포인터가 필요없어짐) => 인스턴스 객체
		//
		
	}
	
}

class wdc{
	//전역에 선언하는 것은 필드가 된다. 객체가 참조하는 data
	String name = "정욱채";
	String hands[] = {};
	int birth = 1990;
}
