package com.tarena.PMP.dao;

import java.util.List;

import com.tarena.PMP.model.Employee;

public interface IEmployeeDao {

	// property constants
	public static final String LOGIN_NAME = "loginName";
	public static final String PASSWORD = "password";
	public static final String NAME = "name";
	public static final String GENDER = "gender";
	public static final String PLACE_OF_BIRTH = "placeOfBirth";
	public static final String NATIVE_PROVINCE = "nativeProvince";
	public static final String ETHNIC_GROUP = "ethnicGroup";
	public static final String ID_NUMBER = "idNumber";
	public static final String MOBILE_PHONE = "mobilePhone";
	public static final String PERSONAL_EMAIL = "personalEmail";
	public static final String QQ = "qq";
	public static final String MSN = "msn";
	public static final String GRADUATED_UNIVERSITY = "graduatedUniversity";
	public static final String EDUCATIONAL_BACKGROUND = "educationalBackground";
	public static final String WORKING_EXPERIENCE = "workingExperience";
	public static final String EMPLOYEE_NO = "employeeNo";
	public static final String HAS_LEFT = "hasLeft";
	public static final String OFFICE_PHONE = "officePhone";
	public static final String OFFICE_EMAIL = "officeEmail";

	public abstract void save(Employee transientInstance);

	public abstract void delete(Employee persistentInstance);

	public abstract Employee findById(java.lang.Integer id);

	public abstract List findByExample(Employee instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByLoginName(Object loginName);

	public abstract List findByPassword(Object password);

	public abstract List findByName(Object name);

	public abstract List findByGender(Object gender);

	public abstract List findByPlaceOfBirth(Object placeOfBirth);

	public abstract List findByNativeProvince(Object nativeProvince);

	public abstract List findByEthnicGroup(Object ethnicGroup);

	public abstract List findByIdNumber(Object idNumber);

	public abstract List findByMobilePhone(Object mobilePhone);

	public abstract List findByPersonalEmail(Object personalEmail);

	public abstract List findByQq(Object qq);

	public abstract List findByMsn(Object msn);

	public abstract List findByGraduatedUniversity(Object graduatedUniversity);

	public abstract List findByEducationalBackground(
			Object educationalBackground);

	public abstract List findByWorkingExperience(Object workingExperience);

	public abstract List findByEmployeeNo(Object employeeNo);

	public abstract List findByHasLeft(Object hasLeft);

	public abstract List findByOfficePhone(Object officePhone);

	public abstract List findByOfficeEmail(Object officeEmail);

	public abstract List findAll();

	public abstract Employee merge(Employee detachedInstance);

	public abstract void attachDirty(Employee instance);

	public abstract void attachClean(Employee instance);

}
