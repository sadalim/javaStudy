package com.bizpoll.oop.generic;

import java.util.ArrayList;
import java.util.List;

// java5부터 제네릭 타입이 새로 추가
// - 제네릭 타입을 이용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거 할 수 있음. 
// - 제네릭은 컬렉션, 람다식, 스트림, NTO에서 널리 사용 됨.
// - API 도큐먼트를 보면 제네릭 표현이 많음.
// - 제네릭은 클래스와 인터페이스, 그리고 메서드를 정의할 때 타입을 파라미터로 사용할 수 있도록 함.
public class A_GenericEx1 {

	public static void main(String[] args) {
		
//		제네릭이 없을 때 사용한 기법(1.4 이전)
		List list1= new ArrayList();
		list1.add("hello");
		String str1 = (String)list1.get(0);
		
		System.out.println("str1 : " + str1);
		
//		제네릭 기법(1.5 이후)
		List<String> list2 = new ArrayList<>(); // 스트링 타입의 데이터만 받겠다.
//		List<BookDTO> list2 = new ArrayList<BookDTO>(); // 실제 사용하는 형식
		list2.add("world");
		String str2 = list2.get(0);

		System.out.println("str2 : " + str2);
	}
	
}


































