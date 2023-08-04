package com.bizpoll.oop.lambda;

import java.util.ArrayList;

// 복수 매개 변수인 경우

interface Say4 {
	int something(int a);
}

class Person4 {
	public void greeting(Say4 say) {
		int num = say.something(7);
		System.out.println("Number is : " + num);
	}
}

public class LambdaDefaultExam4 {

	public static void main(String[] args) {

		// JAVA 7
		Person4 person = new Person4();
		person.greeting(new Say4() {

			@Override
			public int something(int a) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("parameter value is : " + a);
				
//				ArrayList<Integer> arr = new ArrayList<>();
//				arr.add(a);
//				arr.add(b);
				
				return a;
			}
		});
		
		System.out.println("================================");

		// JAVA 8
		// (매개변수) -> {처리 내용}
		// 1. type 생략
		// 2. () 생략 불가능
		person.greeting((a) -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
			System.out.println("parameter1 value is : " + a);
//			System.out.println("parameter2 value is : " + b);
			return a;
		});
	}

}
