package com.kennyxie.jdbc;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws SQLException {
	 ApplicationContext contex=new ClassPathXmlApplicationContext("bean-properties.xml");
		DataSource dataSource=(DataSource)contex.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
}
