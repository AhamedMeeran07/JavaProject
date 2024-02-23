package com.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    //	Alien student1=null; for get
    	
    	AlienName aname=new AlienName();
    	aname.setFname("ahamed");
    	aname.setLname("meeran");
    	aname.setMname("ks");

    	Alien student1=new Alien();
    	student1.setRollNo(2);
    	student1.setStudentName(aname);    	
    	student1.setMark(96);
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	session.save(student1);
    	
    	//student1=session.get(Alien.class,1); for get
    	
    	tx.commit();
    	
    	System.out.println(student1);
    }
}
