package com.tarena.PMP.service;

import java.util.List;

import com.tarena.PMP.model.RelDeptTitle;
import com.tarena.PMP.model.Title;

public interface IRelDeptTitleService {
	void addRDeptTitle(RelDeptTitle rDeptTitle) throws Exception;
	void updateRDeptTitle(RelDeptTitle rDeptTitle) throws Exception;
	void deleteRDeptTitle(int id) throws Exception;
	RelDeptTitle getRDeptTitleById(int id) throws Exception;
	List<RelDeptTitle> getRDeptTitleList() throws Exception;
	List<Title> getTitleByDeptId( Integer deptId) throws Exception;
}
