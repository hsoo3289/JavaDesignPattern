package com.demo.state;
/**
 * �ʱ� ����
 * ��ư�� ���� ���� �Ѱ� �� �� ����.
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
			System.out.println("���� ����");
		} else {
			System.out.println("������");
			state = ON;
		}
	}
	
	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("���� ����");
		} else {
			System.out.println("�Ҳ���");
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
