//package com.jd.dbutils;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.stereotype.Component;
//
//import com.jd.domain.User;
//
//@Component
//public class MySessionFactory {
//
//	private static SessionFactory factory; 
//
//	static {
//		if(factory==null)
//		{
//			factory = new Configuration().configure("hibernate.cfg.xml")
//					.addAnnotatedClass(User.class)
//					.buildSessionFactory();
//			System.out.println("session factory initialized");
//		}
//	}
//
//	public static Session getSession() {
//		return factory.openSession();
//	}
//
//}
