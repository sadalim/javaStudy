package com.bizpoll.oop.interfaceex;

public class BPhoneImpl implements IFunction {

	@Override
	public void callSenderReceive() {
		System.out.println("가능 합니다.");
	}

	@Override
	public void canLte() {
		System.out.println("가능 합니다. 4G입니다.");
	}

	@Override
	public void tvRemoteController() {
		System.out.println("탑재 되어 있습니다.");
	}

}
