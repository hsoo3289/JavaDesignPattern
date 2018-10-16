package com.demo.strategy.modify.robot;

import com.demo.strategy.modify.attack.AttackStrategy;
import com.demo.strategy.modify.move.MovingStrategy;

public abstract class Robot {
	private String name;
	private MovingStrategy movingStrategy;
	private AttackStrategy attackStrategy;
	
	Robot (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void showName() {
		System.out.println("My name is "+this.name+".");
	}
	
	public void move() {
		movingStrategy.move();
	}
	
	public void attack() {
		attackStrategy.attack();
	}
	
	public void setMovingStrategy(MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	
	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
