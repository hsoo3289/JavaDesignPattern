package com.demo.strategy.origin;

/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * 로봇의 종류를 추가 하기는 쉬우나 move method를 변경하고자 할때 코드에 손을 대야 한다.
 */
public class Client {
	public static void main(String[] args) {
		Robot tv = new Robot.TaekwonV("TV");
		Robot atom = new Robot.Atom("Atom");
		
		System.out.println("My name is "+tv.getName());
		tv.move();
		tv.attack();
		
		System.out.println();
		
		System.out.println("My name is "+atom.getName());
		atom.move();
		atom.attack();
	}
}
