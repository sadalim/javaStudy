package com.bizpoll.oop.inheritance;
// 상속은 기존 클래스의 기능을 사용하여 새 클래스를 만드는 기술, 한 클래스가 다른 클래스의 특징(맴버메서드와 변수)을
// 가져오도록 하는 자바 객체지향 프로그래밍의 필수적인 부분 응용 프로그램의 유지 관리에 유용함
// 상송의 단점
// - 부모 클래스와 자식 클래스가 밀접하게 결합되기 때문에 상위 클래스의 코드를 변경하면 상위 클래스에서 파생된
//   모든 것이 하위 클래스에 영향을 미치므로 서로 독립하지 못함.
// - 문법
//   class 자식클래스 extends 부모클래스{
//   맴버 요소
//   }
public class ParentCat {

	// bread : 품종, 종자
	public String bread = "샴고양이";
	
	void eat() {
		System.out.println("먹이를 먹다.");
	}
}
