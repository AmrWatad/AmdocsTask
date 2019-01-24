package com.example.DataBase.domain;

public class AppCount {
	String Name;
	String count;
		//---------------------------------------------------------------getters and setters---------------------------------------------------------

	public String getAppName() {
		return Name;
	}

	public void setAppName(String appName) {
		this.Name = appName;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}
	
	
	
	//------------------------------------------------------constructors------------------------------------------------------------------------

		/**
		 * 
		 */
		public AppCount() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param appName
		 * @param count
		 */
		public AppCount(String appName,String count) {
			this.Name = appName;
			this.count = count;
		}

}
