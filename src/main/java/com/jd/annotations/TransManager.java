package com.jd.annotations;


import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jd.dbutils.MySessionFactory;

@Interceptor
@TransMgmt
public class TransManager {
	
	@Autowired
	MySessionFactory sf;

	@AroundInvoke
	public Object handleTransaction(InvocationContext context) throws Throwable {
		Session session=null;
		Transaction tx = null;
		try {
			System.out.println("in around invoke");
			session = sf.buildSessionFactory().openSession();
			tx = session.beginTransaction();
			return context.proceed();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
			throw e;
		} finally {
			tx.commit();
			session.close();
			System.out.println("finally executed");
		}
	}
}
