package org.spout.bridge.bukkit.help;

import java.util.Collection;
import java.util.List;

import org.bukkit.help.HelpMap;
import org.bukkit.help.HelpTopic;
import org.bukkit.help.HelpTopicFactory;

public class SimpleHelpMap implements HelpMap {
	@Override
	public HelpTopic getHelpTopic(String s) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<HelpTopic> getHelpTopics() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addTopic(HelpTopic helpTopic) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void clear() {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void registerHelpTopicFactory(Class<?> aClass, HelpTopicFactory<?> helpTopicFactory) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public List<String> getIgnoredPlugins() {
		throw new UnsupportedOperationException();
	}
}
