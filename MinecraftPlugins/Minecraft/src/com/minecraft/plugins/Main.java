package com.minecraft.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Your plugin is now enabled. - Kenneth");
		getServer().getPluginManager().registerEvents(new Listeners(), this);
		getCommand("player").setExecutor(new playerCommand());
	}
	
	@Override
	public void onDisable() {
		System.out.println("Your plugin is now disabled. - Kenneth");
	}
}