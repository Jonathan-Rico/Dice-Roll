import java.util.Scanner;
public class Main {	
	public static void main(String args []) {		
		System.out.printf("Please type in the number of times you want the die to be rolled\n");
		Scanner input = new Scanner(System.in);
		int bounces = input.nextInt();		
		Dice dice = new Dice();
		System.out.printf("The die has been rolled %d times\nThe dice rolls are\n", bounces);
		
		for (int i = bounces; i>0; i--) {
			int y = dice.Throw(bounces);
			System.out.printf("%d\n", y);
			if (i == 1) {
				int value = dice.value(y , bounces);
				System.out.printf("The die has rolled an average value of %d", value);	
			}
		}
	}
}
