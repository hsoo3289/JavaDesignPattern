package com.demo.strategy.origin;

public abstract class Robot {
	private String name;
	public Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void attack();
	public abstract void move();
	
	static public class TaekwonV extends Robot {

		public TaekwonV(String name) {
			super(name);
		}

		@Override
		public void attack() {
			System.out.println("I have Missile and can attack with it.");
		}

		@Override
		public void move() {
			System.out.println("I can only walk.");
		}
		
	}
	
	static public class Atom extends Robot {

		public Atom(String name) {
			super(name);
		}

		@Override
		public void attack() {
			System.out.println("I have strong punch and can attack with it.");
		}

		@Override
		public void move() {
			System.out.println("I can fly.");
		}
	}
}


