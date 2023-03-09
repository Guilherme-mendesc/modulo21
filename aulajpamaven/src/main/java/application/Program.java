package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Person p1 = new Person(null, "Carlos", "carlos@gmail.com");
			Person p2 = new Person(null, "Jose Joao", "joao@gmail.com");
			Person p3 = new Person(null, "Astolfo", "astolfo@gmail.com");
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(p1);
			em.persist(p2);
			em.persist(p3);
			em.getTransaction().commit();
			System.out.println("Done! ");
			em.close();
			emf.close();
			
			

	}

}
