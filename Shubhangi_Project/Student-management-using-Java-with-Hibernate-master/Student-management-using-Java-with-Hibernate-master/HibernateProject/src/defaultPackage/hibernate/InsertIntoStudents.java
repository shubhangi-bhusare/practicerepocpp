package defaultPackage.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsertIntoStudents 
{
	public InsertIntoStudents(SessionFactory factory,Students s)
	{
		//Create Session
		Session session=factory.getCurrentSession();
		
		//Begin Transaction
		session.beginTransaction();
		
		//Save Data
		session.save(s);
		
		//Commit Transaction
		session.getTransaction().commit();
		
		//Display Successful Message
		System.out.println("Data Successfully Stored into Database.");	
	}
}
