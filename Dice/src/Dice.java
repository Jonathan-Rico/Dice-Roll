public class Dice {	
	public int Throw(int bounces) {	
		int x =	(int) (1 + Math.random() * 6);
		return x;
		}
	public int value(int bounces) {
		int x =	(int) (1 + Math.random() * 6);
		int average = (x * bounces)/(bounces);
		return average;	
	}
}
