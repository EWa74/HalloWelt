package de.java2enterprise.onlinebanking;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


public class Onlinebanking  extends Frame
{
	public static void main(String[] args) throws Exception 
	{
		/* Treiber in die Laufzeit integrieren: */
		/* Beachte: den Dienst mysqld vom command window ("DOS-Fenster") aus starten */
		new Onlinebanking();
	}
		
	public Onlinebanking()
	{
		setSize(400, 300);
		setLocation(200, 200);
		setTitle("Onlinebanking");
		setVisible(true);
		
		Image image = Toolkit.getDefaultToolkit().getImage("onlinebanking.jpg");
		setIconImage(image);
		
		setForeground(Color.WHITE);
		setBackground(Color.DARK_GRAY);
		setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
		
		try{ Thread.sleep(2000);} catch(InterruptedException e){};
		dispose();	 
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("Hallo Kunde", 100, 100);
	}
	
} 