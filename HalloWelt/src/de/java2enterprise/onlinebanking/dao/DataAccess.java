package de.java2enterprise.onlinebanking.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataAccess 
{
	public static MysqlDataSource dataSource;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		if(dataSource==null)
		{
			dataSource = new MysqlDataSource();
		}
		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));
		dataSource.setUrl(props.getProperty("url"));
		dataSource.setUser(props.getProperty("username"));
		dataSource.setPassword(props.getProperty("password"));
		return dataSource.getConnection();
	}

}
