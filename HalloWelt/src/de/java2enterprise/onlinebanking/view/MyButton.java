package de.java2enterprise.onlinebanking.view;

import java.awt.Button;
import java.awt.Dimension;

public class MyButton extends Button 
{
	public MyButton(String text)
	{
		setPreferredSize(new Dimension(100, 25));
		setLabel(text);
		setActionCommand(text);
	}

}
