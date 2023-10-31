package com.deeptech.hibernatee.work2;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.deeptech.hibernate.work2.utility.HibernateUtil;
import com.deeptech.hibernate.wwork2.dto.Employee;



public class ReadEmployee {

	public static void main(String[] args) {


		SessionFactory sf=HibernateUtil.connect();
    	Session ses=sf.openSession();
    	ses.beginTransaction();
    	
    	Query q=ses.createQuery("from Employee");
    	List<Employee>ls=q.list();
    	for(Employee emp:ls)
		{
			System.out.println(emp.getEmpname()+"\t"+emp.getEmail()+"\t"+emp.getAge()+"\t"+emp.getMobilenum()+"\t"+emp.getSalary()+"\t"+emp.getState());
		}
        ses.getTransaction().commit();
    			

	}

}
