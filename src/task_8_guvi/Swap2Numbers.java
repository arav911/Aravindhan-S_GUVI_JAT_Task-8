package task_8_guvi;

import java.util.Scanner;

public class Swap2Numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int number1 = input.nextInt();
		System.out.print("Enter Second Number: ");
		int number2 = input.nextInt();
		int temp;
		
		System.out.println("Numbers before swapping: "+number1+" and "+number2);
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("Numbers after swapping: "+number1+" and "+number2);
		

	}

}
