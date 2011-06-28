package com.tarena.pmp.dept.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.tarena.pmp.employee.model.Employee;
import com.tarena.pmp.title.model.Title;

/*
 * 模型 部门
 */
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "employees", "titles"})
public class Dept implements Serializable{
	 private Integer id;
	 private String code; //部门编号
	 private String name; //部门名
	 
	 private Set<Employee> employees = new HashSet<Employee>();
	 private Set<Title> titles = new HashSet<Title>();
	 
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

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}

	 
}