package de.java2enterprise.onlinebanking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import de.java2enterprise.onlinebanking.model.kunde.GeschäftsKunde;
import de.java2enterprise.onlinebanking.model.kunde.Kunde;


public class Onlinebanking  
{
	public static void main(String[] args) throws Exception 
	{
		Kunde kunde1 = new GeschäftsKunde(123);
		ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream("kunde.ser"));
		out.writeObject(kunde1);
		out.close();
		
		ObjectInputStream in =
				new ObjectInputStream(new FileInputStream("kunde.ser"));
		Object obj = in.readObject();
		if(obj instanceof Kunde)
		{
			Kunde kunde2 = (Kunde) obj;
			System.out.println(kunde2);
		}		
		in.close();
	}
} 