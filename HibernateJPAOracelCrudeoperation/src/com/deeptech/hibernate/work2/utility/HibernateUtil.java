package com.deeptech.hibernate.work2.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
    public static SessionFactory sessionfactory;
    
    static 
    {
    	sessionfactory = new Configuration().configure().buildSessionFactory();
    }
    
    public static SessionFactory connect()
    {
    	return sessionfactory;
    }
}
