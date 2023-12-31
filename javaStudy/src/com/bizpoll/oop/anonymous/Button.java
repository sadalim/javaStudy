package com.bizpoll.oop.anonymous;

public class Button {

	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener{
		
		void onClick();
		
	}
	
}
