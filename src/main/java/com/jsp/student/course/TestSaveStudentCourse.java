package com.jsp.student.course;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudentCourse {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s= new Student();
		s.setName("sabaat");
		s.setEmail("sabaat25@mail.com");
		
		Course c1=new Course();
		c1.setName("WEBTECH");
		c1.setDuration("1 month");
		
		Course c2=new Course();
		c2.setName("JAVA");
		c2.setDuration("2 month");
		
		Course c3=new Course();
		c3.setName("SQL");
		c3.setDuration("2 month");
		
		
		ArrayList<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		s.setCourses(courses);
		
		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		entityTransaction.commit();
	}
	}