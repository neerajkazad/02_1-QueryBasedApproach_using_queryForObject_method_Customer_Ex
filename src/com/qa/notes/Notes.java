package com.qa.notes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;


public class Notes {
	/**
	 * In this example we are using Aggregate Function(Count,Max,Min,Sum,Avg) to perform the operation.
	 * So we are using queryForInt() method.
	 * In this example we are writing the sql query on the top of the class it self and make it final.
	 * This is the Best Practice that comes from JEE not from Spring.
	 * Ex:
	 * private final String SQL_COUNT_NO_OF_CUSTOMER="select count(1) from customer";
	 * 
	 * so in Real-Time application we are writing the query like that only.
	 * So all the query which we are going to use in our class write on the top of the class it self
	 * and make it final, because we don't want to change it.
	 * 
	 * queryForInt() method is deprecated from Spirng 3.3.x .
	 * 
	 * Internal:
	 * What happens when we call 
	 * 
	 * jdbcTemplate.queryForInt(sql);
	 * 
	 * see the notes
	 * 
	 * 
	 */
	
	
}
