package com.tarena.PMP.service;

import java.util.List;

import com.tarena.PMP.model.Title;

public interface ITitleService {
	void addTitle(Title title) throws Exception;
	void updateTitle(Title title) throws Exception;
	void deleteTitle(int id) throws Exception;
	Title getTitleById(int id) throws Exception;
	List<Title> getTitleList() throws Exception;
	
	Title getTitleByCode(String code) throws Exception;
	Title getTitleByName(String name) throws Exception;
}
