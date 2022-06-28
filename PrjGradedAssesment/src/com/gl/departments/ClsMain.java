package com.gl.departments;

public class ClsMain {

	public static void main(String[] args) {

		//OBJECT OF ADMINDEPARTMENT CLASS
		ClsAdminDepartment Admin =new ClsAdminDepartment();
			
		String departmentName=Admin.departmentName();
		System.out.println(departmentName);
			
		String todaysWork=Admin.getTodaysWork();
		System.out.println(todaysWork);
		
		String deadLine=Admin.getWorkDeadline();
		System.out.println(deadLine);
		
		String isTodayAHoliday=Admin.isTodayAHoliday();
		System.out.println(isTodayAHoliday);
		System.out.println(  "-------------------------------------------------");
		
		//OBJECT OF HRDEPARTMENT CLASS

		ClsHrDepartment Hr=new ClsHrDepartment();
		
		
		String hrDepartmentName=Hr.departmentName();
		System.out.println(hrDepartmentName);
		
		String teamLunch=Hr.doActivity();
		System.out.println(teamLunch);
		
		
		String hrTodaysWork=Hr.getTodaysWork();
		System.out.println(hrTodaysWork);
		
		String hrDeadLine=Hr.getWorkDeadline();
		System.out.println(hrDeadLine);
		
		String hrIsTodayAHoliday=Hr.isTodayAHoliday();
		System.out.println(hrIsTodayAHoliday);
		
		System.out.println(  "-------------------------------------------------");

		
		//OBJECT OF TECHDEPARTMENT CLASS

ClsTechDepartment tech=new ClsTechDepartment();
		
		
		String techDepartmentName=tech.departmentName();
		System.out.println(techDepartmentName);
		
		
		String techTodaysWork=tech.getTodaysWork();
		System.out.println(techTodaysWork);
		
		String techDeadLine=tech.getWorkDeadline();
		System.out.println(techDeadLine);
		
		String techIsTodayAHoliday=tech.isTodayAHoliday();
		System.out.println(techIsTodayAHoliday);
		
		String techStackInfo=tech.getTechStackInformation();
		System.out.println(techStackInfo);
		System.out.println(  "-------------------------------------------------");

		
	}
	

}
