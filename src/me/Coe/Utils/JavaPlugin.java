package me.Coe.Utils;

import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;

public abstract class JavaPlugin extends org.bukkit.plugin.java.JavaPlugin{
	public ConsoleCommandSender getConsoleSender(){
		return getServer().getConsoleSender();
	}
	public PluginManager getPluginManager(){
		return getServer().getPluginManager();
	}
}