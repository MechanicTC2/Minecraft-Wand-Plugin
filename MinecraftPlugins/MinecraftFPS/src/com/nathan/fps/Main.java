package com.nathan.fps;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Your plugin is now enabled. - Nathan");
		getServer().getPluginManager().registerEvents(new FPSListeners(this), this);
		getCommand("player").setExecutor(new playerCommand());
		
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Your plugin is now disabled. - Nathan");
	}
}
