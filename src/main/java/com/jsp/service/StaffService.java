package com.jsp.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dao.StaffDao;
import com.jsp.dto.Staff;

public class StaffService {

	StaffDao sd = new StaffDao();

	public Staff saveStaff(Staff s) {
		sd.saveStaff(s);
		return s;
	}

	public void getAllStaff() {
		sd.getAllStaff();
	}

	public Staff deletestaff(Staff delete) {
		return sd.deletestaff(delete);
	}

	public Staff updatestaff(Staff update) {
		return sd.updateStaff(update);

	}

}
