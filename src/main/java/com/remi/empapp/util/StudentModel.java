package com.remi.empapp.util;

public class StudentModel {
private Integer id;
private String name;
private String department;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "StudentModel [id=" + id + ", name=" + name + ", department=" + department + "]";
}

}
                          