package com.bizpoll.oop;

public class StoreNum1 extends HeadQarterStore {
	public StoreNum1() {
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("4,500원 입니다.");
	}
	
	@Override
	public void orderBudaejjige() {
		System.out.println("5,000원 입니다.");
	}
	
	@Override
	public void orderBiBimbap() {
		System.out.println("판매하지 않습니다.");
	}
}
