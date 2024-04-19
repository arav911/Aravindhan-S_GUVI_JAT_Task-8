package task_8_guvi;

import java.util.Scanner;

public class CheckSeniorCitizenOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		if(age >= 60) {
			System.out.println("Senior Citizen");
		}
		else {
			System.out.println("Not a Senior Citizen");
		}

	}

}
