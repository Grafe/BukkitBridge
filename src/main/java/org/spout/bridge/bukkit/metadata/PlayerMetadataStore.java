package org.spout.bridge.bukkit.metadata;

import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataStore;
import org.bukkit.metadata.MetadataStoreBase;

public class PlayerMetadataStore extends MetadataStoreBase<Player> implements MetadataStore<Player> {
	@Override
	protected String disambiguate(Player player, String s) {
		throw new UnsupportedOperationException();
	}
}
