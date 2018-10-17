package com.demo.command;
/**
 * 버튼 동착에 기능 추가 Lamp On, Alarm
 * @author hsoo3
 *
 */
public class Try {
	public static class Lamp {
		public void turnOn() {
			System.out.println("Lamp On");
		}
	}
	
	public static class Alarm {
		public void start() {
			System.out.println("Alarming...");
		}
	}
	
	enum Mode { LAMP, ALARM };
	
	public static class Button {
		private Lamp lamp;
		private Alarm alarm;
		private Mode mode;
		
		public Button(Lamp lamp, Alarm alarm) {
			this.lamp = lamp;
			this.alarm = alarm;
		}
		
		public void setMode(Mode mode) {
			this.mode = mode;
		}
		
		public void pressed() {
			switch(mode) {
			case LAMP: lamp.turnOn(); break;
			case ALARM: alarm.start(); break;
			}
		}
	}
	
	public static class Client {
		public static void main (String[] args) {
			Lamp lamp = new Lamp();
			Alarm alarm = new Alarm();
			Button button = new Button(lamp, alarm);
			
			button.setMode(Mode.ALARM);
			button.pressed();
			
			button.setMode(Mode.LAMP);
			button.pressed();
		}
	}
}
