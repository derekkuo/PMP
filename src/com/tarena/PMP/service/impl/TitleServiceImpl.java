package com.tarena.PMP.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarena.PMP.dao.ITitleDao;
import com.tarena.PMP.model.Title;
import com.tarena.PMP.service.ITitleService;

@Service("titleService")
public class TitleServiceImpl implements ITitleService {

	ITitleDao titleDao;
	
	public ITitleDao getTitleDao() {
		return titleDao;
	}

	public void setTitleDao(ITitleDao titleDao) {
		this.titleDao = titleDao;
	}

	@Override
	public void addTitle(Title title) throws Exception {
		titleDao.save(title);
	}

	@Override
	public void updateTitle(Title title) throws Exception {
		titleDao.merge(title);
	}

	@Override
	public void deleteTitle(int id) throws Exception {
		titleDao.delete(titleDao.findById(id));
	}

	@Override
	public Title getTitleById(int id) throws Exception {
		return titleDao.findById(id);
	}

	@Override
	public List<Title> getTitleList() throws Exception {
		return titleDao.findAll();
	}

	@Override
	public Title getTitleByCode(String code) throws Exception {
		List list = titleDao.findByCode(code);
		return list==null || list.size() == 0 ? null : (Title)list.get(0);
	}

	@Override
	public Title getTitleByName(String name) throws Exception {
		List list = titleDao.findByCode(name);
		return list==null || list.size() == 0 ? null : (Title)list.get(0);
	}
}
