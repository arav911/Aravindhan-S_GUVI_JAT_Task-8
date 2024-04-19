package task_8_guvi;

import java.util.Scanner;

public class OddOrEvenNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		if(number%2 == 0) {
			System.out.println(number + " is an EVEN number");
		} else {
			System.out.println(number + " is an ODD number");
		}

	}

}
