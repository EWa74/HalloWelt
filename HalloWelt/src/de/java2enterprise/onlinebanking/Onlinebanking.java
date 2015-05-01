package de.java2enterprise.onlinebanking;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


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
		/* Anonyme Klasse mit WindowAdapter: */
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent event)
			{
				dispose();
			}
		});	
	}
} 