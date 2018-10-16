package com.demo.singleton.origin;

/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * ������ static object�� multi thread ȯ�濡�� (��������) �߰� ��ü�� ����� �� �� �ִ�.
 *
 */

public class UserStaticPatternProblem extends Thread {
	
	public UserStaticPatternProblem (String name) {
		super(name);
	}

	@Override
	public void run() {
		Printer printer = Printer.getPrinter();
		printer.print(Thread.currentThread().getName()+" print using "+printer.toString());
		
	}
	
	public static class Printer {
		
		private static Printer printer;
		public static Printer getPrinter() {
			if (printer == null ) {
				try {
					Thread.sleep(1);
				} catch (Exception e){
					e.printStackTrace();
				}
				printer = new Printer();
			}
			return printer;
		}
		
		public void print(String str) {
			System.out.println(str);
		}
	}
	
	public static class Client {
		private static final int THREAD_NUM=5;
		public static void main(String[] args) {
			for (int i = 0; i<THREAD_NUM; i++) {
				new UserStaticPatternProblem("Thread-"+i).start();
			}
		}
	}
	
}
