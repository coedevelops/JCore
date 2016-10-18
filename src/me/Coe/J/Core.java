package me.Coe.J;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bukkit.Bukkit;

import me.Coe.Utils.JavaPlugin;

public final class Core extends JavaPlugin{
	public static final ExecutorService Executor = Executors.newCachedThreadPool();
	public void onEnable(){
		Bukkit.getConsoleSender().sendMessage("§0§l[§bJ§eCore§0§l] §7Carregado!");
	}
	public void onDisable(){
		Bukkit.getConsoleSender().sendMessage("§0§l[§bJ§eCore§0§l] §7Descarregado!");
	}
	public void onLoad(){
		Bukkit.getConsoleSender().sendMessage("§0§l[§bJ§eCore§0§l] §7Carregando ..");
	}
}