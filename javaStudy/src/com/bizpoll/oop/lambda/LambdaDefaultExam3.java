package com.bizpoll.oop.lambda;

// 단일 매개 변수인 경우

interface Say2 {
	int something(int a);
}

class Person2 {
	public void greeting(Say2 say) {
		int num = say.something(7);
		System.out.println("Number is : " + num);
	}
}

public class LambdaDefaultExam3 {

	public static void main(String[] args) {

		// JAVA 7
		Person2 person = new Person2();
		person.greeting(new Say2() {

			@Override
			public int something(int a) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("parameter value is : " + a);
				
				return a;
			}
		});
		
		System.out.println("================================");

		// JAVA 8
		// (매개변수) -> {처리 내용}
		// 1. type 생략
		// 2. () 생략
		person.greeting(a -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
			System.out.println("parameter value is : " + a);
			return a;
		});
	}

}
