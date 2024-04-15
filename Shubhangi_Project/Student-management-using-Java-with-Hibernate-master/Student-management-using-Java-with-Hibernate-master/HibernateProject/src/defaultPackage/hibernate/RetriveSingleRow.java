package defaultPackage.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class RetriveSingleRow {
	public RetriveSingleRow(SessionFactory factory,int x)
	{
		//Create Session
		Session session=factory.getCurrentSession();
		
		//Begin Transaction
		session.beginTransaction();
		
		//Retrieve Data
		Students myStudent = session.get(Students.class, x);
		
		//Display Data
		System.out.println(myStudent);
		
		//Commit the transaction
		session.getTransaction().commit();
		
	}
}
