package com.tarena.PMP.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.PMP.dao.IEmployeeDao;
import com.tarena.PMP.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends HibernateDaoSupport implements IEmployeeDao{
	private static final Logger log = LoggerFactory
	.getLogger(EmployeeDaoImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#save(com.tarena.PMP.model.Employee)
	 */
	public void save(Employee transientInstance) {
		log.debug("saving Employee instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#delete(com.tarena.PMP.model.Employee)
	 */
	public void delete(Employee persistentInstance) {
		log.debug("deleting Employee instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findById(java.lang.Integer)
	 */
	public Employee findById(java.lang.Integer id) {
		log.debug("getting Employee instance with id: " + id);
		try {
			Employee instance = (Employee) getSession().get(
					"com.tarena.PMP.model.Employee", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByExample(com.tarena.PMP.model.
	 * Employee)
	 */
	public List findByExample(Employee instance) {
		log.debug("finding Employee instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
//			List results = getSession()
//					.createCriteria("com.tarena.PMP.model.Employee")
//					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByProperty(java.lang.String,
	 * java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Employee instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Employee as model where model."
					+ propertyName + "= ?";
//			Query queryObject = getSession().createQuery(queryString);
//			queryObject.setParameter(0, value);
//			return queryObject.list();
			
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByLoginName(java.lang.Object)
	 */
	public List findByLoginName(Object loginName) {
		return findByProperty(LOGIN_NAME, loginName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByPassword(java.lang.Object)
	 */
	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByName(java.lang.Object)
	 */
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByGender(java.lang.Object)
	 */
	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByPlaceOfBirth(java.lang.Object)
	 */
	public List findByPlaceOfBirth(Object placeOfBirth) {
		return findByProperty(PLACE_OF_BIRTH, placeOfBirth);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByNativeProvince(java.lang.Object)
	 */
	public List findByNativeProvince(Object nativeProvince) {
		return findByProperty(NATIVE_PROVINCE, nativeProvince);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByEthnicGroup(java.lang.Object)
	 */
	public List findByEthnicGroup(Object ethnicGroup) {
		return findByProperty(ETHNIC_GROUP, ethnicGroup);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByIdNumber(java.lang.Object)
	 */
	public List findByIdNumber(Object idNumber) {
		return findByProperty(ID_NUMBER, idNumber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByMobilePhone(java.lang.Object)
	 */
	public List findByMobilePhone(Object mobilePhone) {
		return findByProperty(MOBILE_PHONE, mobilePhone);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByPersonalEmail(java.lang.Object)
	 */
	public List findByPersonalEmail(Object personalEmail) {
		return findByProperty(PERSONAL_EMAIL, personalEmail);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByQq(java.lang.Object)
	 */
	public List findByQq(Object qq) {
		return findByProperty(QQ, qq);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByMsn(java.lang.Object)
	 */
	public List findByMsn(Object msn) {
		return findByProperty(MSN, msn);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByGraduatedUniversity(java.lang
	 * .Object)
	 */
	public List findByGraduatedUniversity(Object graduatedUniversity) {
		return findByProperty(GRADUATED_UNIVERSITY, graduatedUniversity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByEducationalBackground(java.lang
	 * .Object)
	 */
	public List findByEducationalBackground(Object educationalBackground) {
		return findByProperty(EDUCATIONAL_BACKGROUND, educationalBackground);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByWorkingExperience(java.lang.Object
	 * )
	 */
	public List findByWorkingExperience(Object workingExperience) {
		return findByProperty(WORKING_EXPERIENCE, workingExperience);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByEmployeeNo(java.lang.Object)
	 */
	public List findByEmployeeNo(Object employeeNo) {
		return findByProperty(EMPLOYEE_NO, employeeNo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findByHasLeft(java.lang.Object)
	 */
	public List findByHasLeft(Object hasLeft) {
		return findByProperty(HAS_LEFT, hasLeft);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByOfficePhone(java.lang.Object)
	 */
	public List findByOfficePhone(Object officePhone) {
		return findByProperty(OFFICE_PHONE, officePhone);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#findByOfficeEmail(java.lang.Object)
	 */
	public List findByOfficeEmail(Object officeEmail) {
		return findByProperty(OFFICE_EMAIL, officeEmail);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IEmployeeDao#findAll()
	 */
	public List findAll() {
		log.debug("finding all Employee instances");
		try {
			String queryString = "from Employee";
//			Query queryObject = getSession().createQuery(queryString);
//			return queryObject.list();
			
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#merge(com.tarena.PMP.model.Employee)
	 */
	public Employee merge(Employee detachedInstance) {
		log.debug("merging Employee instance");
		try {
			Employee result = (Employee) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#attachDirty(com.tarena.PMP.model.Employee
	 * )
	 */
	public void attachDirty(Employee instance) {
		log.debug("attaching dirty Employee instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.model.IEmployeeDao#attachClean(com.tarena.PMP.model.Employee
	 * )
	 */
	public void attachClean(Employee instance) {
		log.debug("attaching clean Employee instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
