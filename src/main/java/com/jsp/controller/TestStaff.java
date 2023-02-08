package com.jsp.controller;

import com.jsp.dto.Staff;
import com.jsp.service.StaffService;

public class TestStaff {
	public static void main(String[] args) {
		StaffService ss = new StaffService();
		// ss.getAllStaff();

		// for save
		Staff s = new Staff();
		s.setId(1);
		s.setName("akshay");
		s.setEmail("abc@gmail.com");
		s.setTotalpaid(20000);
		s.setBalaced(1000);
		// ss.saveStaff(s);

		// for
		// delete------------------------------------------------------------------------------------------------
		Staff delete = new Staff();
		delete.setId(1);
		// ss.deletestaff(delete);

		// for update
		Staff update = new Staff();
		update.setId(1);
		update.setName("pratham");
		ss.updatestaff(update);
	}
}
