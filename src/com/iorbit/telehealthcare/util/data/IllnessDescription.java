package com.iorbit.telehealthcare.util.data;

import java.util.HashMap;

public class IllnessDescription extends HashMap<String, String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void addDescription(String key,String value)
	{
		super.put(key, value);
	}
	
	public String getDescription(String key)
	{
		return super.get(key);
	}


}
