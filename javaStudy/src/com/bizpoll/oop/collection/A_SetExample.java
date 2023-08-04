package com.bizpoll.oop.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Collection : 같은 타입의 참조값을 여러개 저장하기 위한 자바 라이브러리이며 배열과 비슷한데 훨씬 더 편리함.
// List : 중복을 허용하고 순서를 가지고 있음.(ArrayList, LinkedLisk)
// Set : 중복을 허용하지 않고 순서도 가지고 있음.(HashSet, TreeSet)
// Map : key 와 value의 형태로 저장.(HashMap, TreeMap)
public class A_SetExample {
	public static void main(String[] args) {
//		Set set= new HashSet<>();
//		
//		set.add("양효선");
//		set.add("홍용표");
//		set.add("황진호");
//		set.add("김동진");
//		set.add("전경수");
//		set.add("양효선");
//
//		System.out.println(set);
		
		Set<String> set= new HashSet<>();
		
		set.add("양효선");
		set.add("홍용표");
		set.add("황진호");
		set.add("김동진");
		set.add("전경수");
		set.add("양효선");

		System.out.println(set);
		
		// TreeSet : 정렬, 검색 유리
		Set<String> sortedSet = new TreeSet<>(set);
		System.out.println(sortedSet);
		
	}
}
