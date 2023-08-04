package com.bizpoll.oop.student;

import java.util.List;

public class StudentDAO {

	// 학생 목록
	public void studentList(List<StudentDTO> sList, List<String> sNum) {
		System.out.println("학생 목록입니다.(학번, 이름)");
		System.out.println("===================================");

		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sNum.get(i) + "\t" + sList.get(i).getName());
		}
		System.out.println("===================================");

	}

	// 학생 검색

	public StudentDAO(String[] strings) {
		// TODO Auto-generated constructor stub
	}

	public void studentSearch(List<StudentDTO> sList, List<String> sSearch, List<String> sNum) {
		System.out.println("검색 결과입니다.(학번, 이름)");
		System.out.println("===================================");
		for (int i = 0; i < sSearch.size(); i++) {
			for (int k = 0; k < sList.size(); k++) {
				try {

					if (sSearch.get(i).contains(sList.get(k).getName())) {

						System.out.println(sNum.get(k) + "\t" + sList.get(k).getName());

					} else {
						continue;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("===================================");

	}

	// 학생 정보

	public void studentImfor(List<StudentDTO> sList, List<String> sImfor, List<String> sNum) {
		System.out.println("검색 결과입니다.(학번, 이름, 나이, 주소, 핸드폰, 성별, 입학년도, 나이)");
		System.out.println("===================================");
		for (int k = 0; k < sList.size(); k++) {
			try {

				if (sImfor.get(0).equals(sList.get(k).getName())) {

					if (sImfor.get(1).equals(sNum.get(k))) {

						System.out.println(sNum.get(k) + "\t" + sList.get(k).getName() + "\t" + sList.get(k).getAge()
								+ "\t" + sList.get(k).getAdress() + "\t" + sList.get(k).getpNum() + "\t"
								+ sList.get(k).getFm() + "\t" + sList.get(k).getAdmission() + "\t"
								+ sList.get(k).getGrade());

					} else {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}

				} else {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("===================================");

	}

}
