package com.example;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {
	
	private Hashtable<String, String> hashtable;
	private Enumeration names;
	private String key;
	
	public HashTable() {
		hashtable = new Hashtable<String, String>();
	}
	
	public void setValues(String key, String value) {
	   hashtable.put(key,value);
	}
	
	public void viewHashTable() {
		names = hashtable.keys();
		
		while(names.hasMoreElements()) {
			key = (String) names.nextElement();
			System.out.println("Clave: " +key+ " & Token: " + hashtable.get(key));
		}
	}

}
