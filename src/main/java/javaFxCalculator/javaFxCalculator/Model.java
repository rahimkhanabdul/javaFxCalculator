package javaFxCalculator.javaFxCalculator;

public class Model {
	public float calculate(long num_1, long num_2, String operator) {
		switch (operator) {
		case "/":
			if(num_2==0)
				return 0;
			return num_1 / num_2;
		case "*":
			return num_1 * num_2;
		case "-":
			return num_1 - num_2;
		case "+":
			return num_1 + num_2;
		default:
			return 0;
		}
	}
}
