package com.demo.strategy.modify.move;

public class FlyingStrategy implements MovingStrategy{

	@Override
	public void move() {
		System.out.println("I can fly.");
	}

}
