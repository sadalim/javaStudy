package com.bizpoll.oop.interfaceex;

public class ToyMain{
	
	public static void main(String[] args) {

		IToy pooh = new PoohToyImpl();
//		IMoveArmLeg pooh1 = new PoohToyImpl();
//		ILight airplane = new AirPlaneToyImpl();
//		
		IToy airplane = new AirPlaneToyImpl();
		IToy mazinger = new MazingerToyImpl();
		
		IToy[] toys = {pooh, airplane, mazinger};
		
//		for (int i = 0; i < toys.length; i++) {
//			toys[i].canLight();
//		}
		
	}
}
