package com.tarena.PMP.model;

import java.io.Serializable;

public class RelDeptTitle implements Serializable{

	private Integer id;
	private Dept dept;
	private Title title;

	// Constructors

	/** default constructor */
	public RelDeptTitle() {
	}

	/** full constructor */
	public RelDeptTitle(Dept dept, Title title) {
		this.dept = dept;
		this.title = title;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	
}
