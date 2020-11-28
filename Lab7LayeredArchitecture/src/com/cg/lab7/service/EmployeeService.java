package com.cg.lab7.service;

import java.util.List;

import com.cg.lab7.bean.Employee;
import com.cg.exception.EmployeeException;

public interface EmployeeService {
	public Integer addEmployee(Employee employee) throws EmployeeException;
	public Integer deleteEmployee(Integer empid) throws EmployeeException;
	public List<Employee> 
	getEmployeesByInsuranceScheme(String insuranceScheme) 
			throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
	public static List<EmployeeService> getEmployeesByInsuranceScheme(InsuranceScheme scheme) {
		// TODO Auto-generated method stub
		return null;
	}
}
