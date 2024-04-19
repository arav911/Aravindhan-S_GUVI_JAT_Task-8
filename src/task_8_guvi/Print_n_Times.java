package task_8_guvi;

import java.util.Scanner;

public class Print_n_Times {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String msg = input.nextLine();
		int times = input.nextInt();
		for(int i=1; i<=times; i++) {
			System.out.println(msg);
		}

	}

}
