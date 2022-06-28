package com.gl.departments;


//DERIVED CLASS OF SUPER DEPARTMENT CLASS

public class ClsTechDepartment extends ClsSuperDepartment {

	//OVERRIDING METHODS OF ABSTRACT CLASS

	
	@Override
	public String departmentName() {
		
		String msg="Welcome to Technical Department ";
		return msg;
	}
	

	@Override
	public String getTodaysWork() {
		
		String msg="Complete coding of module one ";
		return msg;
	}

	@Override
	public String getWorkDeadline() {
		
		String msg="Complete by end of the day ";
		return msg;
		
	}
	
	//CLASS METHOD
	public String getTechStackInformation()
	{
		String msg="Core Java";
		return msg;
	}
}

