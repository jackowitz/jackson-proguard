package org.jackowitz.jackson.proguard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) {
		final ObjectMapper mapper = new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter();
		
		final Model model = new Model("used", "unused");
		System.out.println(model.getUsedXX()); // Ensure actually used.
		try {
			System.out.println(mapper.writeValueAsString(model));
		} catch (JsonProcessingException exception) {
			System.err.println(exception);
		}
	}
}
