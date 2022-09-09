package com.infinidium.oracle.admin.transaction.utility;

public enum ExceptionMessageType {
	  FIND_BY_ID("Entity could not be found.")
	, INSERT("Entity could not be inserted.")
	, DELETE("Delete operation could not be successful.")
	, Update("Update operation could not be successful.");

	private String value;
	ExceptionMessageType(String value) {
		this.value = value;		
	}
	public String getValue() {
		return value;
	}	
}
