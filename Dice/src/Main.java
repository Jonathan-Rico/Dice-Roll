public class Main {
	public static void main(String args []) {
	Dice dice = new Dice();
	int x = dice.Throw();
	int value = dice.value();
	System.out.printf("The die has rolled a value of %d", value);
	}
}
