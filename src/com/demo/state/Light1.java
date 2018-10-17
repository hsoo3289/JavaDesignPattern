package com.demo.state;
/**
 * 초기 상태
 * 버튼을 눌러 불을 켜고 끌 수 있음.
 * @author hsoo3
 * @since 20181016
 */
public class Light1 {
	private static final int ON = 0;
	private static final int OFF = 1;
	private int state;
	
	public Light1() {
		this.state = OFF;
	}
	
	public void onButtonPushed() {
		if (state == ON) {
			System.out.println("반응 없음");
		} else {
			System.out.println("불켜짐");
			state = ON;
		}
	}
	
	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("반응 없음");
		} else {
			System.out.println("불꺼짐");
			state = OFF;
		}
	}
	
	static class Client {
		public static void main(String[] args) {
			Light1 light = new Light1();
			light.offButtonPushed();
			light.onButtonPushed();
			light.offButtonPushed();
		}
	}
}
