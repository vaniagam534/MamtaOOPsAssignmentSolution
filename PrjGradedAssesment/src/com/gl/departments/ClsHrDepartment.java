package com.gl.departments;


//DERIVED CLASS OF SUPER DEPARTMENT CLASS

public class ClsHrDepartment extends ClsSuperDepartment {

	
	//OVERRIDING METHODS OF ABSTRACT CLASS
	@Override
	public String departmentName() {
		
		String msg="Welcome to HR Department ";
		return msg;
	}

	@Override
	public String getTodaysWork() {
		
		String msg="Fill today’s timesheet and mark your attendance ";
		return msg;
	}

	@Override
	public String getWorkDeadline() {
		
		String msg="Complete by EOD ";
		return msg;
	}
	
	//CLASS METHOD
	public String doActivity()
	{
		String msg="Team Lunch";
		return msg;

}}
