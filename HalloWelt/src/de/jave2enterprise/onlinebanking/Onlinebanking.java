package de.jave2enterprise.onlinebanking;

      
public class Onlinebanking {

	public static void main(String[] args) {
		CalculatorInterface calc = new CalculatorInterface() {

			@Override
			public int add(int a, int b) {
				return a+b;
			}
		};	
		int c = calc.add(123, 456);
		System.out.println(c);
	}
}
