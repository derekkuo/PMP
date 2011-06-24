package com.tarena.PMP.model;

import java.util.HashSet;
import java.util.Set;

/*
 * 模型 部门
 */
public class Dept {
	 private Integer id;
	 private String code; //部门编号
	 private String name; //部门名
	 
	 private Set<Employee> employees = new HashSet<Employee>();
	 
	 private String description; //描述

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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	 
}