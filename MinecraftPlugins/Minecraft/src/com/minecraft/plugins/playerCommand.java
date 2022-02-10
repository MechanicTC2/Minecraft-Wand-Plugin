package com.minecraft.plugins;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playerCommand extends OtherStuff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player) sender;
		if (args[0].equalsIgnoreCase("Portal")) {
			if (args[1].equalsIgnoreCase("createNetherPortal")) {
				double x1 = Double.parseDouble(args[2]);
				double y1 = Double.parseDouble(args[3]);
				double z1 = Double.parseDouble(args[4]);
				double x2 = Double.parseDouble(args[5]);
				double y2 = Double.parseDouble(args[6]);
				double z2 = Double.parseDouble(args[7]);
				Portal nether_portal = new Portal();
				nether_portal.NetherPortal(x1, y1, z1, x2, y2, z2);
			}
			if (args[1].equalsIgnoreCase("createEndPortal")) {
				double x1 = Double.parseDouble(args[2]);
				double y1 = Double.parseDouble(args[3]);
				double z1 = Double.parseDouble(args[4]);
				double x2 = Double.parseDouble(args[5]);
				double z2 = Double.parseDouble(args[6]);
				Portal end_portal = new Portal();
				end_portal.EndPortal(x1, y1, z1, x2, z2);
			}
		}
		if (args[0].equalsIgnoreCase("give")) {
			if (args[1].equalsIgnoreCase("netherWand")) {
				player.getInventory().addItem(netherWand());
			}
			if (args[1].equalsIgnoreCase("endWand")) {
				player.getInventory().addItem(endWand());
			}
		}
		return false;
	}

}
