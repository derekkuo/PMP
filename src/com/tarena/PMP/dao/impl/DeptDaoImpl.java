package com.tarena.PMP.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.PMP.dao.IDeptDao;
import com.tarena.PMP.model.Dept;

@Repository("deptDao")
public class DeptDaoImpl extends HibernateDaoSupport implements IDeptDao{
	private static final Logger log = LoggerFactory.getLogger(DeptDaoImpl.class);
	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#save(com.tarena.PMP.model.Dept)
	 */
	public void save(Dept transientInstance) {
		log.debug("saving Dept instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#delete(com.tarena.PMP.model.Dept)
	 */
	public void delete(Dept persistentInstance) {
		log.debug("deleting Dept instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findById(java.lang.Integer)
	 */
	public Dept findById(java.lang.Integer id) {
		log.debug("getting Dept instance with id: " + id);
		try {
			Dept instance = (Dept) getSession().get(
					"com.tarena.PMP.model.Dept", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findByExample(com.tarena.PMP.model.Dept)
	 */
	public List findByExample(Dept instance) {
		log.debug("finding Dept instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
//			List results = getSession().createCriteria(
//					"com.tarena.PMP.model.Dept").add(Example.create(instance))
//					.list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Dept instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dept as model where model."
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

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findByCode(java.lang.Object)
	 */
	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findByName(java.lang.Object)
	 */
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findByDescription(java.lang.Object)
	 */
	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Dept instances");
		try {
			String queryString = "from Dept";
//			Query queryObject = getSession().createQuery(queryString);
//			return queryObject.list();
			
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#merge(com.tarena.PMP.model.Dept)
	 */
	public Dept merge(Dept detachedInstance) {
		log.debug("merging Dept instance");
		try {
			Dept result = (Dept) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#attachDirty(com.tarena.PMP.model.Dept)
	 */
	public void attachDirty(Dept instance) {
		log.debug("attaching dirty Dept instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.PMP.dao.IDeptDAO#attachClean(com.tarena.PMP.model.Dept)
	 */
	public void attachClean(Dept instance) {
		log.debug("attaching clean Dept instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

}
