package com.bizpoll.oop.interfaceex;

public class InterfaceClass implements InterfaceEx2, InterfaceEx1{

	@Override
	public void calculate() {
		System.out.println("실제 구현은 여기에서 해요.");
	}

	@Override
	public String getStr() {
		System.out.println("실제 구현은 여기에서 해요.");
		return null;
	}

}
