package com.cap.jpawithhibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cap.jpawithhibernate.dto.Movie;

public class CRUDHibernate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		while(true) {
			System.out.println("1.Retrive\n 2.insert\n 3.update\n 4.delete");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: //retrive
				System.out.println("enter primary key to retrive");
				Movie rs=entityManager.find(Movie.class,sc.nextInt());
				System.out.println(rs.getId());
				System.out.println(rs.getName());
				System.out.println(rs.getRating());
				break;
			case 2: //insert
				System.out.println("enter values to insert");
				Movie mo=new Movie();
				System.out.println("Enter movie id");
				mo.setId(sc.nextInt());
				System.out.println("Enter movie name");
				mo.setName(sc.next());
				System.out.println("Enter movie rating");
				mo.setRating(sc.next());
				transaction.begin();
				entityManager.persist(mo);
				transaction.commit();
				System.out.println("data inserted");
				break;
			case 3: //update
				System.out.println("Enter the primary key to update values ");
				transaction.begin();
				Movie mo1=entityManager.find(Movie.class, sc.nextInt());
				System.out.println("enter the name and rating to be updated");
				mo1.setName(sc.next());
				mo1.setRating(sc.next());
				transaction.commit();
				System.out.println("data updated");
				break;
			case 4:  //delete
				System.out.println("enter primary key to delete");
				Movie del=entityManager.find(Movie.class, sc.nextInt());
				transaction.begin();
				entityManager.remove(del);
				transaction.commit();
				System.out.println("deleted");
				break;
			default:
				break;
			}
		}
	}

}
