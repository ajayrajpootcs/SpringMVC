package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee r);

	public void updateEmployee(Employee r,int myID);

	public List<Employee> listEmployees();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);
}
