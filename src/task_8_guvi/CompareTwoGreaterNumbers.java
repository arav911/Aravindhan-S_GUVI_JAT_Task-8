package task_8_guvi;

import java.util.Scanner;

public class CompareTwoGreaterNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 'a': ");
		int a = input.nextInt();
		System.out.print("Enter number 'b': ");
		int b = input.nextInt();
		System.out.print("Enter number 'c': ");
		int c = input.nextInt();
		System.out.print("Enter number 'd': ");
		int d = input.nextInt();
		
		if((a+b) > (c+d)) {
			System.out.println("Sum of "+a+" and "+b+" is greater than sum of "+c+" and "+d);
		}
		else {
			System.out.println("Sum of "+c+" and "+d+" is greater than sum of "+a+" and "+b);
		}

	}

}
