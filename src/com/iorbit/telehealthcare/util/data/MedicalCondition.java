package com.iorbit.telehealthcare.util.data;

import java.util.HashMap;

public class MedicalCondition extends HashMap<String, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void addCondition(String key, String value) {
		super.put(key, value);
	}

	public String getCondition(String key) {
		return super.get(key);
	}

}
