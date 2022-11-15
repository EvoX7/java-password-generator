package org.fizzbuzz.italy;

public class FizzBuzzGenerator {

	public static void main(String[] args) {

		for (int numbers = 1; numbers <= 100; numbers++) {

			boolean FizzBuzz = (numbers % 15 == 0);
			boolean Buzz = (numbers % 5 == 0);
			boolean Fizz = (numbers % 3 == 0);

			if (FizzBuzz == true) {
				System.out.println("FizzBuzz");
			}

			else if (Fizz == true) {
				System.out.println("Fizz");
			}

			else if (Buzz == true) {
				System.out.println("Buzz");
			}

			else {
				System.out.println(numbers);
			}
		}

	}
}
