package com.hitrust.dsm.home;
// Generated 2017/8/10 �U�� 10:46:11 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hitrust.dsm.po.DrinkStore;

/**
 * Home object for domain model class DrinkStore.
 * @see com.hitrust.dsm.po.DrinkStore
 * @author Hibernate Tools
 */
@Stateless
public class DrinkStoreHome {

	private static final Log log = LogFactory.getLog(DrinkStoreHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DrinkStore transientInstance) {
		log.debug("persisting DrinkStore instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DrinkStore persistentInstance) {
		log.debug("removing DrinkStore instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DrinkStore merge(DrinkStore detachedInstance) {
		log.debug("merging DrinkStore instance");
		try {
			DrinkStore result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DrinkStore findById(String id) {
		log.debug("getting DrinkStore instance with id: " + id);
		try {
			DrinkStore instance = entityManager.find(DrinkStore.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
