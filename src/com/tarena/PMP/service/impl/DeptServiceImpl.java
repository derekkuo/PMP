package com.tarena.PMP.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarena.PMP.dao.IDeptDao;
import com.tarena.PMP.model.Dept;
import com.tarena.PMP.service.IDeptService;

@Service("deptService")
public class DeptServiceImpl implements IDeptService {

	IDeptDao deptDao;
	
	public IDeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(IDeptDao deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public void addDept(Dept dept) throws Exception {
		deptDao.save(dept);
	}

	@Override
	public void updateDept(Dept dept) throws Exception {
		deptDao.merge(dept);
	}

	@Override
	public void deleteDept(int id) throws Exception {
		deptDao.delete(deptDao.findById(id));
	}

	@Override
	public Dept getDeptById(int id) throws Exception {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> getDeptList() throws Exception {
		return deptDao.findAll();
	}

	@Override
	public Dept getDeptByCode(String code) throws Exception {
		List list = deptDao.findByCode(code);
		return list==null || list.size() == 0 ? null : (Dept)list.get(0);
	}

	@Override
	public Dept getDeptByName(String name) throws Exception {
		List list = deptDao.findByCode(name);
		return list==null || list.size() == 0 ? null : (Dept)list.get(0);
	}
}
