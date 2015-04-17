package de.java2enterprise.onlinebanking;

import java.util.function.Consumer;

public class Onlinebanking 
{

	public static void main(String[] args) 
	{
		Consumer<String> c= Printer::new;
		c.accept("Hallo Welt");
	}
} 