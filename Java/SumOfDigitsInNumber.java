

public class SumOfDigitsInNumber {
	public static void main(String[] args) {

		// sum =0;
		// remainder
		// sum + remainder
		// delete last num

		System.out.println("===== Sum of digits in number =====");

		int Result = SumOfDigits();
		System.out.println(Result);

	}

	public static int SumOfDigits() {

		int n = 1234;

		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		return sum;

	}

}
