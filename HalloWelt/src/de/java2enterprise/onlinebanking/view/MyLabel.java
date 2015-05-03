package de.java2enterprise.onlinebanking.view;

import java.awt.Dimension;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
	public MyLabel(String text)
	{
		setPreferredSize(new Dimension(100, 25));
		setText(text);
	}

}
