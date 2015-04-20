package de.java2enterprise.onlinebanking;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class Onlinebanking  
{
	public static void main(String[] args) throws IOException 
	{
		FileSystem fs = FileSystems.getDefault();
		Path dir = fs.getPath("d:/workspace");
		for(Path path : Files.newDirectoryStream(dir))
		{
			System.out.println
			(
					(Files.isDirectory(path) ? "d" : "-")  +
					(Files.isReadable(path)  ? "r" : "-")  +
					(Files.isWritable(path) ? "w" : "-")  +
					(Files.isExecutable(path) ? "e" : "-")  +
					(Files.isHidden(path) ? "h" : "-")  +
					(Files.getOwner(path).getName()) + "\t " +
					(Files.getLastModifiedTime(path)) + "\t " +
					(path.getName(path.getNameCount()-1)) + "\t " 
			);
		}
	}
} 