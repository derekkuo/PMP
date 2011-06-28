package com.tarena.pmp.dept.dao;


import java.util.List;

import com.tarena.pmp.dept.model.Dept;

public interface IDeptDao {

	// property constants
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";

	public abstract void save(Dept transientInstance);

	public abstract void delete(Dept persistentInstance);

	public abstract Dept findById(java.lang.Integer id);

	public abstract List findByExample(Dept instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCode(Object code);

	public abstract List findByName(Object name);

	public abstract List findByDescription(Object description);

	public abstract List findAll();

	public abstract Dept merge(Dept detachedInstance);

	public abstract void attachDirty(Dept instance);

	public abstract void attachClean(Dept instance);

}