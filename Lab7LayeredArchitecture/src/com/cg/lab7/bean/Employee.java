package com.cg.lab7.bean;

import java.time.LocalDate;
import java.util.List;

import com.cg.dao.EmployeeDAO;
import com.cg.lab7.service.*;

public class Employee implements EmployeeDAO {

	private Integer empid;
	private String ename;
	private Double salary;
	private Designation designation;
	private InsuranceScheme insuranceScheme;
	
	public Employee() {
		
	}

	public Employee(Integer empid, String ename, Double salary, Designation designation,
			InsuranceScheme insuranceScheme) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public InsuranceScheme getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(InsuranceScheme insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

	@Override
	public Integer addEmployee(Employee employee) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteEmployee(Integer empid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByInsuranceScheme(InsuranceScheme insuranceScheme) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
