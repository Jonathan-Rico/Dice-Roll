import java.util.Scanner;
public class Main {
	public static void main(String args []) {
		System.out.printf("Please type in the number of times you want the die to be rolled\n");
		int bounces = input.nextint();
		System.out.printf("The die has been rolled %d times", bounces);
		Dice dice = new Dice();
		int x = dice.Throw();
		int value = dice.value();
		System.out.printf("The die has rolled an average value of %d", value);
	}
}
