package com.bizpoll.oop.interfaceex;

public class PoohToyImpl implements IMoveArmLeg {

	public PoohToyImpl() {
		System.out.println("곰돌이 입니다.");
		canMoveArmLeg();
		System.out.println("=================");
	}
	
	@Override
	public void canMoveArmLeg() {
	System.out.println("팔다리를 움직일 수 있습니다.");
		
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		
	}

}
