package com.infinidium.oracle.admin.transaction.utility;

public final class Util {
	private Util() {}
	
	public static void showException(Exception e) {
		System.err.println(e.getClass().getSimpleName() + " occured. " + " Exception message : " + e.getMessage());				
	}	
}
