package application;

import java.util.Scanner;

public class StartingPage {

	public static void getList() {
		// Items which are available
		String a[] = { "Rice", "Diary Milk", "Soap", "Sun Feast", "Dark Fantasy" };
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(i + 1 + " " + a[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to online Foody slot");
		System.out.println("Choose the BEST which you need");

		// we are using Scanner key to give user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 0 To Known The Slot Availablitys");
		int num = scanner.nextInt();
		if (num == 0) {

			getList();

		} else {
			System.out.println("input incorrect please choose the correct number");

		}

	}
}
