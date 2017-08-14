package com.hitrust.dsm.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
		return metadata.buildSessionFactory();
		
//		Configuration cfg = new Configuration().configure();
//		return cfg.buildSessionFactory();
		
//		Configuration cfg = new Configuration().configure();
//		return cfg.buildSessionFactory(new StandardServiceRegistryBuilder().build());
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
}
