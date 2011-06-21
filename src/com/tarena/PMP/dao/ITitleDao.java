package com.tarena.PMP.dao;


import java.util.List;

import com.tarena.PMP.model.Title;

public interface ITitleDao {

	// property constants
	public static final String CODE = "code";
	public static final String NAME = "name";
	public static final String DESCRIPTION = "description";

	public abstract void save(Title transientInstance);

	public abstract void delete(Title persistentInstance);

	public abstract Title findById(java.lang.Integer id);

	public abstract List findByExample(Title instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByCode(Object code);

	public abstract List findByName(Object name);

	public abstract List findByDescription(Object description);

	public abstract List findAll();

	public abstract Title merge(Title detachedInstance);

	public abstract void attachDirty(Title instance);

	public abstract void attachClean(Title instance);

}