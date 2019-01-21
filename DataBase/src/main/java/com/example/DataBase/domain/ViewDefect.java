package com.example.DataBase.domain;

public class ViewDefect{

	String defCode;
	String severity;

//---------------------------------------------------------------getters and setters---------------------------------------------------------
	

	public String getDefCode() {
		return defCode;
	}
	public void setDefCode(String defCode) {
		this.defCode = defCode;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}

//------------------------------------------------------constructors------------------------------------------------------------------------
	
	public ViewDefect() {}
	
	public ViewDefect(String defCode, String severity) {
		super();
		this.defCode = defCode;
		this.severity = severity;
	}
	
	

}
