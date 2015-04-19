package de.java2enterprise.onlinebanking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Onlinebanking  
{
	public static void main(String[] args) 
	{
		try(
				InputStream		in 		= new FileInputStream("java8.jpg");
				OutputStream	out 	= new FileOutputStream("kopie.jpg");
			) 
			{
				int c;
				while((c = in.read()) != -1)
				{
					out.write(c);
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
	}
} 