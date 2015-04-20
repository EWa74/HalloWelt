package de.java2enterprise.onlinebanking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Onlinebanking  
{
	public static void main(String[] args) 
	{
		try(
				BufferedReader	in 		= new BufferedReader(
						new FileReader("jdbc.properties"));
				BufferedWriter	out 	= new BufferedWriter(
						new FileWriter("kopie.properties"));
			) 
			{
				boolean anfang = true;
				String str;
				while((str = in.readLine()) != null)
				{
					if(anfang==true)
						anfang=false;
					else
						out.newLine();
					out.write(str);
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
	}
} 