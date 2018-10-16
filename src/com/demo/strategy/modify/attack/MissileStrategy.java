package com.demo.strategy.modify.attack;

public class MissileStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have missile and I can attack with it.");
		
	}

}
