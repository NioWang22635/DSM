package com.hitrust.dsm.home;
// Generated 2017/8/10 �U�� 10:46:11 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hitrust.dsm.po.DrinkMenu;
import com.hitrust.dsm.po.DrinkMenuId;

/**
 * Home object for domain model class DrinkMenu.
 * @see com.hitrust.dsm.po.DrinkMenu
 * @author Hibernate Tools
 */
@Stateless
public class DrinkMenuHome {

	private static final Log log = LogFactory.getLog(DrinkMenuHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrinkMenu transientInstance) {
		log.debug("persisting DrinkMenu instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrinkMenu persistentInstance) {
		log.debug("removing DrinkMenu instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrinkMenu merge(DrinkMenu detachedInstance) {
		log.debug("merging DrinkMenu instance");
		try {
			DrinkMenu result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrinkMenu findById(DrinkMenuId id) {
		log.debug("getting DrinkMenu instance with id: " + id);
		try {
			DrinkMenu instance = entityManager.find(DrinkMenu.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
