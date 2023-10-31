package com.deeptech.hibernatee.work2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.wwork2.dto.Employee;
import com.deeptech.hibernate.work2.utility.HibernateUtil;



public class CreateEmployee {

    public static void main(String[] args) {
        
        Employee e = new Employee();
        
        e.setEmpname("Anil");
        e.setState("Karnataka");
        e.setAge(20);
        e.setMobilenum("9591456958");
        e.setSalary(50000);
        
        SessionFactory sf = HibernateUtil.connect();
        
        Session ses = sf.openSession();
        ses.beginTransaction();
        
        ses.save(e);
        ses.getTransaction().commit();
        
        
        System.out.println("Record is inserted");
        ses.close();
        sf.close();
        
    }
}