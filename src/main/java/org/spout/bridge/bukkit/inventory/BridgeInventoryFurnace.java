package org.spout.bridge.bukkit.inventory;

import org.bukkit.block.Furnace;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.ItemStack;

public class BridgeInventoryFurnace extends BridgeInventory implements FurnaceInventory {
	@Override
	public ItemStack getResult() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public ItemStack getFuel() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public ItemStack getSmelting() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void setFuel(ItemStack itemStack) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void setResult(ItemStack itemStack) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void setSmelting(ItemStack itemStack) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public Furnace getHolder() {
		return null;
	}
}