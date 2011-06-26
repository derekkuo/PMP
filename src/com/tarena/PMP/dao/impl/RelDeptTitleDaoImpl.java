package com.tarena.PMP.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.PMP.dao.IRelDeptTitleDao;
import com.tarena.PMP.dao.ITitleDao;
import com.tarena.PMP.model.RelDeptTitle;

@Repository("relDeptTitleDao")
public class RelDeptTitleDaoImpl extends HibernateDaoSupport implements IRelDeptTitleDao {

	private static final Logger log = LoggerFactory
			.getLogger(RelDeptTitleDaoImpl.class);

	// property constants

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tarena.PMP.dao.IRDeptTitleDao#save(com.tarena.PMP.model.RDeptTitle)
	 */
	public void save(RelDeptTitle transientInstance) {
		log.debug("saving RDeptTitle instance");
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
	 * com.tarena.PMP.dao.IRDeptTitleDao#delete(com.tarena.PMP.model.RDeptTitle)
	 */
	public void delete(RelDeptTitle persistentInstance) {
		log.debug("deleting RDeptTitle instance");
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
	 * @see com.tarena.PMP.model.IRDeptTitle#findById(java.lang.Integer)
	 */
	public RelDeptTitle findById(java.lang.Integer id) {
		log.debug("getting RDeptTitle instance with id: " + id);
		try {
			RelDeptTitle instance = (RelDeptTitle) getSession().get(
					"com.tarena.PMP.model.RDeptTitle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tarena.PMP.model.IRDeptTitle#findByExample(com.tarena.PMP.model.
	 * RDeptTitle)
	 */
	public List findByExample(RelDeptTitle instance) {
		log.debug("finding RDeptTitle instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
//			List results = getSession()
//					.createCriteria("com.tarena.PMP.model.RDeptTitle")
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
	 * @see com.tarena.PMP.model.IRDeptTitle#findByProperty(java.lang.String,
	 * java.lang.Object)
	 */
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding RDeptTitle instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from RDeptTitle as model where model."
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
	 * @see com.tarena.PMP.model.IRDeptTitle#findAll()
	 */
	public List findAll() {
		log.debug("finding all RDeptTitle instances");
		try {
			String queryString = "from RDeptTitle";
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
	 * com.tarena.PMP.dao.IRDeptTitleDao#merge(com.tarena.PMP.model.RDeptTitle)
	 */
	public RelDeptTitle merge(RelDeptTitle detachedInstance) {
		log.debug("merging RDeptTitle instance");
		try {
			RelDeptTitle result = (RelDeptTitle) getSession().merge(
					detachedInstance);
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
	 * com.tarena.PMP.dao.IRDeptTitleDao#attachDirty(com.tarena.PMP.model.RDeptTitle
	 * )
	 */
	public void attachDirty(RelDeptTitle instance) {
		log.debug("attaching dirty RDeptTitle instance");
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
	 * com.tarena.PMP.dao.IRDeptTitleDao#attachClean(com.tarena.PMP.model.RDeptTitle
	 * )
	 */
	public void attachClean(RelDeptTitle instance) {
		log.debug("attaching clean RDeptTitle instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@Override
	public List findTitleByDeptId(Integer deptId) {
		log.debug("findTitleByDeptId");
		try {
			String queryString = "select title from Title title,RelDeptTitle rdt " +
					"where rdt.dept.id=" + deptId +
					" and rdt.title.id=title.id" +
					" order by title.turn desc";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find title by deptid failed", re);
			throw re;
		}

	}
}
