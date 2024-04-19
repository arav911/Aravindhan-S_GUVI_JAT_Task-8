package task_8_guvi;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String msg = input.nextLine();
		System.out.println("The length of the String '"+msg+"' is: "+msg.length());		

	}

}
