package com.demo.singleton.origin;
/**
 * 
 * @author hsoo3
 * @since 2018.10.16
 * Static���� ���� ���� ������ �ʿ� ����� ���ۿ� ������ �߻������� �ʾ�����,
 * ���¸� ���� �ؾ��ϴ� ���� ������ �߻� �� �� �ִ�.
 */
public class UserStaticPatternProblem2 {
	private static UserStaticPatternProblem2 printer = null;
	private int counter = 0;
	
	public static UserStaticPatternProblem2 getPrinter() {
		if (printer == null ) printer = new UserStaticPatternProblem2();
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return UserStaticPatternProblem2.printer;
	}
	
	public void print(String str) {
		counter++;
		System.out.println(str + counter);
	}
	
	public static class Main {
		public static void main(String[] args) {
			for (int i = 0; i < 5; i++) {
				new Thread() {
					@Override
					public void run() {
						UserStaticPatternProblem2.getPrinter().print("thread-");
					}
					
				}.start();
			}
		}
	}
	
}
