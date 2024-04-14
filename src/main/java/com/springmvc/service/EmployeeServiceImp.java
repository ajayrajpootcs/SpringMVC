package com.springmvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.dao.EmployeeDao;
import com.springmvc.dao.EmployeeDaoImp;
import com.springmvc.model.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService {
	
	EmployeeDao employeeDAO;
	
	public void setEmployeeDAO(EmployeeDao employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	
	
	@Override
	public void addEmployee(Employee r) {
		employeeDAO.addEmployee(r);
		
	}

	@Override
	public void updateEmployee(Employee r,int myID) {
		employeeDAO.updateEmployee(r,myID);
		
	}

	@Override
	public List<Employee> listEmployees() {
		
		return employeeDAO.listEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public void removeEmployee(int id) {
		
		employeeDAO.removeEmployee(id);
		
	}

}
