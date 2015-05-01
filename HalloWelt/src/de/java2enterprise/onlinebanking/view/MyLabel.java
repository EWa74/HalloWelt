package de.java2enterprise.onlinebanking.view;

import java.awt.Label;

public class MyLabel extends Label {
	public MyLabel(int x, int y, String text)
	{
		setLocation(x,y);
		setSize(100,25);
		setText(text);
	}

}
