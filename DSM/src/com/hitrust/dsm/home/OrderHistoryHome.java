package com.hitrust.dsm.home;
// Generated 2017/8/10 �U�� 10:46:11 by Hibernate Tools 5.2.3.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hitrust.dsm.po.OrderHistory;

/**
 * Home object for domain model class OrderHistory.
 * @see com.hitrust.dsm.po.OrderHistory
 * @author Hibernate Tools
 */
@Stateless
public class OrderHistoryHome {

	private static final Log log = LogFactory.getLog(OrderHistoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(OrderHistory transientInstance) {
		log.debug("persisting OrderHistory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(OrderHistory persistentInstance) {
		log.debug("removing OrderHistory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public OrderHistory merge(OrderHistory detachedInstance) {
		log.debug("merging OrderHistory instance");
		try {
			OrderHistory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OrderHistory findById(String id) {
		log.debug("getting OrderHistory instance with id: " + id);
		try {
			OrderHistory instance = entityManager.find(OrderHistory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
