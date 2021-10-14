package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Disciplina;
import model.Professor;

public class Programa {
	public static void main(String[] args) {

		Professor p1 = new Professor(null, "Bruno Oliveira");
		Professor p2 = new Professor(null, "Beto Gonçalves");
		Professor p3 = new Professor(null, "Aline Martins");

		Disciplina d1 = new Disciplina(null, "Engenharia Softwere", "ENGSF", 60);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		

		em.getTransaction().begin();

		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		em.persist(d1);

		em.getTransaction().commit();

		em.close();

		emf.close();

	}
}
