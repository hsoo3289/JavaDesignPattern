package com.demo.strategy.modify;

import com.demo.strategy.modify.attack.MissileStrategy;
import com.demo.strategy.modify.attack.PunchStrategy;
import com.demo.strategy.modify.move.FlyingStrategy;
import com.demo.strategy.modify.move.WalkingStrategy;
import com.demo.strategy.modify.robot.Atom;
import com.demo.strategy.modify.robot.Robot;
import com.demo.strategy.modify.robot.TaekwonV;

public class Client {

	public static void main (String[] args) {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		taekwonV.setAttackStrategy(new MissileStrategy());
		taekwonV.setMovingStrategy(new WalkingStrategy());
		
		atom.setAttackStrategy(new PunchStrategy());
		atom.setMovingStrategy(new FlyingStrategy());
		
		taekwonV.showName();
		taekwonV.move();
		taekwonV.attack();
		
		atom.showName();
		atom.move();
		atom.attack();
		
	}
}
