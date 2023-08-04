package com.bizpoll.oop.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class A_MapExample {
	
	public static void main(String[] args) {
	
	Map<String, String> map = new HashMap<>();
	
	map.put("1", "양효선");
	map.put("2", "홍용표");
	map.put("6", "양효선");
	map.put("4", "김동진");
	map.put("3", "황진호");
	map.put("5", "전경수");
	
	System.out.println(map);
	System.out.println(map.get("4"));
	
	Map<String, String> sortedMap = new TreeMap<>(map);
	System.out.println(sortedMap);
	
	
	}
}





























