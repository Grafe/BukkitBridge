package org.spout.bridge.bukkit.metadata;

import org.bukkit.entity.Entity;
import org.bukkit.metadata.MetadataStore;
import org.bukkit.metadata.MetadataStoreBase;

public class EntityMetadataStore extends MetadataStoreBase<Entity> implements MetadataStore<Entity> {
	@Override
	protected String disambiguate(Entity entity, String s) {
		throw new UnsupportedOperationException();
	}
}
