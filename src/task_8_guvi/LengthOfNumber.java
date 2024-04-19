package task_8_guvi;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int number = input.nextInt();
		int temp = number;
		int count = 0;
		while(number != 0) {
			count++;
			number /= 10;
		}
		System.out.println(temp + " has " + count + " digits in it");

	}

}
