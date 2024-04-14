package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee r);

	public void updateEmployee(Employee r,int myID);

	public List<Employee> listEmployees();

	public Employee getEmployeeById(int id);

	public void removeEmployee(int id);
}
