package com.gl.departments;


//DERIVED CLASS OF SUPER DEPARTMENT CLASS
public class ClsAdminDepartment extends ClsSuperDepartment{

	//OVERRIDING METHODS OF ABSTRACT CLASS
	@Override
	public String departmentName() {
	String msg="Welcome to Admin Department ";
	return msg;
	}

	@Override
	public String getTodaysWork() {
		
		String msg="Complete your documents Submission";
		return msg;
	}

	@Override
	public String getWorkDeadline() {
		
		String msg="Complete by EOD";
		return msg;
	}
	

}
