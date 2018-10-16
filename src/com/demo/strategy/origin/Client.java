package com.demo.strategy.origin;

/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * �κ��� ������ �߰� �ϱ�� ���쳪 move method�� �����ϰ��� �Ҷ� �ڵ忡 ���� ��� �Ѵ�.
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
