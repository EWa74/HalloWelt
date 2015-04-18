package de.java2enterprise.onlinebanking;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Onlinebanking  
{

	public static void main(String[] args) 
	{
		int start = LocalDate.now().getYear()+1;
		Builder<LocalDate> builder = Stream.builder();
		for (int i = start; i< start+10; i++)
		{
			builder.add(LocalDate.of(i,  Month.JULY, 8));
		}
		builder
			.build()
			.forEach(
					date -> System.out.println
						(
							date.format(DateTimeFormatter.ofPattern("yyyy: EEEE"))
						)
					);
	}
} 