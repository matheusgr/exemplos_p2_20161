package solucao;

public class E2_Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fib(6));
	}

	private static int fib(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		return fib(i - 1) + fib(i - 2);
	}
}