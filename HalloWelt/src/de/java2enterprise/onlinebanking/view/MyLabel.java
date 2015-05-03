package de.java2enterprise.onlinebanking.view;

import java.awt.Dimension;
import java.awt.Label;

public class MyLabel extends Label {
	public MyLabel(String text)
	{
		setPreferredSize(new Dimension(100, 25));
		setText(text);
	}

}
