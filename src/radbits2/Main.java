package radbits2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cut new_cut = new Cut();
		Bit new_bit = new Bit();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter desired cut radius: ");
		new_cut.setRadius(userInput.nextFloat());
		System.out.print("Enter desired cut depth: ");
		new_cut.setDepth(userInput.nextFloat());
		System.out
				.print("Enter allowed maring of error (0.01 will be used if no value is entered): ");
		new_cut.setError(userInput.nextFloat());
		new_cut.setSin_of_min_angle(Calculations.sin_of_min_angle(
				new_cut.getRadius(), new_cut.getDepth(), new_cut.getError()));
		System.out.print(new_cut.getSin_of_min_angle());
	}

}
