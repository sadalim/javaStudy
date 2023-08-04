package com.bizpoll.oop.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	private static Scanner sc;

	public static void main(String[] args) {
		StudentDAO sDao = new StudentDAO(null);
		sc = new Scanner(System.in);

		List<StudentDTO> sList = new ArrayList<>();
		List<String> sSearch = new ArrayList<>();
		List<String> sNum = new ArrayList<>();
		List<String> sImfor = new ArrayList<>();

		int cnt = 0;

		while (true) {
			System.out.println("원하시는 메뉴를 고르세요.");
			System.out.println("1. 학생 정보 등록.");
			System.out.println("2. 학생 목록 표시.");
			System.out.println("3. 학생 목록 검색.");
			System.out.println("4. 학생 정보 검색.");
			System.out.println("5. 시스템 종료.");

			String menuNum = sc.nextLine();

			if (menuNum.equals("1")) {

				System.out.println("이름을 입력해주세요.");
				String name = sc.nextLine();
				System.out.println("주소을 입력해주세요.");
				String adress = sc.nextLine();
				System.out.println("핸드폰 번호 8자리를 입력해주세요.");
				System.out.print("010)");
				while (true) {
					String pNum = sc.nextLine();
					if (pNum.length() != 7) {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					} else {
						System.out.println("나이를 입력해주세요.");
						int age = sc.nextInt();
						System.out.println("입학년도 4자리를 입력해주세요.");
						sc.nextLine();
						while (true) {
							String admission = sc.nextLine();
							if (admission.length() != 3) {
								System.out.println("잘못 입력하셨습니다.");
								continue;
							} else {
								System.out.println("학년을 입력해주세요.");
								String grade = sc.nextLine();
								System.out.println("성별을 입력해주세요.");
								String fm = sc.nextLine();
								StudentDTO sDto = new StudentDTO(name, adress, pNum, age, admission, grade, fm);
								sList.add(sDto);
								break;
							}
						}
						break;
					}
				}

				if (cnt < 10) {
					sNum.add(sList.get(cnt).getAdmission() + "000" + (Integer) (cnt + 1));
				} else if (cnt < 100) {
					sNum.add(sList.get(cnt).getAdmission() + "00" + (Integer) (cnt + 1));
				} else if (cnt < 1000) {
					sNum.add(sList.get(cnt).getAdmission() + "0" + (Integer) (cnt + 1));
				} else if (cnt < 10000) {
					sNum.add(sList.get(cnt).getAdmission() + "" + (Integer) (cnt + 1));
				} else {
					System.out.println("저장공간이 부족합니다. 전문가에게 연락하세요.");
				}

				cnt++;

			} // 학생 등록 종료
			else if (menuNum.equals("2")) { // 학생 목록

				sDao.studentList(sList, sNum);

			} // 학생 목록 종료
			else if (menuNum.equals("3")) { // 학생 검색

				System.out.println("학생 이름을 검색 해주세요.");
				String search = sc.nextLine();
				String[] sh = search.split(",");

				for (int i = 0; i < sh.length; i++) {
					String sch = sh[i];
					sSearch.add(sch);
				}
				sDao.studentSearch(sList, sSearch, sNum);
				sSearch.clear();

			} // 학생 검색 종료
			else if (menuNum.equals("4")) { // 학생 정보

				System.out.println("학생 이름을 입력해주세요.");
				String schName = sc.nextLine();
				System.out.println("학생 번호를 입력해주세요.");
				String schStuNum = sc.nextLine();

				sImfor.add(schName);
				sImfor.add(schStuNum);

				sDao.studentImfor(sList, sImfor, sNum);
				sImfor.clear();

			} // 시스템 종료
			else if (menuNum.equals("5")) { // 학생 정보

				System.out.println("시스템을 종료합니다.");
				break;

			} // 시스템 종료
			else {
				System.out.println("메뉴를 올바르게 선택 해주세요.");
			}
		}

	}
}
