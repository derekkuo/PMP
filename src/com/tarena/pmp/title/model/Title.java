package com.tarena.pmp.title.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.tarena.pmp.dept.model.Dept;
import com.tarena.pmp.employee.model.Employee;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "employees"})  
public class Title implements Serializable {

	private Integer id;
	
	private String code; //职位编码
	private String name; //职位名称
	private String description; //职位描述
	private Integer turn;

	private Dept dept;
	private Set<Employee> employees = new HashSet<Employee>();
	
	public Title() {
	}

	public Title(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Integer getTurn() {
		return turn;
	}

	public void setTurn(Integer turn) {
		this.turn = turn;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	
}
