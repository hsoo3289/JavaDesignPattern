package com.demo.command;
/**
 * Command Pattern을 적용하여 정리
 * @author hsoo3
 * @date 20181017
 */
public class Solution {
	public static interface Command {
		public void execute();
	}
	
	public static class Button {
		private Command command;
		
		public Button(Command command) {
			setCommand(command);
		}

		private void setCommand(Command command) {
			this.command = command;
		}
		
		public void pressed() {
			command.execute();
		}
	}
	
	public static class Lamp {
		public void turnOn() {
			System.out.println("Lamp On");
		}
	}
	
	public static class LampOnCommand implements Command {
		private Lamp lamp;
		
		public LampOnCommand(Lamp lamp) {
			this.lamp = lamp;
		}

		@Override
		public void execute() {
			lamp.turnOn();
		}
	}
	
	public static class Alarm {
		public void start() {
			System.out.println("Alarming...");
		}
	}
	
	public static class AlarmCommand implements Command {
		private Alarm alarm;
		
		public AlarmCommand(Alarm alarm) {
			this.alarm = alarm;
		}

		@Override
		public void execute() {
			alarm.start();
		}
	}
	
	public static class Client {
		public static void main (String[] args) {
			Lamp lamp = new Lamp();
			Command lampOnCommand = new LampOnCommand(lamp);
			
			Button btn1 = new Button(lampOnCommand);
			btn1.pressed();
			
			Alarm alarm = new Alarm();
			AlarmCommand alarmCommand = new AlarmCommand(alarm);
			Button btn2 = new Button(alarmCommand);
			btn2.pressed();
			
		}
	}
}
