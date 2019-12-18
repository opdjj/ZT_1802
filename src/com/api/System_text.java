package com.api;

import java.util.*;

public class System_text {

	public static void main(String[] args) {
		Properties	propertise=System.getProperties();
		System.out.println(propertise);
		Set<String> PropertyName=propertise.stringPropertyNames();
		for(String key:PropertyName) {
			String value=System.getProperty(key);
			System.out.println(key+"--->"+value);
		}

	}

}
