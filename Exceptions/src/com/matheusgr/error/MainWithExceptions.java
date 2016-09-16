package com.matheusgr.error;

public class MainWithExceptions {

	public void testThrows() throws Exception {
		throw new RuntimeException();
	}

	public void test() {
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		MainWithExceptions main = new MainWithExceptions();
		try {
			main.testThrows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		main.test();
	}
	
}
