package defaultPackage.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class RetriveWholeTable 
{
	 @SuppressWarnings("unchecked")
	public RetriveWholeTable(SessionFactory factory)
	 {
		 //Create Session
		 Session session=factory.getCurrentSession();
		 
		 //begin Transaction
		 session.beginTransaction();
		 
		 // query students 
		 //Note: following string "from students" in which the Students is the Class Name which we map to the database Table
		 List<Students> theStudents = session.createQuery("from Students").getResultList();
		 
		 // display the students
		 displayStudents(theStudents);
		 
		 //Commit the Transaction
		 session.getTransaction().commit();
	 }
	 private static void displayStudents(List<Students> theStudents) {
		 //for student number
		int x=1;
		//Enhanced for loop for display each student data
		for (Students Student : theStudents) {
			//display student
			System.out.println("Student "+x+":-"+Student);
			
			//increment student count
			x++;
			
		}
	}
}
