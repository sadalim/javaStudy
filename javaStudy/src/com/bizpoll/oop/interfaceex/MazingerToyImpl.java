package com.bizpoll.oop.interfaceex;

public class MazingerToyImpl implements IMissile, IMoveArmLeg {

	 public MazingerToyImpl() {
		 System.out.println("마징가 입니다.");
			canMoveArmLeg();
			canMissile();
			System.out.println("=================");
	}
	
	@Override
	public void canMoveArmLeg() {
		System.out.println("팔다리를 움직입 수 있습니다.");
	}

	@Override
	public void canMissile() {
		System.out.println("미사일을 움직입 수 있습니다.");
	}

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		
	}

}
