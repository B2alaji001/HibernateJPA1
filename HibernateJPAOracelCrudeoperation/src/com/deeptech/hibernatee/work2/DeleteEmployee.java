package com.deeptech.hibernatee.work2;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work2.utility.HibernateUtil;
import com.deeptech.hibernate.wwork2.dto.Employee;



public class DeleteEmployee {

	public static void main(String[] args) {


		SessionFactory sf=HibernateUtil.connect();
    	Session ses =sf.openSession();
    	ses.beginTransaction();
    	
    	Employee emp=ses.load(Employee.class, 1);
    	ses.delete(emp);
    	ses.getTransaction().commit();
    	ses.close();
    	sf.close();
    	System.out.println("Deleted sucessfully");


	}

}
