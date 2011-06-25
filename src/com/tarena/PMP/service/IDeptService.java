package com.tarena.PMP.service;

import java.util.List;

import com.tarena.PMP.model.Dept;

public interface IDeptService {
	void addDept(Dept dept) throws Exception;
	void updateDept(Dept dept) throws Exception;
	void deleteDept(int id) throws Exception;
	Dept getDeptById(int id) throws Exception;
	List<Dept> getDeptList() throws Exception;
	
	Dept getDeptByCode(String code) throws Exception;
	Dept getDeptByName(String name) throws Exception;
}
