package com.tarena.pmp.common.controler;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.tarena.pmp.dept.model.Dept;
import com.tarena.pmp.dept.service.IDeptService;
import com.tarena.pmp.title.model.Title;
import com.tarena.pmp.title.service.ITitleService;

@Controller
@RequestMapping("/deptTitleSelectChange")
public class DeptTitleSelectChangeController {
	private ITitleService titleService;
	private IDeptService deptService;
	
	@RequestMapping(value="/deptAll")
	private ModelAndView deptAll() throws Exception{
		ModelMap modelMap = new ModelMap();
		List<Dept> deptList = deptService.getDeptList();
		modelMap.put("deptAll", deptList);
		return new ModelAndView(new MappingJacksonJsonView(), modelMap);
	}
	
	@RequestMapping(value="/titleSelectByDeptId/{deptId}")
	private ModelAndView titleSelectByDeptId(@PathVariable Integer deptId) throws Exception{
		ModelMap modelMap = new ModelMap();
		List<Title> titleList = titleService.getTitleByDeptId(deptId);
		modelMap.put("titlesInDept", titleList);
		return new ModelAndView(new MappingJacksonJsonView(),modelMap);
	}

	public IDeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(IDeptService deptService) {
		this.deptService = deptService;
	}

	public ITitleService getTitleService() {
		return titleService;
	}

	public void setTitleService(ITitleService titleService) {
		this.titleService = titleService;
	}
	
	
}
