package com.GL_GradedAssesment1.Driver;

import com.GL_GradedAssesment1.Departments.AdminDepartment;
import com.GL_GradedAssesment1.Departments.HrDepartment;
import com.GL_GradedAssesment1.Departments.SuperDepartment;
import com.GL_GradedAssesment1.Departments.TechDepartment;

public class Main {

	public static void main(String[] args) {

		// Class Objects
		HrDepartment hr_Object = new HrDepartment();
		TechDepartment tech_Object = new TechDepartment();
		AdminDepartment admin_Object = new AdminDepartment();

		// SuperClass Reference Objects
		SuperDepartment super_admin_Object = new AdminDepartment();
		SuperDepartment super_hr_Object = new HrDepartment();
		SuperDepartment super_tech_Object = new TechDepartment();

		System.out.println(" Welcome to " +admin_Object.departmentName());
		
		System.out.println(admin_Object.getTodayWork());
		System.out.println(admin_Object.getWorkDeadline());
		System.out.println(super_admin_Object.isTodayAHoliday()); // Using Super class reference variable

		System.out.println();

		System.out.println(" Welcome to "+hr_Object.departmentName());
		System.out.println(hr_Object.DoActivity());
		System.out.println(hr_Object.getTodayWork());
		System.out.println(hr_Object.getWorkDeadline());
		System.out.println(super_hr_Object.isTodayAHoliday()); // Using Super class reference variable

		System.out.println();

		System.out.println(" Welcome to "+tech_Object.departmentName());
		System.out.println(tech_Object.getTodayWork());
		System.out.println(tech_Object.getWorkDeadline());
		System.out.println(tech_Object.getTechStackInformation());
		System.out.println(super_tech_Object.isTodayAHoliday()); // Using Super class reference variable

	}
}
