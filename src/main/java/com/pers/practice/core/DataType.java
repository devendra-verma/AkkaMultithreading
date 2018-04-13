package com.pers.practice.core;

public enum DataType {

	GET("GET"),
	PROCESS("PROCESS");
	
	public String name;
	
	DataType(String name) {
		this.name =name;
	}
	
	public String getDescription() {
		return this.name;
	}
}
