package com.remi.empapp.test;

import com.remi.empapp.dao.StudentDAO;
import com.remi.empapp.util.StudentModel;

public class TestDao {

	public static void main(String[] args) {
		StudentModel studentdao=new StudentModel();
		studentdao.setId(1);
		studentdao.setName("Remi");
		studentdao.setDepartment("CIVIL");
		StudentDAO stu=new StudentDAO();
		stu.save(studentdao);
		
	}

}
