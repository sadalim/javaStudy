package com.bizpoll.oop.mapListExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListExample {
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		System.out.println();

		// List Map 객체 선언
//		List<Map<String, List<Map<String, Object>>>> listMapInsert = new ArrayList<>();
		List<Map<String, Object>> listMapInsert = new ArrayList<>();

		// for 반복문을 순회하면서 데이터 삽입

		for (int i = 1; i <= 3; i++) {
			// Map 객체 생성 및 데이터 생성
			Map<String, Object> map = new HashMap<>();
			map.put(String.valueOf(i), i + "value");
			map.put(i + "", i + "value");
			listMapInsert.add(map);
		}

		System.out.println("[데이터 출력]");
		for (int i = 0; i < listMapInsert.size(); i++) {
//			System.out.println(listMapInsert.get(i));
			Map<String, Object> hashMap = new HashMap<>(listMapInsert.get(i));
			System.out.println(hashMap.toString());
		}
	}
}
