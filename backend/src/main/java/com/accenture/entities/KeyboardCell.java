package com.accenture.entities;

import java.io.Serializable;

public class KeyboardCell implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String value;

	public KeyboardCell() {
	}

	public KeyboardCell(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	} 
}
