package com.tarena.PMP.model;

import java.io.Serializable;

public class Title implements Serializable {

	private Integer id;
	
	private String code; //职位编码
	private String name; //职位名称
	private String description; //职位描述
	
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
	
	
}
