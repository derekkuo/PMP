package com.tarena.pmp.title.dao.impl;

import java.util.List;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.pmp.title.dao.ITitleDao;
import com.tarena.pmp.title.model.Title;

@Repository("titleDao")
public class TitleDaoImpl extends HibernateDaoSupport implements ITitleDao{
	private static final Logger log = LoggerFactory.getLogger(TitleDaoImpl.class);
	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#save(com.tarena.pmp.model.Title)
	 */
	public void save(Title transientInstance) {
		log.debug("saving Title instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#delete(com.tarena.pmp.model.Title)
	 */
	public void delete(Title persistentInstance) {
		log.debug("deleting Title instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findById(java.lang.Integer)
	 */
	public Title findById(java.lang.Integer id) {
		log.debug("getting Title instance with id: " + id);
		try {
			Title instance = (Title) getSession().get(
					"com.tarena.pmp.employee.model.Title", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findByExample(com.tarena.pmp.model.Title)
	 */
	public List findByExample(Title instance) {
		log.debug("finding Title instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Title instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Title as model where model."
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
	 * @see com.tarena.pmp.dao.ITitleDAO#findByCode(java.lang.Object)
	 */
	public List findByCode(Object code) {
		return findByProperty(CODE, code);
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findByName(java.lang.Object)
	 */
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findByDescription(java.lang.Object)
	 */
	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#findAll()
	 */
	public List findAll() {
		log.debug("finding all Title instances");
		try {
			String queryString = "from Title";
//			Query queryObject = getSession().createQuery(queryString);
//			return queryObject.list();
			
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#merge(com.tarena.pmp.model.Title)
	 */
	public Title merge(Title detachedInstance) {
		log.debug("merging Title instance");
		try {
			Title result = (Title) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#attachDirty(com.tarena.pmp.model.Title)
	 */
	public void attachDirty(Title instance) {
		log.debug("attaching dirty Title instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see com.tarena.pmp.dao.ITitleDAO#attachClean(com.tarena.pmp.model.Title)
	 */
	public void attachClean(Title instance) {
		log.debug("attaching clean Title instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public List findByDeptId(Integer deptId) {
		log.debug("findByDeptId");
		try {
			String queryString = "select title from Title title" +
					" where title.dept.id=" + deptId +
					" order by title.turn desc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find title by deptid failed", re);
			throw re;
		}
		
	}

}
