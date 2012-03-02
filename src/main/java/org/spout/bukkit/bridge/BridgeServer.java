/*
 * This file is part of BukkitBridge (http://www.spout.org/).
 *
 * BukkitBridge is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BukkitBridge is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.spout.bukkit.bridge;

import com.avaje.ebean.config.ServerConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;

import java.io.File;
import java.util.logging.Logger;
import org.spout.api.Spout;

public class BridgeServer implements Server {

    @Override
    public String getName() {
        return Spout.getGame().getName();
    }

    @Override
    public String getVersion() {
        return Spout.getGame().getVersion();
    }

    @Override
    public String getBukkitVersion() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Player[] getOnlinePlayers() {
        return new Player[0];  //TODO: Adjust for usage with Spout!
    }

    @Override
    public int getMaxPlayers() {
        return Spout.getGame().getMaxPlayers();
    }

    @Override
    public int getPort() {
        return 0;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public int getViewDistance() {
        return 0;
    }

    @Override
    public String getIp() {
        return Spout.getGame().getAddress();
    }

    @Override
    public String getServerName() {
        return null; //TODO: Adjust for usage with Spout!
    }

    @Override
    public String getServerId() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean getAllowEnd() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean getAllowNether() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean hasWhitelist() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void setWhitelist(boolean b) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public Set<OfflinePlayer> getWhitelistedPlayers() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void reloadWhitelist() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public int broadcastMessage(String message) {
        Spout.getGame().broadcastMessage(message);
        return Spout.getGame().getOnlinePlayers().length;
    }

    @Override
    public String getUpdateFolder() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public File getUpdateFolderFile() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public int getTicksPerAnimalSpawns() {
        return 0;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public int getTicksPerMonsterSpawns() {
        return 0;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Player getPlayer(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Player getPlayerExact(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public List<Player> matchPlayer(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public PluginManager getPluginManager() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public BukkitScheduler getScheduler() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public ServicesManager getServicesManager() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public List<World> getWorlds() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public World createWorld(WorldCreator worldCreator) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean unloadWorld(String s, boolean b) {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean unloadWorld(World world, boolean b) {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public World getWorld(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public World getWorld(UUID uuid) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public MapView getMap(short i) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public MapView createMap(World world) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void reload() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public Logger getLogger() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public PluginCommand getPluginCommand(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void savePlayers() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean dispatchCommand(CommandSender commandSender, String s) throws CommandException {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void configureDbConfig(ServerConfig serverConfig) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean addRecipe(Recipe recipe) {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public List<Recipe> getRecipesFor(ItemStack itemStack) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Iterator<Recipe> recipeIterator() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void clearRecipes() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public void resetRecipes() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public Map<String, String[]> getCommandAliases() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public int getSpawnRadius() {
        return 0;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void setSpawnRadius(int i) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean getOnlineMode() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean getAllowFlight() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public boolean useExactLoginLocation() {
        return false;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void shutdown() {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public int broadcast(String s, String s1) {
        return 0;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public OfflinePlayer getOfflinePlayer(String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Set<String> getIPBans() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void banIP(String s) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public void unbanIP(String s) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public Set<OfflinePlayer> getBannedPlayers() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Set<OfflinePlayer> getOperators() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public GameMode getDefaultGameMode() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void setDefaultGameMode(GameMode gameMode) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public ConsoleCommandSender getConsoleSender() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public File getWorldContainer() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public OfflinePlayer[] getOfflinePlayers() {
        return new OfflinePlayer[0];  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Messenger getMessenger() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public HelpMap getHelpMap() {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, InventoryType inventoryType) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public Inventory createInventory(InventoryHolder inventoryHolder, int i, String s) {
        return null;  //TODO: Adjust for usage with Spout!
    }

    @Override
    public void sendPluginMessage(Plugin plugin, String s, byte[] bytes) {
        //TODO: Adjust for usage with Spout!
    }

    @Override
    public Set<String> getListeningPluginChannels() {
        return null;  //TODO: Adjust for usage with Spout!
    }
}