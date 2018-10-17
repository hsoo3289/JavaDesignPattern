package com.demo.state;
/**
 * 초기 상태에 취침등 기능을 추가
 * @author hsoo3
 * @since 20181016
 */
public class Light2 {
	private static final int ON = 0;
	private static final int OFF = 1;
	private static final int SLEEPING = 2;
	private int state;
	
	public Light2() {
		this.state = OFF;
	}
	
	public void onButtonPushed() {
		if (state == ON) {
			System.out.println("취침등");
			state = SLEEPING;
		} else if(state == SLEEPING) {
			System.out.println("켜짐");
			state = ON;
		} else {
			System.out.println("불켜짐");
			state = ON;
		}
	}
	
	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("반응 없음");
		} else if (state==SLEEPING) {
			System.out.println("불꺼짐");
			state = OFF;
		} else {
			System.out.println("불꺼짐");
			state = OFF;
		}
	}
	
	static class Client {
		public static void main(String[] args) {
			Light2 light = new Light2();
			light.offButtonPushed();
			light.onButtonPushed();
			light.offButtonPushed();
			light.onButtonPushed();
			light.onButtonPushed();
			
		}
	}
}
