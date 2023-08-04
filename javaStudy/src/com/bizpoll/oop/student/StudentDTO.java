package com.bizpoll.oop.student;

public class StudentDTO {
	// 상태정보
	private String name; // 이름
	private String adress; // 주소
	private String pNum; // 핸드폰
	private String fm; // 성별
	private int age; // 나이
	private String admission; // 입학년도
	private String grade; // 학년

	// 디폴트 생성자
	public StudentDTO() {

	}

	// 매개변수 값을 받아 초기화하는 생성자
	public StudentDTO(String name, String adress, String pNum, int age, String admission, String grade, String fm) {
		super();
		this.name = name;
		this.adress = adress;
		this.pNum = pNum;
		this.age = age;
		this.admission = admission;
		this.grade = grade;
		this.fm = fm;
	}

	// getter && setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getpNum() {
		return pNum;
	}

	public void setpNum(String pNum) {
		this.pNum = pNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdmission() {
		return admission;
	}

	public void setAdmission(String admission) {
		this.admission = admission;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getFm() {
		return fm;
	}

	public void setFm(String fm) {
		this.fm = fm;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", adress=" + adress + ", pNum=" + pNum + ", age=" + age + ", admission="
				+ admission + ", grade=" + grade + ", fm=" + fm + "]";
	}

}
