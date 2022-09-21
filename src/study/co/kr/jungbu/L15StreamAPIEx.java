package study.co.kr.jungbu;

import java.util.ArrayList;
import java.util.List;

public class L15StreamAPIEx {
	static int sum2;
	public static void main(String[] args) {

		Integer n = new Integer(500);
		System.out.println(10+n);
		System.out.println(10+n.intValue());
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(500); // new Integer(500)
		numList.add(55);
		numList.add(5);
		numList.add(null);
		numList.add(555);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		int sum = 0;
		for(Integer num : numList) { //int num = numList.get(i).intValue(); -> int num = null.intValue();
			if(num != null) {
				sum += num;
			}
		}
		//1. null을 int로 형변환할 때 오류가 떴다
		//2. null+sum 에서 오류
		//3. null 의 필드가 없는데 참조해서 오류 (o)
		
		System.out.println(sum);
		
		numList.stream().filter(i->i!=null) //검사식에서 true를 반환하는 값만 stream으로 다시 반환
		.forEach((i)->{sum2+=i;});
		System.out.println(sum2);
	}

}
