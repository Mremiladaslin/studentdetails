package com.remi.empapp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.remi.empapp.util.StudentModel;
import com.remi.empapp.util.StudentUtil;

public class StudentDAO{
	public void save(StudentModel student) {
JdbcTemplate jdbctemplate=StudentUtil.getJdbcTemplate();
		String sql = "insert into students(name,department) values(?,?)";
		Object[] params = { student.getName(), student.getDepartment() };
		int rows = jdbctemplate.update(sql, params);
		System.out.println("No of rows inserted: " + rows);

	
}
}