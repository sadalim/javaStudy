package com.bizpoll.oop.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class A_ListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("장길산");
		list.add("홀길동");

		String str1 = list.get(0);
		String str2 = list.get(1);

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}

		for (String string : list) {
			System.out.println(string);
		}

		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("A");
		linkedList.add("B");

		System.out.println(linkedList);

		linkedList.removeLast();
		System.out.println(linkedList);

	}
}
