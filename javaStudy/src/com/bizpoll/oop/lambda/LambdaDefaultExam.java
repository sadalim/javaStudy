package com.bizpoll.oop.lambda;

// 람다의 표현식
// 1. 람다는 매개변수 화살표(->) 함수 몸체로 이용하여 사용
// 2. 매개변수가 하나일 경우 매개변수를 생략 할 수 있음
// 3. 함수몸체가 단일 실행문이면 괄호{}를 생략 할 수 있음.
// 4. 함수몸체가 return문으로만 구성되어 있는 경우 괄호{}를 생략 할 수 있다.
// 5. 함수형 인터페이스에서만 사용 가능.
interface Say {
	void something();
}

class Person {
	public void greeting(Say say) {
		say.something();
	}
}

public class LambdaDefaultExam {

	public static void main(String[] args) {

		// JAVA 7
		Person person = new Person();
		person.greeting(new Say() {

			@Override
			public void something() {
				System.out.println("My name is java.");
				System.out.println("Nice to meet you ><b");
			}
		});
		System.out.println("================================");

		// JAVA 8
		// (매개변수) -> {처리 내용}\
		person.greeting(() -> {
			System.out.println("My name is java.");
			System.out.println("Nice to meet you ><b");
		});
	}

}
