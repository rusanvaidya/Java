package com.stud_info;
class college_info
{
	public String college;
	public String address;
	
	college_info(String college, String address)
	{
		this.college = college;
		this.address = address; 
	}
}

public class student_info extends college_info
{
	public student_info(String c, String a)
	{
		super(c,a);
	}
	
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}