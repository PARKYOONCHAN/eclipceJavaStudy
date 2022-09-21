package study.co.kr.jungbu;

import java.util.Objects;

class PersonTest{
	String name; //필드
	int age;
	public PersonTest(String name, int age) {
		this.name = name; //필드 접근자
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 동일한 객체인지
			return true;
		if (obj == null) // 객체 != null
			return false;
		if (getClass() != obj.getClass()) //타입이 같은지
			return false; //메소드가 return이 실행되면 종료된다.
		PersonTest other = (PersonTest) obj; // 부모의 타입을 참조하는 변수를 자식의 타입으로 형변환
		return age == other.age && Objects.equals(name, other.name); //필드가 같은지
	}
	
	
}
public class L02Equals {

	
	
	public static void main(String[] args) {

		PersonTest 박윤찬 = new PersonTest("박윤찬", 27);
		Object 박윤찬2 = new PersonTest("박윤찬", 27);
		System.out.println(박윤찬==박윤찬2);
		System.out.println(박윤찬.equals(박윤찬2));
	}

}
