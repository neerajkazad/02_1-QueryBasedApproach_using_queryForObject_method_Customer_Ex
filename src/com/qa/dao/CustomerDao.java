package com.qa.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDao {
	private final String SQL_COUNT_NO_OF_CUSTOMER ="select count(1) from customer";
	private final String SQL_FIND_FIRST_NM_OF_CUSTOMER_BY_MOBILE="select first_nm from customer where mobile = ?";
	
	private JdbcTemplate jdbcTemplate;

	public CustomerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int getCountNoOfCustomer() {
		return jdbcTemplate.queryForInt(SQL_COUNT_NO_OF_CUSTOMER);
	}
	
	public String findCustomerFirstName(String mobile) {
		return jdbcTemplate.queryForObject(SQL_FIND_FIRST_NM_OF_CUSTOMER_BY_MOBILE, String.class, new Object[]{mobile});
	}
}
