package com.demo.singleton.origin;

/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * Static��ü�� ����Ͽ� ��ü�� ���� �� �����Ͽ� ���� �� �� �ִ�
 */
public class UserStaticPattern {

	private String name;
	
	public UserStaticPattern (String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name+" print using "+ printer.toString()+".");
		
	}
	
	public static class Printer {
		private static Printer printer = null;
		private Printer() {
		}
		
		private static Printer getPrinter() {
			if (printer == null) {
				printer = new Printer();
			}
			return printer;
		}
		
		public void print(String str) {
			System.out.println(str);
		}
	}
	
	public static class Main {
		private static final int USER_NUM=5;
		
		public static void main(String[] args) {
			UserStaticPattern[] users = new UserStaticPattern[USER_NUM];
			for (int i=0; i < USER_NUM; i++) {
				users[i] = new UserStaticPattern("user"+i);
				users[i].print();
			}
		}
	}
}
