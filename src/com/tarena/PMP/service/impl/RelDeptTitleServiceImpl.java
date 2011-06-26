package com.tarena.PMP.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarena.PMP.dao.IRelDeptTitleDao;
import com.tarena.PMP.model.RelDeptTitle;
import com.tarena.PMP.model.Title;
import com.tarena.PMP.service.IRelDeptTitleService;

@Service("relDeptTitleService")
public class RelDeptTitleServiceImpl implements IRelDeptTitleService{

	private IRelDeptTitleDao relDeptTitleDao;
	
	public IRelDeptTitleDao getRelDeptTitleDao() {
		return relDeptTitleDao;
	}

	public void setRelDeptTitleDao(IRelDeptTitleDao iRelDeptTitleDao) {
		this.relDeptTitleDao = iRelDeptTitleDao;
	}

	@Override
	public void addRDeptTitle(RelDeptTitle rDeptTitle) throws Exception {
		relDeptTitleDao.save(rDeptTitle);

	}

	@Override
	public void updateRDeptTitle(RelDeptTitle rDeptTitle) throws Exception {
		relDeptTitleDao.merge(rDeptTitle);

	}

	@Override
	public void deleteRDeptTitle(int id) throws Exception {
		relDeptTitleDao.delete(relDeptTitleDao.findById(id));

	}

	@Override
	public RelDeptTitle getRDeptTitleById(int id) throws Exception {
		return relDeptTitleDao.findById(id);
	}

	@Override
	public List<RelDeptTitle> getRDeptTitleList() throws Exception {
		return relDeptTitleDao.findAll();
	}

	@Override
	public List<Title> getTitleByDeptId(Integer deptId) throws Exception {
		return relDeptTitleDao.findTitleByDeptId(deptId);
	}

}
