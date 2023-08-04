package com.bizpoll.oop.interfaceex;

public class PhoneMain {
	public static void main(String[] args) {
//		APhoneImpl aPhone = new APhoneImpl();
//		BPhoneImpl bPhone = new BPhoneImpl();
//		CPhoneImpl cPhone = new CPhoneImpl();
		
		// 다형성 사용
		IFunction aPhone = new APhoneImpl();
		IFunction bPhone = new BPhoneImpl();
		IFunction cPhone = new CPhoneImpl();
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone};
		
		for (int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("===================");
		}
	}
}
