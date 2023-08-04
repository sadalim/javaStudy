package com.bizpoll.oop.interfaceex;

public class CPhoneImpl implements IFunction {

	@Override
	public void callSenderReceive() {
		System.out.println("가능 합니다.");
	}

	@Override
	public void canLte() {
		System.out.println("불가능 합니다. 3G입니다.");
	}

	@Override
	public void tvRemoteController() {
		System.out.println("탑재 되어 있습니다.");
	}

}
