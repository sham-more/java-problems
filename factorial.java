
public class factorial {
	public static void main(String[] args) {
		int result = findFact();
		System.out.println(result);
	}

	public static int findFact() {
		int n = 5;
		int factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
}
