package com.demo.command;

/**
 * 버튼을 누르면 램프가 켜지는 동작
 * @author hsoo3
 * @date 20181017
 */
public class origin {
	public static class Lamp {
		public void turnOn() {
			System.out.println("Lamp On");
		}
	}
	
	public static class Button {
		private Lamp lamp;
		
		public Button(Lamp lamp) {
			this.lamp = lamp;
		}
		
		public void pressed() {
			lamp.turnOn();
		}
	}
	
	public static class Client {
		public static void main (String[] args) {
			Lamp lamp = new Lamp();
			Button button = new Button(lamp);
			button.pressed();
		}
	}
}
