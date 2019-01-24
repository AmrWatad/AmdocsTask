package com.example.DataBase.domain;

public class DefectInstanceCount {
	String Name;
	String count;
	
	//-------------------------------------------------constructors-------------------------------------------------------------------------

	
	
	public String getName() {
		return Name;
	}
	/**
	 * 
	 */
	public DefectInstanceCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param count
	 */
	public DefectInstanceCount(String name, String count) {
		Name = name;
		this.count = count;
	}
	
	
	//---------------------------------------------------------------getters and setters---------------------------------------------------------

	
	
	public void setName(String name) {
		Name = name;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
}
