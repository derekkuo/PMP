package com.tarena.pmp.employee.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fsj.spring.model.TUser;
import com.tarena.pmp.employee.dao.IEmployeeDao;
import com.tarena.pmp.employee.model.Employee;
import com.tarena.pmp.employee.service.IEmployeeService;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

	private IEmployeeDao employeeDao;
	
	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(IEmployeeDao iEmployeeDao) {
		this.employeeDao = iEmployeeDao;
	}

	@Override
	public void addEmployee(Employee employee) throws Exception {
		employeeDao.save(employee);

	}

	@Override
	public void updateEmployee(Employee employee) throws Exception {
		employeeDao.merge(employee);

	}

	@Override
	public void deleteEmployee(int id) throws Exception {
		employeeDao.delete(employeeDao.findById(id));

	}

	@Override
	public Employee getEmployeeById(int id) throws Exception {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> getEmployeeList() throws Exception {
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployeeByName(String name) throws Exception {
		List list = employeeDao.findByName(name);
		return list==null || list.size() == 0 ? null : (Employee)list.get(0);
	}
	
	@Override
	public Employee getEmployeeByLoginName(String loginName) throws Exception {
		List list = employeeDao.findByLoginName(loginName);
		return list==null || list.size() == 0 ? null : (Employee)list.get(0);
	}
}