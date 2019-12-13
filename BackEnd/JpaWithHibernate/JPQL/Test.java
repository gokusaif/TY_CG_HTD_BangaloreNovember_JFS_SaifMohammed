
package com.cap.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cap.jpawithhibernate.dto.Movie;

public class Test {
	public static void main(String[] args) {

		//		String query="from Movie";
		String query="from Movie";
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery(query);
//		List<String> l1=q.getResultList();
//		for (String string : l1) {
//			System.out.println(string);
//		}
				List<Movie> l1=q.getResultList();
		
				for (Movie movie : l1) {
					System.out.println(movie.getId());
					System.out.println(movie.getName());
					System.out.println(movie.getRating());
					System.out.println("------------");
				}
		em.close();

	}

}
