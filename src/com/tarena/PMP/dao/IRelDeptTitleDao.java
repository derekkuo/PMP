package com.tarena.PMP.dao;

import java.util.List;

import com.tarena.PMP.model.RelDeptTitle;

public interface IRelDeptTitleDao {
	public abstract void save(RelDeptTitle transientInstance);

	public abstract void delete(RelDeptTitle persistentInstance);

	public abstract RelDeptTitle findById(java.lang.Integer id);

	public abstract List findByExample(RelDeptTitle instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findAll();

	public abstract RelDeptTitle merge(RelDeptTitle detachedInstance);

	public abstract void attachDirty(RelDeptTitle instance);

	public abstract void attachClean(RelDeptTitle instance);

	public abstract List findTitleByDeptId(Integer deptId);
}
