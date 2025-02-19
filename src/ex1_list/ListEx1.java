package ex1_list;

import java.util.ArrayList;
import java.util.List;

/*
Collection 인터페이스 : 객체를 여러개 저장할 수 있는 객체 

List 인터페이스 : Collection 인터페이스의 하위 인터페이스
- 객체들을 저장할때 저장된 순서를 유지. => 인덱스(첨자) 사용가능
- 가변 배열 객체라고도 함.
구현 클래스 : ArrayList, Vector, LinkdeList...
Vector : Collection 프레임워크 이전의 클래스. 
         Collection 프레임워크에서 제공되는 함수와, 기존에 사용했던 함수가 혼합됨

Set 인터페이스 : Collection 인터페이스의 하위 인터페이스
- 객체들을 중복해서 저장하지 않음
구현 클래스 : HashSet, TreeSet, LinkdHashSet


*/
public class ListEx1 {
	public static void main(String[] args) {
		/*
		<Integer> : 제네릭. 요소의 자료형을 미리 설정. 자료형이 틀린경우 컴파일 오류발생
		*/
		List<Integer> list = new ArrayList<>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(3);
		// list.add("5"); // list 객체는 Integer 객체만 저장 가능함. → <Object> 변경시 가능
		System.out.println(list);
		
		// 인덱스 사용가능
		for(int i = 0; i <list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
	}
}
