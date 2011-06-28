package com.tarena.pmp.title.service;

import java.util.List;

import com.tarena.pmp.title.model.Title;

public interface ITitleService {
	void addTitle(Title title) throws Exception;
	void updateTitle(Title title) throws Exception;
	void deleteTitle(int id) throws Exception;
	Title getTitleById(int id) throws Exception;
	List<Title> getTitleList() throws Exception;
	
	Title getTitleByCode(String code) throws Exception;
	Title getTitleByName(String name) throws Exception;
	List<Title> getTitleByDeptId( int deptId ) throws Exception;
}
