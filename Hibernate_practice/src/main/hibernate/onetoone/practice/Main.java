package main.hibernate.onetoone.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernateonetoone.cfg.xml")
				.addAnnotatedClass(Instructor.class).
				addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
//			Instructor instructor1 = 
//					new Instructor("Mustafa", 
//							"Mustafic", 
//							"mustafa@gmail.com", 
//							new InstructorDetail("www.facebook.com\\mustafa", "fudbal"));
//			
//			
//			session.beginTransaction();
//			session.save(instructor1);
//			session.getTransaction().commit();
			
//			session.beginTransaction();
//			Instructor instructor = session.get(Instructor.class, 1);
//			if(instructor != null)
//				
//			session.getTransaction().commit();
			
//			session.beginTransaction();
//			InstructorDetail detail = session.get(InstructorDetail.class, 1);
//			System.out.println("Detalj : " + detail.getFacebook());
//			System.out.println("Instruktor : " + detail.getInstructor().getFirstName());
//			session.getTransaction().commit();
			
			
			
		}finally {
			sessionFactory.close();
		}
	}
}
