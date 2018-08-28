package main.hibernate.practice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			//Save
//			Student student = new Student("Mirza", "Lgfk", "mirza@gmail.com");
//			session.beginTransaction();
//			session.save(student);
//			
//			Student student2 = session.get(Student.class, student.getId()); 
//			session.getTransaction().commit();
//			
//			System.out.println("Ime je " + student2.getFirstName());
			
			//Read from 
//			session.beginTransaction();
//			List<Student> lista = session.createQuery("from Student s where s.lastName='Mustafic'"
//					+ " or s.firstName='Hasan'")
//					.getResultList();
//			
//			session.getTransaction().commit();
			
//			for (Student s : lista) {
//				System.out.println(s.getFirstName());
//			}
			
			//Update single
//			session.beginTransaction();
//			Student student = session.get(Student.class, 2);
//			student.setFirstName("Hasan");
//			session.getTransaction().commit();
			
			//Update all
//			session.beginTransaction();
//			session.createQuery("update Student s set s.email='hasan@gmail.com' where s.firstName='Hasan' ")
//			.executeUpdate();
//			session.getTransaction().commit();
			
			//Delete single
//			session.beginTransaction();
//			Student student = session.get(Student.class, 2);
//			session.delete(student);
//			session.getTransaction().commit();
			
			//Delete all
//			session.beginTransaction();
//			session.createQuery("delete from Student where id=2").executeUpdate();
//			session.getTransaction().commit();
			
			
		}finally {
			factory.close();
		}
	}
}
