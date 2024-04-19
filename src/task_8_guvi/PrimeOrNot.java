package task_8_guvi;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = input.nextInt();
		int prime = 0;
		for(int i=2; i<=number; i++) {
			if(number%i == 0) {
				prime++;
			}
		}
		if(prime <= 1) {
			System.out.println(number + " is a PRIME number");
		} else {
			System.out.println(number + " is NOT a PRIME number");
		}

	}

}
