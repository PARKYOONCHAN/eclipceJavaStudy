package study.co.kr.jungbu;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Func<T, R>{
	R apply(T t);
}

public class L12Lamda {

	public static void main(String[] args) {
		// JavaScript(함수형언어, 프로타입언어) 람다식 : functional(){} 함수, ()->{} 람다식, class(문법적 설탕 == FUNCTION), ()->{} 람다식 함수(타입이 존재하지않는)
		// function Calc(a, b){this.a =a; this.b=b; this.sum = function(){} } let calc = new Calc();
		// Java(객체지향언어) 람다식 : 함수가 하나 있는 객체의 매개변수 대신 간편하게 작성하는 문법적 설탕
		Function<Integer, Long	> square = (i)->{return (long)i*i;}; // function은 매개변수가 하나 있고 반환하는 것이 있는 함수
		Function<Integer, Long	> square2 = new Function<Integer, Long>() {
			
			@Override
			public Long apply(Integer t) {
				long result = t*t;
				return result;
			}
		};
		BiFunction<Integer, Integer, Long> sum = (i, i2)->{return (long)(i+i2);};
		System.out.println(sum.apply(40, 100));
		Consumer<Integer> squarePrint =(i)->{System.out.println(i*i);};
		squarePrint.accept(133);
		//검사식 Predicate : 매개변수와 반환하는 값이 있는데 반환하는 값의 타입은 무조건 boolean
		Predicate<String> nullCheck= s-> s!=null;
		//Supplier : 변환하는 것만 있는 함수 정의
		Supplier<Integer> randomNum = ()->{return (int)(Math.random()*10)+1; }; //1~10까지 랜덤한 수를 반환하는 수
		System.out.println(randomNum.get());
		//BinaryOperator(연산하는 함수) : 매개변수가 2개고 반환하는 것이 있으며 매개변수와 반환 값의 타입이 같은것
		BinaryOperator<Integer> sum2 = (i,i2)-> i+i2;
		System.out.println(sum2.apply(45, 99));
		
		//코드의 길이가 줄ㅇ들면 가독성 + 구현 시간 줄어들고 유지보수에도 유리하기 땜ㄴ에 람다식을 사용 
	}

}
//기술에 대한 질문(객체지향에 대한 질문 + 데이터베이스 설계) + 영어 시험(반복문 검사, 성능 문제 if -> switch, 영어로 회사 프로젝트 진행 방향 대답)
//프로젝트 -> 질문(기본)
