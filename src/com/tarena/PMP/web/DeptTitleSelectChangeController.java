package com.tarena.PMP.web;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.tarena.PMP.model.Dept;
import com.tarena.PMP.model.Title;
import com.tarena.PMP.service.IDeptService;
import com.tarena.PMP.service.IRelDeptTitleService;

@Controller
@RequestMapping("/deptTitleSelectChange")
public class DeptTitleSelectChangeController {
	private IRelDeptTitleService relDeptTitleService;
	private IDeptService deptService;
	
	@RequestMapping(value="/deptAll")
	private ModelAndView deptAll() throws Exception{
		ModelMap modelMap = new ModelMap();
		List<Dept> deptList = deptService.getDeptList();
		modelMap.put("deptAll", deptList);
		return new ModelAndView(new MappingJacksonJsonView(), modelMap);
	}
	
	@RequestMapping(value="/titleSelectByDeptId/{deptId}")
	private ModelAndView deptSelect(@PathVariable Integer deptId) throws Exception{
		ModelMap modelMap = new ModelMap();
		List<Title> titleList = relDeptTitleService.getTitleByDeptId(deptId);
		modelMap.put("titlesInDept", titleList);
//		Iterator<Title> it = titleList.iterator();
//		while(it.hasNext()){
//			Title title = it.next();
//			modelMap.put(title.getId().toString(), title);
//		}
		return new ModelAndView(new MappingJacksonJsonView(),modelMap);
	}

	public IRelDeptTitleService getRelDeptTitleService() {
		return relDeptTitleService;
	}

	public void setRelDeptTitleService(IRelDeptTitleService relDeptTitleService) {
		this.relDeptTitleService = relDeptTitleService;
	}

	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}
	
	
}
