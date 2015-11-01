public class Aufgabe_2_1 {

	// main, used to test other methods
	public static void main (String[] args) {
		System.out.println("Das Quadrat von 5 ist: " + square(5));
		System.out.println("Die Zahl nach 5 ist: " + successor(5));
		System.out.print("Mit Eingabe 6 und 5 gilt: "); checkWarning(6, 5);
	}
	
	// returns square of the input double
	public static double square (double number) {
		return number*number;
	}

	// returns increment of the input integer
	public static int successor (int number) {
		return ++number;
	}

	// prints to the console if input integer1 >= integer2
	public static void checkWarning (int number1, int number2) {
		if (number1 >= number2) {
			System.out.println("Die erste Zahl ist größer als die zweite Zahl.");
		}
	}
}