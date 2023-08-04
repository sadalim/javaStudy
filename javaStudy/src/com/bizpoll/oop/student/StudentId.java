package com.bizpoll.oop.student;

public class StudentId {
public static void main(String[] args) {
	for (int i = 0; i < 10000; i++) {
		System.out.println(String.format("%04d", i));
	}
}
}
