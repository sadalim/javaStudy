package com.bizpoll.oop.lambda;

// 람다의 표현식
// 1. 람다는 매개변수 화살표(->) 함수 몸체로 이용하여 사용
// 2. 매개변수가 하나일 경우 매개변수를 생략 할 수 있음
// 3. 함수몸체가 단일 실행문이면 괄호{}를 생략 할 수 있음.
// 4. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{}를 생략 할 수 있다.
// 5. 함수형 인터페이스에서만 사용 가능.
interface Say1 {
	int something();
}

class Person1 {
	public void greeting(Say1 say) {
		int num = say.something();
		System.out.println("Number is : " + num);
	}
}

public class LambdaDefaultExam2 {

	public static void main(String[] args) {

		// JAVA 7
		Person1 person = new Person1();
		person.greeting(new Say1() {

			@Override
			public int something() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
				
				return 7;
			}
		});
		
		System.out.println("================================");

		// JAVA 8
		// (매개변수) -> {처리 내용}\
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
			return 8;
		});
	}

}
