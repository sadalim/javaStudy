package com.bizpoll.oop.interfaceex;

public class AirPlaneToyImpl implements IMissile, ILight {

	public AirPlaneToyImpl() {
		System.out.println("비행기 입니다.");
		canLight();
		canMissile();
		System.out.println("=================");
	}
	
	@Override
	public void canLight() {
		System.out.println("불빛 발사 가능합니다.");
		
	}

	@Override
	public void canMissile() {
		System.out.println("미사일 발사 가능합니다.");
		
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		
	}
	
}
