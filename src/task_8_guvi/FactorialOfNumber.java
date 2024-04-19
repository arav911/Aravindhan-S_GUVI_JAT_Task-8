package task_8_guvi;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial *= i;
		}
		System.out.println(factorial);

	}

}
