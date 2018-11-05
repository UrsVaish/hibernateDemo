package com.teamsankya.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	public App(){

	}
    public static void main( String[] args )
    {
    	UserDTO dto=new UserDTO();
    	dto.setUid(1);
    	dto.setName("vaish");
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
    	Session sess=sf.openSession();
    	sess.beginTransaction();
    	sess.save(dto);
    	sess.getTransaction().commit();
    }
}
