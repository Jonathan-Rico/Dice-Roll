public class Dice {	
	public int Throw(int bounces) {	
		int x =	(int) (1 + Math.random() * 6);
		return x;
		}
	public int value (int avg, int bounces) {
		int average = (avg)/(bounces);
		return average;	
	}
}
