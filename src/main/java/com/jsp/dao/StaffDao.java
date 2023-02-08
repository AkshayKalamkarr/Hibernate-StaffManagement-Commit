package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Staff;
import com.mysql.cj.Query;

public class StaffDao {
	public Staff saveStaff(Staff s) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Akshay");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(s);
		et.commit();
		return s;
	}

	public Staff deletestaff(Staff delete) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Akshay");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Staff s = em.find(Staff.class, delete.getId());
		et.begin();
		em.remove(s);
		et.commit();

		System.out.println("object sucessfully removed");
		return delete;

	}

	public Staff updateStaff(Staff update) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Akshay");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Staff s1 = em.find(Staff.class, update.getId());

		if (s1 != null) {
			s1.setName(update.getName());
			et.begin();
			em.merge(s1);
			et.commit();
			System.out.println("Staff update");

		} else {
			System.out.println("staff not found");
		}
		return update;

	}

	public void getAllStaff() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Akshay");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		String sql = "select s from Staff s";

		javax.persistence.Query q = em.createQuery(sql);

		List<Staff> Staffs = q.getResultList();

		for (Staff s1 : Staffs) {
			System.out.println("========");
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getEmail());
		}
	}

}
