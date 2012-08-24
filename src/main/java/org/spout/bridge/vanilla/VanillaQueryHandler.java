package org.spout.bridge.vanilla;

import org.spout.bridge.module.query.Query;

public class VanillaQueryHandler {
	@SuppressWarnings("unused")
	private final VanillaModule module;
	private final VanillaConfigurationQueryHandler config;
	private final VanillaBlockQueryHandler block;
	
	public VanillaQueryHandler(VanillaModule module) {
		this.module = module;
		config = new VanillaConfigurationQueryHandler(module);
		block = new VanillaBlockQueryHandler(module);
	}
	
	public <T> void processQuery(Query<T> query) {
		String name = query.getName();//All processing is done based off of the name, NOT the class.
		String prefix = findPrefix(name);
		String body = findBody(name);
		if(prefix.equals("Configuration")) config.processQuery(query, body);
		else if(prefix.equals("Block")) block.processQuery(query, body);
		else throw new IllegalArgumentException("The given prefix \"" + prefix + "\" is invalid.");
	}
	
	private String findPrefix(String name) {
		int end = name.indexOf(": ");
		if(end < 0) throw new IllegalArgumentException("The given query name \"" + name + "\" is invalid because it does not contain a prefix.");
		return name.substring(0, end);
	}
	
	private String findBody(String name) {
		int end = name.indexOf(": ");
		if(end < 0) throw new IllegalArgumentException("The given query name \"" + name + "\" is invalid because it does not contain a prefix.");
		if(end + 2 >= name.length()) throw new IllegalArgumentException("The given query name \"" + name + "\" is invalid because it does not contain a body.");
		return name.substring(end + 2);
	}
}
