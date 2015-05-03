package de.java2enterprise.onlinebanking.view;

import java.awt.Dimension;

import javax.swing.JButton;

public class MyButton extends JButton 
{
	public MyButton(String text)
	{
		setPreferredSize(new Dimension(100, 25));
		setText(text);
		setActionCommand(text);
	}

}
