package com.hitrust.dsm.home;
// Generated 2017/8/10 �U�� 10:46:11 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hitrust.dsm.po.OrderStore;

/**
 * Home object for domain model class OrderStore.
 * @see com.hitrust.dsm.po.OrderStore
 * @author Hibernate Tools
 */
@Stateless
public class OrderStoreHome {

	private static final Log log = LogFactory.getLog(OrderStoreHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OrderStore transientInstance) {
		log.debug("persisting OrderStore instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OrderStore persistentInstance) {
		log.debug("removing OrderStore instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OrderStore merge(OrderStore detachedInstance) {
		log.debug("merging OrderStore instance");
		try {
			OrderStore result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OrderStore findById(String id) {
		log.debug("getting OrderStore instance with id: " + id);
		try {
			OrderStore instance = entityManager.find(OrderStore.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
