package com.gl.departments;


//ABSTRACT CLASS
public abstract class ClsSuperDepartment {
	
	//ABSTRACT METHODS
	public abstract String departmentName();
	public abstract  String getTodaysWork  ();
	
	public abstract String getWorkDeadline  ();
	
	//CLASS METHOD
	public String isTodayAHoliday  ()
	{
		return "Today is not a holiday";
	}

	

}
