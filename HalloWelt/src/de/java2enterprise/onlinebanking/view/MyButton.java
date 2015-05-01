package de.java2enterprise.onlinebanking.view;

import java.awt.Button;

public class MyButton extends Button 
{
	public MyButton(int x, int y, String text)
	{
		setLocation(x,y);
		setSize(100,25);
		setLabel(text);
		setActionCommand(text);
	}

}
