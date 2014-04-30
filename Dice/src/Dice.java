public class Dice {
	public int Throw(int bounces) {
	int x =	(int) (1 + Math.random() * 6);
	int average = (x * bounces)/(bounces);
	return average;
	}
	public int value () {
	return average;	
	}
}
