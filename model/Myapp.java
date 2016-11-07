package model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Myapp {
	
	public static void main(String arg[])
	{
		
			//declare a session factory object
		SessionFactory fc;
		//create a configuration object 
		
		Configuration c = new Configuration();
		fc=c.configure().buildSessionFactory();
		 @SuppressWarnings("deprecation")
		 Session session = fc.openSession();
	
		 Transaction  tx=session.beginTransaction();
		 
		 System.out.println("Session Is Opened :: "+session.isOpen());
		 System.out.println(session.isConnected());
		 Admin A =new Admin();
		 Task t= new Task();
		 Beneficiare b=new Beneficiare();
		 Project p=new Project();
		 Resource r=new Resource();
		 Volunteer v=new Volunteer();
		 tx.commit();
		 session.close();
		 fc.close();

}
}
