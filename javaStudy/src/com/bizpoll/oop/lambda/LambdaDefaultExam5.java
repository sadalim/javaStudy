package com.bizpoll.oop.lambda;


// 복수 매개 변수인 경우

interface Say5 {
	void something(int a, int b);
}

interface Hello {
	void something(String c, String b);
}

class Person5 {
	public void greeting(Say5 say) {
		say.something(7, 8);
	}
	
	public void greeting(Hello say) { // 오버로드
		
		say.something("Hello", "World");
		
	}
	
}

public class LambdaDefaultExam5 {

	public static void main(String[] args) {

		// JAVA 7
		Person5 person = new Person5();
		person.greeting(new Say5() {

			@Override
			public void something(int a, int b) {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				System.out.println("parameter value is : " + a);
				
//				ArrayList<Integer> arr = new ArrayList<>();
//				arr.add(a);
//				arr.add(b);
				
			}
		});
		
		System.out.println("================================");

		// JAVA 8
		// (매개변수) -> {처리 내용}
		// 1. type 생략
		// 2. () 생략 불가능
//		person.greeting((a, b) -> {
//			System.out.println("My name is java.");
//			System.out.println("Nice to meet you ><b");
//			System.out.println("parameter1 value is : " + a);
//			System.out.println("parameter2 value is : " + b);
//		});
//		
		person.greeting((String c, String d) -> {
			System.out.println("parameter values are : " + c + ", " + d);
		});
	}

}
