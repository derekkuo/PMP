package com.tarena.pmp.employee.service;

import java.util.List;

import com.tarena.pmp.employee.model.Employee;


public interface IEmployeeService {
	void addEmployee(Employee employee) throws Exception;
	void updateEmployee(Employee employee) throws Exception;
	void deleteEmployee(int id) throws Exception;
	Employee getEmployeeById(int id) throws Exception;
	List<Employee> getEmployeeList() throws Exception;
	Employee getEmployeeByName(String name) throws Exception;
	Employee getEmployeeByLoginName(String loginName) throws Exception;
}