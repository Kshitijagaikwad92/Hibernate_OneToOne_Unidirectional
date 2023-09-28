package com.hibernatepractical.Customer1_Product1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )   //main line
    {
        System.out.println( "Project Started" );
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        // creating the session factory
        SessionFactory factory=cfg.buildSessionFactory();
        
        //creating the object of Customer 
        Customer c1=new Customer(); 
        c1.setCust_id(101);
        c1.setCname("Namrata");
        c1.setCcity("Pune");
        c1.setCphone("9632587410");
        
        //creating the object of Product
        Product p1=new Product();
        p1.setPid(201);
        p1.setPname("Basket");
        p1.setPcolor("Red");
        p1.setPprice(365);
        
        //passing the object of Product in student  
        c1.setProd(p1);
        
        //opening the session
        Session session=factory.openSession();
        
        //starting the transaction
        Transaction tx=session.beginTransaction();
        session.save(c1); //saving the Customer object
        session.save(p1); //saving the Product object
        tx.commit();
        
        session.close();
        factory.close();      
    }
}

