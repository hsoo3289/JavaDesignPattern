package com.demo.state;
/**
 * �ʱ� ���¿� ��ħ�� ����� �߰�
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
			System.out.println("��ħ��");
			state = SLEEPING;
		} else if(state == SLEEPING) {
			System.out.println("����");
			state = ON;
		} else {
			System.out.println("������");
			state = ON;
		}
	}
	
	public void offButtonPushed() {
		if (state == OFF) {
			System.out.println("���� ����");
		} else if (state==SLEEPING) {
			System.out.println("�Ҳ���");
			state = OFF;
		} else {
			System.out.println("�Ҳ���");
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
